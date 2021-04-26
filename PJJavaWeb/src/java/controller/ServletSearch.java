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
import model.Product;

/**
 *
 * @author asus
 */
@WebServlet(name = "ServletSearch", urlPatterns = {"/searchitem"})
public class ServletSearch extends HttpServlet {

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
            out.println("<title>Servlet ServletSearch</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletSearch at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession(true);
        String txtSearch = session.getAttribute("txtSearch") + "";
        ProductDAO pdd = new ProductDAO();

        List<Product> listProductBySearch = pdd.getAllProductByName(txtSearch);
        //phan trang
        int size = listProductBySearch.size();
        int start = 0, end = 4;
        if (end > size) {
            end = size;
        }
        if (request.getParameter("start") != null) {
            start = Integer.parseInt(request.getParameter("start"));
        }
        if (request.getParameter("end") != null) {
            end = Integer.parseInt(request.getParameter("end"));
        }
        List<Product> dataa = pdd.getListByPage(listProductBySearch, start, end);
        session.setAttribute("size", size);
        session.setAttribute("dataa", dataa);
        response.sendRedirect("view/searchproduct.jsp");
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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession(true);
        String txtSearch = request.getParameter("txtSearch");
        ProductDAO pdd = new ProductDAO();
        List<Product> listProductBySearch = pdd.getAllProductByName(txtSearch);
        //phan trang
        int size = listProductBySearch.size();
        int start = 0, end = 4;
        if (end > size) {
            end = size;
        }
        if (request.getParameter("start") != null) {
            start = Integer.parseInt(request.getParameter("start"));
        }
        if (request.getParameter("end") != null) {
            end = Integer.parseInt(request.getParameter("end"));
        }
        List<Product> dataa = pdd.getListByPage(listProductBySearch, start, end);
        session.setAttribute("txtSearch", txtSearch);
        session.setAttribute("size", size);
        session.setAttribute("dataa", dataa);
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
