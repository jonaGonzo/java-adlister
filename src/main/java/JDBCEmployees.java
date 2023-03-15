import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployees {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection
                    (
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
//            System.out.println(connection);

            Statement statement = connection.createStatement();

            String query = "select * from employees;";

            ResultSet resultSet = statement.executeQuery(query);
            List <String> arrayList = new ArrayList<>();

            for(int i=0; i < 10; i += 1) {
                resultSet.next();
                  arrayList.add(resultSet.getString("first_name"));
            }
            System.out.println(arrayList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
