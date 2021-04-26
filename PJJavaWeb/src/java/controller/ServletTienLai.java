/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DetailOrderDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DetailOrder;

/**
 *
 * @author asus
 */
@WebServlet(name = "ServletTienLai", urlPatterns = {"/tienlai"})
public class ServletTienLai extends HttpServlet {

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
            out.println("<title>Servlet ServletTienLai</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletTienLai at " + request.getContextPath() + "</h1>");
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
        DetailOrderDAO dao = new DetailOrderDAO();
        List<DetailOrder> listDO = dao.getAll();
        int curMonth = java.time.LocalDate.now().getMonthValue();
        HttpSession session = request.getSession(true);
        session.setAttribute("curMonth", curMonth);
        session.setAttribute("listDO", listDO);
        response.sendRedirect("view/thunhap.jsp");
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
        HttpSession session = request.getSession(true);
        String y=request.getParameter("chooseyear");
        String yc=java.time.LocalDate.now().getYear()+"";
        switch(y){
            case "2020":{
                session.setAttribute("cho", "selected");
                break;
            }
            case "2019":{
                session.setAttribute("cho1", "selected");
                break;
            }
            case "2018":{
                session.setAttribute("cho2", "selected");
                break;
            }
            case "2017":{
                session.setAttribute("cho3", "selected");
                break;
            }
            case "2016":{
                session.setAttribute("cho4", "selected");
                break;
            }
            case "2015":{
                session.setAttribute("cho5", "selected");
                break;
            }
            case "2014":{
                session.setAttribute("cho6", "selected");
                break;
            }
            case "2013":{
                session.setAttribute("cho7", "selected");
                break;
            }
            case "2012":{
                session.setAttribute("cho8", "selected");
                break;
            }
            case "2011":{
                session.setAttribute("cho9", "selected");
                break;
            }
            case "2010":{
                session.setAttribute("cho10", "selected");
                break;
            }
        }
        
        if (y.equalsIgnoreCase(yc)) {
            DetailOrderDAO dao = new DetailOrderDAO();
            List<DetailOrder> listDO = dao.getAll();
            int curMonth = java.time.LocalDate.now().getMonthValue();
            session.setAttribute("curMonth", curMonth);
            session.setAttribute("listDO", listDO);
            response.sendRedirect("view/thunhap.jsp");
        } else {
            DetailOrderDAO dao = new DetailOrderDAO();
            List<DetailOrder> listDO = dao.getAll();
            String yearchoose = request.getParameter("chooseyear");
            session.setAttribute("chooseyear", yearchoose);
            session.setAttribute("listDO", listDO);
            response.sendRedirect("view/thunhap.jsp");
        }

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
