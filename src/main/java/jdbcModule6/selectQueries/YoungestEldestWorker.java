package jdbcModule6.selectQueries;

import lombok.Data;

@Data
public class YoungestEldestWorker {
    private String type;

    private String name;
    private String burthday;

    public YoungestEldestWorker(String type, String name, String burthday) {
        this.type = type;
        this.name = name;
        this.burthday = burthday;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", burthday='" + burthday + '\'' +
                '}';
    }
}
