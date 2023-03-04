package jdbcModule6.service;

import jdbcModule6.selectQueries.*;
import jdbcModule6.utils.ExecuteService;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static jdbcModule6.service.DatabaseInitService.Database;

public class DataBasePrepareStatementQueryService {
    public static List<PrintProjectPrices> printProjectsPricePrepareSt(String pathSql) {
        List<PrintProjectPrices> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             PreparedStatement statement = conn.prepareStatement(ExecuteService.readFileSql(pathSql))) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String clientName = resultSet.getString("client_name");
                long projectId = resultSet.getLong("pr_id");
                long salary = resultSet.getLong("salary");
                long intervalInMonth = resultSet.getLong("interval_month");
                long totalCost = resultSet.getLong("TOTAL");

                result.add(new PrintProjectPrices(clientName, projectId, salary, intervalInMonth, totalCost));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }


    public static List<YoungestEldestWorker> youngestEldestWorkersPrepareSt(String pathSql) {
        List<YoungestEldestWorker> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             PreparedStatement statement = conn.prepareStatement(ExecuteService.readFileSql(pathSql))) {

//            System.out.println("pathSql = " + pathSql);



            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String type = resultSet.getString("TYPE");
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");

                result.add(new YoungestEldestWorker(type,name,birthday));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }
    public static List<MaxSalaryWorkers> maxSalaryWorkerPrepareSt(String pathSql) {
        List<MaxSalaryWorkers> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             PreparedStatement statement = conn.prepareStatement(ExecuteService.readFileSql(pathSql))) {

//



            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                long salary = resultSet.getLong("salary");
                result.add(new MaxSalaryWorkers(name,salary));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }

    public static List<LongestProject> longestProjectPrepareSt(String pathSql) {
        List<LongestProject> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             PreparedStatement statement = conn.prepareStatement(ExecuteService.readFileSql(pathSql))) {

//            System.out.println("pathSql = " + pathSql);



            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                long project_id = resultSet.getLong("project_id");
                long timeMonth = resultSet.getLong("timeMonth");
                result.add(new LongestProject(name,project_id,timeMonth));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }
    public static List<MaxProjectCountClient> maxProjectCountClientPrepareSt(String pathSql) {
        List<MaxProjectCountClient> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             PreparedStatement statement = conn.prepareStatement(ExecuteService.readFileSql(pathSql))) {


            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("c_lient");
                int client_max = resultSet.getInt("client_max");
                result.add(new MaxProjectCountClient(name,client_max));

            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }
}
