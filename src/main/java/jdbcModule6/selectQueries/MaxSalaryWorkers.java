package jdbcModule6.selectQueries;

import lombok.Data;

@Data
public class MaxSalaryWorkers implements SelectQueries{
    private String name;

    private long salary;

    public MaxSalaryWorkers(String name, long maxSalary) {
        this.name = name;
        this.salary = maxSalary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", maxSalary=" + salary +
                '}';
    }
}
