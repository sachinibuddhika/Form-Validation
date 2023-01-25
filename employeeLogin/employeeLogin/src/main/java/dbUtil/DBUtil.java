package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    //initially the connection is null
    private static Connection connection=null;

    //connection logic
    public static Connection getConnection()  {
       if(connection!=null){
           return connection;
       }
       else{
           String driver="com.mysql.cj.jdbc.Driver";
           String url="jdbc:mysql://localhost:3306/employeeLogin";
           String user="root";
           String password="Sachini123@";

           //for exception handling
           try {
               Class.forName(driver);
               connection= DriverManager.getConnection(url,user,password);
           } catch (ClassNotFoundException | SQLException e) {
               throw new RuntimeException(e);
           }
       }

        return connection;
    }
}
