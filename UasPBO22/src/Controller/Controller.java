/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.User;
public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    // SELECT ALL from table users
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM Users";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setUserId(("userId"));
                user.setUserName(("userName"));
                user.setUserEmail(rs.getString("userEmail"));
                user.setUserGender(rs.getString("userGender"));
                user.setUserCategory(rs.getString("userCategory"));
                user.setUserFollowers(rs.getInt("userFollowers"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }

    // SELECT WHERE
    public static User getUser(String name, String address) {
        conn.connect();
        String query = "SELECT * FROM user WHERE Name='" + name + "'&&Address='" + address + "'";
        User user = new User();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.setUserId(("userId"));
                user.setUserName(("userName"));
                user.setUserEmail(rs.getString("userEmail"));
                user.setUserGender(rs.getString("userGender"));
                user.setUserCategory(rs.getString("userCategory"));
                user.setUserFollowers(rs.getInt("userFollowers"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (user);
    }

    // INSERT
    public static boolean insertNewUser(User user) {
        conn.connect();
        String query = "INSERT INTO users (ID,name,address,phone,age) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, 12);
            stmt.setString(2, "asep");
            stmt.setString(3, "asep@gmail.com");
            stmt.setString(4, "Pria");
            stmt.setString(5, "user");
            stmt.setString(6, "12");
            stmt.executeUpdate();
            System.out.println("eROW");
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("eberW");
            return (false);
        }
    }

//    public static boolean updateUser(User user) {
//        conn.connect();
//        String query = "UPDATE users SET Name='" + user.getName() + "', "
//               ;
//        try {
//            Statement stmt = conn.con.createStatement();
//            stmt.executeUpdate(query);
//            return (true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return (false);
//        }
//    }

    public static boolean deleteUser(String name) {
        conn.connect();

        String query = "DELETE FROM users WHERE Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
