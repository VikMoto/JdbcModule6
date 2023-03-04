package jdbcModule6;

import jdbcModule6.service.DatabaseInitService;

public class App {
    public static void main(String[] args) {
        new DatabaseInitService().initDb();

    }
}
