<%-- 
    Document   : login.jsp
    Created on : 9 Feb, 2016, 11:24:03 AM
    Author     : Manish
--%>

<!DOCTYPE html>
<html>
	
    
	<head>
		<style>
			#loga{
				position:relative;
				left:40%
			}
			body  {
				background-image: url(wall.jpg);
				background-position: top;
				background-size: 100%;
				background-repeat: no repeat;
			}
		</style>
	</head>
    
        
		<div id="loga">
		<h1  style="color: white;font-weight:bold;font-size:20px;font-family: verdana"> <u>Registration Form </u></h1><br>
        
                <form action="Rgistration"  style="color: white;font-weight:bold;font-size:20px;font-family: verdana">   
                    
              First name:<br> 
                <input type="text" name="t1" required=""><br>
              Last name:<br> 
                <input type="text" name="t2" required=""><br>
              User name:<br>
                <input type="text" name="t3" required=""><br>
              User password:<br>
                <input type="password" name="t4"required=""><br>
              Address:<br> 
                <input type="text" name="t5" required=""r><br>
              Mobile Number:<br>
              <input type="number" name="t6" required="" maxlength="10"><br>
              E-mail:<br>
                <input type="email" name="t7" required=""><br>
              Zipcode:<br>
              <input type="text" name="t8" required="" maxlength="6"><br><br>
                <input type="submit" value="Register" style="font-weight: bold">
        </form>
                <h5><p><a style="color: white;font-weight:bold;font-size:20px;font-family: verdana"href="login.jsp"> GO TO HOME </a></p></h5>
		</div>
</html>
    

