/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;

/**
 *
 * @author asus
 */
@WebServlet(name = "ServletUpdate", urlPatterns = {"/update"})
public class ServletUpdate extends HttpServlet {

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
            out.println("<title>Servlet ServletUpdate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUpdate at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("view/updateProduct.jsp").forward(request, response);
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

        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        double pin = Double.parseDouble(request.getParameter("pin"));
        double pout = Double.parseDouble(request.getParameter("pout"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int type = Integer.parseInt(request.getParameter("type"));
        String img = request.getParameter("image");
        Product p = new Product(id, name, pin, pout, quantity, type, img);
        ProductDAO pdd = new ProductDAO();

        String messs = "";
        if (pdd.checkIdExist(id) == true) {
            pdd.update(p);
//            messs = "Sửa thông tin sản phẩm thành công";
//            HttpSession session = request.getSession(false);
//            session.setAttribute("messs", messs);
            response.sendRedirect("list");
        } else {
            messs = "ID sản phẩm này không tồn tại";
            HttpSession session = request.getSession(false);
            session.setAttribute("messs", messs);
            response.sendRedirect("view/updateProduct.jsp");
        }

        //request.getRequestDispatcher("view/updateProduct.jsp").forward(request, response);
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