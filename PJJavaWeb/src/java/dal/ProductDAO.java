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
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author asus
 */
public class ProductDAO extends DBContext {

    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString("idProduct"), rs.getString("name"), rs.getDouble("priceIN"), rs.getDouble("priceOUT"), rs.getInt("quantity"), rs.getInt("type"), rs.getString("image"));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Product> getAllProductByName(String name) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product where name like N'%"+name+"%'" ;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString("idProduct"), rs.getString("name"), rs.getDouble("priceIN"), rs.getDouble("priceOUT"), rs.getInt("quantity"), rs.getInt("type"), rs.getString("image"));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Product getProductByID(String id) {
        String sql = "select * from Product where idProduct = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Product(id, rs.getString("name"), rs.getDouble("priceIN"), rs.getDouble("priceOUT"), rs.getInt("quantity"), rs.getInt("type"), rs.getString("image"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void insert(Product c) {
        String sql = "INSERT INTO  Product\n" + "VALUES (?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getId());
            ps.setString(2, c.getName());
            ps.setDouble(3, c.getPriceIN());
            ps.setDouble(4, c.getPriceOUT());
            ps.setInt(5, c.getQuantity());
            ps.setInt(6, c.getType());
            ps.setString(7, c.getImage());

            ps.execute();
        } catch (Exception e) {
            System.out.println("Loi khi update" + e.getMessage());
        }
    }

    public boolean checkIdExist(String id) {
        List<Product> list = getAll();
        for (Product l : list) {
            if (l.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void deleteProduct(String id) {
        String sql = "DELETE FROM Product WHERE idProduct=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();
        } catch (Exception e) {
            System.out.println("Loi khi delete" + e.getMessage());
        }
    }

    public void update(Product c) {
        String sql = "Update Product set name = ?,priceIN = ?,priceOUT = ?,quantity = ?, type=? ,image=? where idProduct = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setDouble(2, c.getPriceIN());
            ps.setDouble(3, c.getPriceOUT());
            ps.setInt(4, c.getQuantity());
            ps.setInt(5, c.getType());
            ps.setString(6, c.getImage());
            ps.setString(7, c.getId());

            ps.execute();
        } catch (Exception e) {
            System.out.println("Loi khi update" + e.getMessage());
        }
    }

    public List<String> selectTop3banChay() {
        List<String> list = new ArrayList<>();
        //Select top 3 sản phẩm bán được nhiều nhất và sắp xếp theo giá giảm dần nếu cùng số lượng sản phẩm
        String sql = "SELECT  top 3 idProduct FROM DetailOrder  GROUP BY idProduct ,quantityOrder,money   order by quantityOrder desc,money desc";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String p = rs.getString("idProduct");
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<String> selectTop3xinxo() {
        List<String> list = new ArrayList<>();
        String sql = "select top 3 idProduct from Product order by priceOUT desc";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String p = rs.getString("idProduct");
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllByType(String type) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product where type="+type;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString("idProduct"), rs.getString("name"), rs.getDouble("priceIN"), rs.getDouble("priceOUT"), rs.getInt("quantity"), rs.getInt("type"), rs.getString("image"));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getListByPage(List<Product> list,
            int start, int end) {
        List<Product> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
    public boolean checkSoLuongSP(Cart c){
        List<Item> list=c.getCart();
        for(Item l:list){
            if(l.getQuantity()>l.getProduct().getQuantity()){
                return false;
            }
        }
        return true;
    }
    public void truSP(Cart c){
        List<Item> list=c.getCart();
        for(Item l :list){
            l.getProduct().setQuantity(l.getProduct().getQuantity()-l.getQuantity());
        }
    }
    public void updateProductAfterBuy(Cart c){
        List<Item> list=c.getCart();
        for(Item l:list){
            String sql="Update Product set quantity = "+l.getProduct().getQuantity()+"  where idProduct="+l.getProduct().getId();
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
            } catch (Exception e) {
                System.out.println("Loi khi cap nhat lai quantity product"+e.getMessage());
            }
        }
    }
    public List<Product> getListSPchuabanduoc(){
        List<Product> list= new ArrayList<>();
        String sql="select * from Product where idProduct not in (select distinct idProduct from [DetailOrder])";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
            }
        } catch (Exception e) {
            System.out.println("Loi khi getListSPchuabanduoc : "+e.getMessage());
        }
        return list;
    }
}
