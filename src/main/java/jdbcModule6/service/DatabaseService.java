package jdbcModule6.service;

public class DatabaseService {
//        public static void readQueryFromDatabase(String pathSql, SelectQueries selectQueries) {
//        List<SelectQueries> result = new ArrayList<>();
//
//        try (Connection conn = Database.getInstance().getConnection();
//             Statement statement = conn.createStatement()) {
//
////            System.out.println("pathSql = " + pathSql);
//
//            String sql = ExecuteService.readFileSql(pathSql);
//
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            result = readRows(result, resultSet);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//        return  result;
//    }
//
//    private static <T extends SelectQueries> List<T> readRows(List<T> result, ResultSet resultSet) throws SQLException {
//        while (resultSet.next()) {
//            String name = resultSet.getString("c_lient");
//            int client_max = resultSet.getInt("client_max");
//
//            result.add(new MaxProjectCountClient(name,client_max));
//
//        }
//        return result;
//    }
}
