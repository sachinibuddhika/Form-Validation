package serviceImplement;

import dbUtil.DBUtil;
import org.springframework.stereotype.Service;
import service.EmployeeService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //define constructor to get called the database
    Connection connection;

    //initialize a flag to set status of input from user to validate
    int flag=0;


    //set connection get from DBUtil package and connection method
    public EmployeeServiceImpl()
    {
        connection= DBUtil.getConnection();
    }


    //validate user whether username and password are correct, else throw exception
    @Override
    public int loginValidation(String userName, String password) {
        try
        {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM employees WHERE userName=' " + userName + "'");
            ResultSet rs = statement.executeQuery();

            while (rs.next())
              {
                 if (rs.getString(6).equals(userName) && rs.getString(7).equals(password))
                 {
                 flag=1;
                 }
                 else
                 {
                     System.out.println("Invalid username or password!");
                 }

              }

        }

        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
