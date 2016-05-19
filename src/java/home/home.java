/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Manish
 */
@WebServlet(name = "home", urlPatterns = {"/home"})
public class home extends HttpServlet {
    Connection con; PreparedStatement ps;
    @Override
    public void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodweb","root","root");
            String qr="select * from foodStorage";
            ps=con.prepareStatement(qr);
        }catch(ClassNotFoundException | SQLException ex){}
    }
    @Override
    public void destroy(){
        try{
            con.close();
        }catch(Exception ex){}
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        ResultSet rs=ps.executeQuery();
        int i = 1;
//        while(rs.next()){
//            request.setAttribute("id" + String.valueOf(i),rs.getString("id"));
//            request.setAttribute("name" + String.valueOf(i),rs.getString("name"));
//            request.setAttribute("price" + String.valueOf(i),rs.getString("price"));
//            i++;
//        }
           request.setAttribute("name","shit");
           javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
           rd.forward(request,response);
        }catch(Exception ex){
            out.println(ex);
        }
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
