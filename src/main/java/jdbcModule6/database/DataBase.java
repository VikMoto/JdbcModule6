package jdbcModule6.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static DataBase instance;
    private Connection connection;


    private DataBase() {
        connect();
    }

    public static synchronized DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    private void connect(){
        String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
        String dbUser = "postgres";
        String dbPass = "postgres";
        try {
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);

        }catch (SQLException e) {
            System.err.println("Не вдалося підключитися до БД: " + e.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }


}
