package ir.mina.transportation.employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeServiceImpl {

    @PostMapping("/Login")
    public boolean isAuthenticated(String username, String password){

        return username != null && password != null;
    }

}
