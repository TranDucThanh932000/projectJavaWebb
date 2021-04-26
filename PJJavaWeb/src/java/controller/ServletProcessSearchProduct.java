/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author asus
 */
@WebServlet(name = "ServletProcessSearchProduct", urlPatterns = {"/processsp"})
public class ServletProcessSearchProduct extends HttpServlet {

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
            out.println("<title>Servlet ServletProcessSearchProduct</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProcessSearchProduct at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
            PrintWriter out= response.getWriter();
        HttpSession session= request.getSession(true);
        Cart cart=null;
        if(session.getAttribute("cart")!=null){
            cart=(Cart)session.getAttribute("cart");
        }
        String action=request.getParameter("action");
        if(action.equals("additem")){
            String id=request.getParameter("idprod");
            ProductDAO pdb=new ProductDAO();
            
            Product p = pdb.getProductByID(id);
            Item t= new Item(p,1);
            if(cart==null){
                cart= new Cart();
            }
                cart.addItem(t);
        }else if(action.equals("removeitem")){
            String id=request.getParameter("idprod");
            cart.deleteItem(id);
        List<Item> list= cart.getCart();
        int amount=0;
        for(Item l:list){
            amount+=l.getQuantity();
        }
        session.setAttribute("cart", cart);
        session.setAttribute("amount", amount);
        response.sendRedirect("view/cart.jsp");
        return;
        }else if(action.equals("checkout")){
            if(session.getAttribute("account")!=null){
                response.sendRedirect("payment");
                return;
            }else{
                response.sendRedirect("view/login.jsp");
                return;
            }
        }
        List<Item> list= cart.getCart();
        int amount=0;
        for(Item l:list){
            amount+=l.getQuantity();
        }
        session.setAttribute("cart", cart);
        session.setAttribute("amount", amount);
        response.sendRedirect("view/searchproduct.jsp");
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