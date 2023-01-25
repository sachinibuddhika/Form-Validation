package service;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeService {

    //defining methods for services
    public int loginValidation(String userName, String password);

}
