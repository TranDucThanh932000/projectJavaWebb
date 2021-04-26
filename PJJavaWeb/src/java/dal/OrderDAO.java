/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DetailOrder;
import model.Order;
import model.Product;

/**
 *
 * @author asus
 */
public class OrderDAO extends DBContext{
    public void insertToOrder(Order c) {
        String sql = "INSERT INTO  [Order]\n" + "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getIdOrder());
            ps.setString(2, c.getAccount());
            ps.setDouble(3, c.getTotalmoney());
            ps.setString(4, c.getDate());
            

            ps.execute();
        } catch (Exception e) {
            System.out.println("Loi khi Insert into Order" + e.getMessage());
        }
    } 
    public void insertToDetailOrder(DetailOrder c) {
        String sql = "INSERT INTO  DetailOrder\n" + "VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getOrder().getIdOrder());
            ps.setString(2, c.getProduct().getId());
            ps.setInt(3, c.getQuantityOrder());
            ps.setDouble(4, c.getPrice());
            ps.setDouble(5, c.getSale());
            ps.setDouble(6, c.getMoney());

            ps.execute();
        } catch (Exception e) {
            System.out.println("Loi khi Insert into DetailOrder" + e.getMessage());
        }
    }
    public List<String> getAllIdOrder() {
        List<String> list = new ArrayList<>();
        String sql = "select idOrder from [Order]";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public Order getOrderbyID(String id){
        String sql="select * from [Order] where idOrder ="+id;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new Order(id, rs.getString(2), rs.getDouble(3), rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

}
