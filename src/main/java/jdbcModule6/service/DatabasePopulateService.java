package jdbcModule6.service;

import jdbcModule6.database.DataBase;
import jdbcModule6.utils.ExecuteService;
import jdbcModule6.utils.Prefs;

public class DatabasePopulateService {
    DataBase dataBase;

    public static void main(String[] args) {
        ExecuteService.executeSqlFile(Prefs.POPULATE_INSERT_DB_FILENAME);
    }
}
