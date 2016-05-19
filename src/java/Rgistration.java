/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;

/**
 *
 * @author Manish
 */
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("driver loaded");
//        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root")) {

@WebServlet(urlPatterns = {"/Rgistration"})
public class Rgistration extends HttpServlet {
    Connection con; PreparedStatement ps;
    public void init()
    {
        try{
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodweb","root","root");
        String qr="insert into customer values(?,?,?,?,?,?,?,?)";            
        
        ps=con.prepareStatement(qr);        
        }catch(Exception e){}
    }
    public void destroy(){
        try{
            con.close();
        }catch(Exception e){}
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s1=request.getParameter("t1");//fname
        String s2=request.getParameter("t2");//lname
        String s3=request.getParameter("t3");//uname
        String s4=request.getParameter("t4");//password
        String s5=request.getParameter("t5");//address
        String s6=request.getParameter("t6");//mno
        String s7=request.getParameter("t7");//email
        String s8=request.getParameter("t8");//zcode
        try{
            ps.setString(1,s1);
            ps.setString(2,s2);
            ps.setString(3,s3);
            ps.setString(4,s4);
            ps.setString(5,s5);
            ps.setString(6,s6);
            ps.setString(7,s7);
            ps.setString(8,s8);
            ps.executeUpdate();
            HttpSession session=request.getSession();

            session.setAttribute("username", s3);
            session.setAttribute("loggedIn", true);
            response.sendRedirect("index.jsp");
            }catch(Exception ex){
                out.println(ex);
            }        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

    