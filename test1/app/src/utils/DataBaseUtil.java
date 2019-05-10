package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {

    public static Connection getConnection() {
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/users_test";
            connection = DriverManager.getConnection(url, "--你的数据库用户名--", "--你的数据库密码--");
            return connection;

        }catch(ClassNotFoundException nfe) {
            nfe.printStackTrace();
        }catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if(connection != null) {
            try{
                connection.close();
            }catch(SQLException sqle) {
                sqle.printStackTrace();
            }
        }
    }
}