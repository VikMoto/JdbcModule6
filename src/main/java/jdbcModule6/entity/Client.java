package jdbcModule6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Client {
    private long id;
    private String name;

    public Client() {
    }
}
