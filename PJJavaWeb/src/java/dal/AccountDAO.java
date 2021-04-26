/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;
import model.Product;

/**
 *
 * @author asus
 */
public class AccountDAO extends DBContext{
    public Account checkAccount(String acc,String pass){
        String sql="select * from Account where username=? and password=?";
        try {
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, acc);
            st.setString(2, pass);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new Account(acc,pass,rs.getString(3),Double.parseDouble(rs.getString(4)),Integer.parseInt(rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Account getAccount(String acc){
        String sql="select * from Account where username=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, acc);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Account(acc, rs.getString(2), rs.getString(3),Double.parseDouble(rs.getString(4)), Integer.parseInt(rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void insert(Account c) {
        String sql = "INSERT INTO  Account\n" + "VALUES (?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getUsername());
            ps.setString(2, c.getPassword());
            ps.setString(3, c.getEmail());
            ps.setDouble(4, c.getCash());
            ps.setInt(5, c.getType());

            ps.execute();
        } catch (Exception e) {
            System.out.println("Loi khi update" + e.getMessage());
        }
    }
    public Account getPass(String acc,String email){
        String sql="select * from Account where username=? and email=?";
        try {
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, acc);
            st.setString(2, email);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new Account(acc,rs.getString(2),email,Double.parseDouble(rs.getString(4)),Integer.parseInt(rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void deductionAcc(String tk,double money){
    String sql="UPDATE Account SET cash=" +money+" WHERE username='"+tk+"'";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            System.out.println("Loi khi tru tien tai khoan"+e);
        }
    }
}
