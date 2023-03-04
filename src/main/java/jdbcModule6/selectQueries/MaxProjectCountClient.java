package jdbcModule6.selectQueries;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MaxProjectCountClient implements SelectQueries {
    private String name;
    private int projectCount;

    public MaxProjectCountClient(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
