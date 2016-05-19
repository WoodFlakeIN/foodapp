
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

public class order extends HttpServlet {

    Connection con;
    PreparedStatement ps;
    private Object Congratulation;

    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodweb", "root", "root");
            String qr = "insert into orders values(?,?,?,?)";
            ps = con.prepareStatement(qr);
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    @Override
    public void destroy() {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String pid = request.getParameter("pid");
        String quan = request.getParameter("quan");
        HttpSession session = request.getSession();
        String custname = (String) session.getAttribute("username");
        String mobno = (String) session.getAttribute("usermno");
        try {
            ps.setString(1, pid);
            ps.setString(2, quan);
            ps.setString(3, custname);
            ps.setString(4, mobno);
            ps.executeUpdate();
          //  out.println("<h2>Order Successful</h2><h3><a href=index.jsp>Shop More</a></h3>");
          response.sendRedirect("Congratulation.jsp");

        } catch (Exception ex) {
            out.println(ex);
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
