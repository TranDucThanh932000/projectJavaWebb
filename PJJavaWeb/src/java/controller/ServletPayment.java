/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDAO;
import dal.OrderDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Cart;
import model.DetailOrder;
import model.Item;
import model.Order;

/**
 *
 * @author asus
 */
@WebServlet(name = "ServletPayment", urlPatterns = {"/payment"})
public class ServletPayment extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPayment</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPayment at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AccountDAO dao = new AccountDAO();
        HttpSession session = request.getSession(true);
        Account tk = dao.getAccount(((Account) session.getAttribute("account")).getUsername());
        ProductDAO pdd = new ProductDAO();
        if (session.getAttribute("cart") != null) {
            Cart cart = (Cart) session.getAttribute("cart");
            List<Item> list = cart.getCart();
            double a = 0;
            for (Item l : list) {
                a += l.getProduct().getPriceOUT() * l.getQuantity();
            }
            if (tk.getCash() < a) {
                session.setAttribute("messPayment", "TÀI KHOẢN CỦA BẠN KHÔNG ĐỦ TIỀN");
                session.setAttribute("notiPayment", "ok");
            } else if (pdd.checkSoLuongSP(cart) == false) {
                session.setAttribute("lmn", "Số lượng sản phẩm không đủ");
            } else if (tk.getCash() >= a && pdd.checkSoLuongSP(cart)) {
                session.setAttribute("messPayment", "BẠN ĐÃ THANH TOÁN THÀNH CÔNG SỐ TIỀN : " + a + " VNĐ");
                AccountDAO acd = new AccountDAO();
                OrderDAO odd = new OrderDAO();
                List<String> idOrder = odd.getAllIdOrder();
                String time = java.time.LocalDate.now() + "";
                pdd.truSP(cart);
                pdd.updateProductAfterBuy(cart);
                Order cInto = new Order((idOrder.size() + 1) + "", tk.getUsername(), a, time);
                //chen` vao bang Order truoc thi moi chen` duoc vao bang DetailOrder
                odd.insertToOrder(cInto);
                for (Item l : list) {
                    DetailOrder dtOrder = new DetailOrder(cInto, l.getProduct(), l.getQuantity(), l.getProduct().getPriceOUT(), 0, l.getProduct().getPriceOUT() * l.getQuantity());
                    odd.insertToDetailOrder(dtOrder);
                }
                acd.deductionAcc(tk.getUsername(), tk.getCash() - a);

                session.removeAttribute("cart");
                session.removeAttribute("amount");
            }
        }
        response.sendRedirect("view/payment.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
