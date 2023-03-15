import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());

//            Make connection

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

//            Create Statement

            Statement statement = connection.createStatement();

//            run query with statement and parse result set

            String query = "select * from albums;";

            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()){
                System.out.println(resultSet.getString("artist"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
