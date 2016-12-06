package sandwich;

import connect.DBConnect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.customer;
import tools.MD5;

public class customerSW {
    public boolean checkEmail(String email){
        Connection connection = DBConnect.getConnecttion(); 
        String sql = "SELECT * FROM customer where `Status`=TRUE && Email = '" + email +"'" ;
        PreparedStatement ps;
        try{
            ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                connection.close();
                return true;
            }
        } catch (SQLException ex){
            Logger.getLogger(customerSW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean checkUser(String user){
        Connection connection = DBConnect.getConnecttion(); 
        String sql = "SELECT * FROM customer where `Status`=TRUE && Username = '" + user +"'" ;
        PreparedStatement ps;
        try{
            ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                connection.close();
                return true;
            }
        } catch (SQLException ex){
            Logger.getLogger(customerSW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // phương thức thêm tài khoản 
    public boolean insertUser(customer u) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?)";
        //String count = "select COUNT(*) FROM customer";
        //int c = Integer.parseInt(count);
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, u.getIDcus());
            ps.setString(2, u.getTen());
            ps.setString(3, u.getUser());
            ps.setString(4, u.getPass());
            ps.setString(5, u.getDT());
            ps.setString(6, u.getDiachi());
            ps.setString(7, u.getEmail());
            ps.setBoolean(8, u.getStatus());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(customerSW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 
    // kiểm tra đăng nhập
    public customer login(String user, String pass) {
        Connection con = DBConnect.getConnecttion();
        String sql = "SELECT * FROM customer WHERE Username = '" + user + "' && `Password` = '" + pass + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customer u = new customer();
                u.setIDcus(rs.getLong("ID_Customer"));
                u.setTen(rs.getString("Name"));
                u.setEmail(rs.getString("Email"));
                u.setUser(rs.getString("Username"));
                u.setPass(rs.getString("Password"));
                u.setStatus(rs.getBoolean("Status"));
                con.close();
                return u;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
