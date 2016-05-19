import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VerifyUser extends HttpServlet {
    Connection con; PreparedStatement ps;
    @Override
    public void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodweb","root","root");
            String qr="select * from customer where uname=? and password=?";
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
        String id=request.getParameter("t1");
        String pw=request.getParameter("t2");
        try{
        ps.setString(1,id);
        ps.setString(2, pw);
        ResultSet rs=ps.executeQuery();
        boolean found=rs.next();
        if(found){
           HttpSession session=request.getSession();
           session.setAttribute("username",rs.getString("uname"));
           session.setAttribute("usermno",rs.getString("mno"));
           session.setAttribute("loggedIn", true);
            RequestDispatcher rd = request.getRequestDispatcher("index1.jsp");
            rd.forward(request, response);
 
        }else{
             response.sendRedirect("invalide.jsp");
        }
        
        
        
        
        
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
