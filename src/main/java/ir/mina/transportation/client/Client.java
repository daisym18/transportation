package ir.mina.transportation.client;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Client {
//    @Id
    private Long id;
    private String name;
    private String family;
    private String email;
    private String address;
    private String mobileNumber;
    private String username;
    private String password;

}
