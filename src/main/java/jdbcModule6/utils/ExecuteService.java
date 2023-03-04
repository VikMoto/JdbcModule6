package jdbcModule6.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Collectors;

import static jdbcModule6.service.DatabaseInitService.Database;

public class ExecuteService {

    public static void executeSqlFile(String pathSql) {
        try (Connection conn = Database.getInstance().getConnection();
             Statement statement = conn.createStatement()) {
            System.out.println("pathSql = " + pathSql);

            String sql = readFileSql(pathSql);

            String[] queries = sql.split(";");

//             Виконуємо кожний SQL-запит
            for (String query : queries) {
                if (query.trim().length() > 0) {
                    try  {
                        statement.execute(query);
                    } catch (SQLException e) {
                        System.err.println("Помилка виконання SQL-запиту: " + e.getMessage());
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void executeSelectSqlFile(String pathSql) {
        try (Connection conn = Database.getInstance().getConnection();
             Statement statement = conn.createStatement()) {

            String sql = readFileSql(pathSql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

            }
//             Виконуємо кожний SQL-запит


        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String readFileSql(String pathSqlFile) throws IOException {
        String sql = Files.readAllLines(Path.of(pathSqlFile))
                .stream()
                .collect(Collectors.joining(" "));
//        System.out.println("sql = " + sql);
        return sql;
    }
}
