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

/**
 *
 * @author asus
 */
public class DetailOrderDAO extends DBContext {

    public List<DetailOrder> getAll() {
        List<DetailOrder> list = new ArrayList<>();
        String sql = "select * from DetailOrder";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            OrderDAO dao = new OrderDAO();
            ProductDAO pdao = new ProductDAO();
            while (rs.next()) {
                list.add(new DetailOrder(dao.getOrderbyID(rs.getString(1)), pdao.getProductByID(rs.getString(2)), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6)));
            }
        } catch (Exception e) {
            System.out.println("Loi khi load DetailOrder " + e.getMessage());
        }
        return list;
    }

    public double tinhtienLai(List<DetailOrder> list) {
        double total = 0;
        for (DetailOrder d : list) {
            total += (d.getMoney() - d.getProduct().getPriceIN() * d.getQuantityOrder());
        }
        return total;
    }

    public double tinhtienLaiTheoThangNam(List<DetailOrder> list, String month, String year) {
        double total = 0;
        for (DetailOrder d : list) {
            String m = d.getOrder().getDate();
            String mon = m.substring(5, 7);
            String y = m.substring(0, 4);
            if (mon.equals(month) && y.equals(year)) {
                total += (d.getMoney() - d.getProduct().getPriceIN() * d.getQuantityOrder());
            }
        }
        return total;
    }
    
    
    public static void main(String[] args) {
        DetailOrderDAO dao = new DetailOrderDAO();
        String a = "2020-05-19";
        double b=(dao.tinhtienLaiTheoThangNam(dao.getAll(), "10", "2020"))+(dao.tinhtienLaiTheoThangNam(dao.getAll(), "11", "2020"));
        //System.out.println(b==dao.tinhtienLai(dao.getAll()));
        System.out.println(a.substring(5, 7));
                System.out.println(a.substring(0, 4));
                System.out.println(dao.tinhtienLaiTheoThangNam(dao.getAll(), "0"+2, 2019+""));
                List<DetailOrder> list = dao.getAll();
                for(DetailOrder d:list){
                    System.out.println(d.getOrder().getIdOrder());
                }
    }
    

}
