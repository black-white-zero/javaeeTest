package dao;

import utils.DataBaseUtil;
import beans.UserBean;

import java.sql.*;

public class UserDao {

    public boolean isUserExist(String username) {
        //create a connection
        Connection connection = DataBaseUtil.getConnection();

        String sql ="select * from user WHERE username=?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet resultSet = ps.executeQuery();
            if(!resultSet.next()) {
                return true;
            }
        }catch(SQLException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            DataBaseUtil.closeConnection(connection);
        }
        return false;
    }

    public boolean isPasswordConfirm(String password, String repassword) {
        return password.equals(repassword);
    }

    public void saveUser(UserBean user) {
        Connection connection = DataBaseUtil.getConnection();

        String sql = "insert into user (username, passwd) values(?,?) ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());

            ps.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            DataBaseUtil.closeConnection(connection);
        }
    }
}