package jdbcModule6.selectQueries;

import lombok.Data;

@Data
public class PrintProjectPrices {
//    client_name,
//       pr_id,
//       salary,
//       interval_month,
//       salary * interval_month                                AS PRICE,
//       count(pr_id) OVER (PARTITION BY pr_id),
//       sum(salary * interval_month) OVER (PARTITION BY pr_id),
//       count(pr_id) OVER (PARTITION BY pr_id) *
//       sum(salary * interval_month) OVER (PARTITION BY pr_id) AS TOTAL
    private String clientName;
    private long projectId;
    private long salary;
    private long intervalInMonth;
    private long totalCost;

    public PrintProjectPrices(String clientName, long projectId, long salary, long intervalInMonth, long totalCost) {
        this.clientName = clientName;
        this.projectId = projectId;
        this.salary = salary;
        this.intervalInMonth = intervalInMonth;
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "{" +
                "clientName='" + clientName + '\'' +
                ", projectId=" + projectId +
                ", salary=" + salary +
                ", intervalInMonth=" + intervalInMonth +
                ", totalCost=" + totalCost +
                '}';
    }
}
