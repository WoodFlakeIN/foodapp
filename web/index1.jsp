
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<html><head>
		<style>
			#top {
				background-color:blue;
				color:white;
				text-align:center;
				padding:10px;
			}
			#list{
				line-height:30px;
				background-color:greenyellow;
				float:left;
				padding:15px;
				}
			#offer{
				line-height:30px;
				background-color:yellowgreen;
				float:right;
				padding:15px;
				}	
			#image {
				
				float:left;
				padding:50px;	 	 
			}
			#footer {
				background-color:black;
				color:white;
				clear:both;
				text-align:center;
			   padding:10px;	 	 
			}
                        #top {
				background-color:blue;
				color:white;
				text-align:center;
				padding:10px;
			}
			#log{
			  position:relative;
			  left:-40%
			}
                        #avl{
			  position:relative;
			  left:80%
			}
			
                        .foodItem1{
                            width : 30%;
                            border: 1px solid #ccc;
                            display: inline-block;
                        }
                        
                        .foodItem1 img{
                            width : 80%;
                            
                        
		</style>
	</head>

	<body>
            <%
        if(session.getAttribute("loggedIn") == null)
        {
                response.sendRedirect("login.jsp");
        } 
           %>
           
           <%! void logout(HttpSession session){
            session.setAttribute("username",null);
            session.setAttribute("loggedIn",null);
             
           }
            %> 
           <div id="top">
           
			<img src="logo2.png" alt="logo" style="width:370px;height:200px;"> 
			    <div id="log">
                  
						
						<div id="avl">
                                                    <h5><a style="color:whitesmoke;font-weight:bolder" href="login.jsp">Welcome <%=session.getAttribute("username")%></a></h5>
                                                    <h5><a style="color:whitesmoke;font-weight:bolder" href="login.jsp">Logout</a></h5>
                                                
                                                </div>
			 	</div>	
	        <marquee><i></i><h3><i>Welcome to Food Web</i></h3></marquee>	
		</div>
                                                    
<%
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
                
%>

                                                    <div class="foodItem1" style="margin: 15px; ">
                                                        <center><img src= "<%= pic%>" style=" height: 250px; width:200px ;"></center>
                                                        <h3 style="color: #00004d; padding-left: 15px"><span style="float:left"> <%= n %></span> <i style="float:right">Price: Rs. <%= p %></i></h3>
                                                        <br><br><hr>
                                                        <form action="order">
                                                            <input name="quan" type="number" required placeholder="Mention Quantity" />
                                                            <input name="pid" value=<%= rs.getString("id")%> style="visibility: hidden" />
                                                            <center><button type="submit">BUY NOW</button></center>
                                                        <br>
                                                        </form>
                                                        
                                                    </div>
<%                                                      
             }                                            
      }catch(Exception e){
          
          out.println(e);
      }                                                        
%>                                                     
		<div id="footer">
			foodweb.com
		</div>

	

</body></html>
