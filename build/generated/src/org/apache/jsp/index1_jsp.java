package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 void logout(HttpSession session){
            session.setAttribute("username",null);
            session.setAttribute("loggedIn",null);
             
           }
            
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html><head>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\t#top {\n");
      out.write("\t\t\t\tbackground-color:blue;\n");
      out.write("\t\t\t\tcolor:white;\n");
      out.write("\t\t\t\ttext-align:center;\n");
      out.write("\t\t\t\tpadding:10px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#list{\n");
      out.write("\t\t\t\tline-height:30px;\n");
      out.write("\t\t\t\tbackground-color:greenyellow;\n");
      out.write("\t\t\t\tfloat:left;\n");
      out.write("\t\t\t\tpadding:15px;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t#offer{\n");
      out.write("\t\t\t\tline-height:30px;\n");
      out.write("\t\t\t\tbackground-color:yellowgreen;\n");
      out.write("\t\t\t\tfloat:right;\n");
      out.write("\t\t\t\tpadding:15px;\n");
      out.write("\t\t\t\t}\t\n");
      out.write("\t\t\t#image {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tfloat:left;\n");
      out.write("\t\t\t\tpadding:50px;\t \t \n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#footer {\n");
      out.write("\t\t\t\tbackground-color:black;\n");
      out.write("\t\t\t\tcolor:white;\n");
      out.write("\t\t\t\tclear:both;\n");
      out.write("\t\t\t\ttext-align:center;\n");
      out.write("\t\t\t   padding:10px;\t \t \n");
      out.write("\t\t\t}\n");
      out.write("                        #top {\n");
      out.write("\t\t\t\tbackground-color:blue;\n");
      out.write("\t\t\t\tcolor:white;\n");
      out.write("\t\t\t\ttext-align:center;\n");
      out.write("\t\t\t\tpadding:10px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#log{\n");
      out.write("\t\t\t  position:relative;\n");
      out.write("\t\t\t  left:-40%\n");
      out.write("\t\t\t}\n");
      out.write("                        #avl{\n");
      out.write("\t\t\t  position:relative;\n");
      out.write("\t\t\t  left:80%\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("                        .foodItem1{\n");
      out.write("                            width : 30%;\n");
      out.write("                            border: 1px solid #ccc;\n");
      out.write("                            display: inline-block;\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                        .foodItem1 img{\n");
      out.write("                            width : 80%;\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("            ");

        if(session.getAttribute("loggedIn") == null)
        {
                response.sendRedirect("login.jsp");
        } 
           
      out.write("\n");
      out.write("           \n");
      out.write("           ");
      out.write(" \n");
      out.write("           <div id=\"top\">\n");
      out.write("           \n");
      out.write("\t\t\t<img src=\"logo2.png\" alt=\"logo\" style=\"width:370px;height:200px;\"> \n");
      out.write("\t\t\t    <div id=\"log\">\n");
      out.write("                  \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"avl\">\n");
      out.write("                                                    <h5><a style=\"color:whitesmoke;font-weight:bolder\" href=\"login.jsp\">Welcome ");
      out.print(session.getAttribute("username"));
      out.write("</a></h5>\n");
      out.write("                                                    <h5><a style=\"color:whitesmoke;font-weight:bolder\" href=\"login.jsp\">Logout</a></h5>\n");
      out.write("                                                \n");
      out.write("                                                </div>\n");
      out.write("\t\t\t \t</div>\t\n");
      out.write("\t        <marquee><i></i><h3><i>Welcome to Food Web</i></h3></marquee>\t\n");
      out.write("\t\t</div>\n");
      out.write("                                                    \n");

        try{
            Connection con; Statement ps;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodweb","root","root");
            String qr="select * from foodStorage";
            ps=con.createStatement();
            ResultSet rs=ps.executeQuery(qr);
             while(rs.next()){
                String n=rs.getString("name");
                String p=rs.getString("price");
                String pic=rs.getString("imageUrl");
                

      out.write("\n");
      out.write("\n");
      out.write("                                                    <div class=\"foodItem1\" style=\"margin: 15px; \">\n");
      out.write("                                                        <center><img src= \"");
      out.print( pic);
      out.write("\" style=\" height: 250px; width:200px ;\"></center>\n");
      out.write("                                                        <h3 style=\"color: #00004d; padding-left: 15px\"><span style=\"float:left\"> ");
      out.print( n );
      out.write("</span> <i style=\"float:right\">Price: Rs. ");
      out.print( p );
      out.write("</i></h3>\n");
      out.write("                                                        <br><br><hr>\n");
      out.write("                                                        <form action=\"order\">\n");
      out.write("                                                            <input name=\"quan\" type=\"number\" required placeholder=\"Mention Quantity\" />\n");
      out.write("                                                            <input name=\"pid\" value=");
      out.print( rs.getString("id"));
      out.write(" style=\"visibility: hidden\" />\n");
      out.write("                                                            <center><button type=\"submit\">BUY NOW</button></center>\n");
      out.write("                                                        <br>\n");
      out.write("                                                        </form>\n");
      out.write("                                                        \n");
      out.write("                                                    </div>\n");
                                                      
             }                                            
      }catch(Exception e){
          
          out.println(e);
      }                                                        

      out.write("                                                     \n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\tfoodweb.com\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body></html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
