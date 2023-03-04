package jdbcModule6.utils;

import java.io.File;

public class Prefs {

    public static final String INIT_DB_FILENAME = "./Sql/init_db.sql";
    public static final String POPULATE_INSERT_DB_FILENAME = "./Sql/populate_db.sql";
    public static final String FIND_MAX_PROJECTS_CLIENT_SQL_DB_FILENAME = "./Sql/find_max_projects_client.sql";
    public static final String FIND_LONGEST_PROJECT_DB_FILENAME = "./Sql/find_longest_project.sql";
    public static final String FIND_MAX_SALARY_WORKER_DB_FILENAME = "./Sql/find_max_salary_worker.sql";
    public static final String YOUNGEST_ELDEST_WORKER_DB_FILENAME = "./Sql/find_youngest_eldest_workers.sql";
    public static final String PRINT_PROJECT_PRICES_DB_FILENAME = "./Sql/print_project_prices.sql";


    public static void main(String[] args) {
        File directory = new File("./");
            System.out.println("directory.getAbsolutePath() = " + directory.getAbsolutePath());
    }
}
