package jdbcModule6.selectQueries;

import lombok.Data;

@Data
public class LongestProject implements SelectQueries{
//    name, project_id, tempTable.interval_month AS timeMonth

    private String name;
    private long project_id;
    private long timeMonth;

    public LongestProject(String name, long project_id, long timeMonth) {
        this.name = name;
        this.project_id = project_id;
        this.timeMonth = timeMonth;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", project_id=" + project_id +
                ", timeMonth=" + timeMonth +
                '}';
    }
}
