<%--
  Created by IntelliJ IDEA.
  User: Sanjeev
  Date: 9/14/2014
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MoonWalk</title>
    <link href="main.css" type="text/css" rel="stylesheet">
</head>
<body>
<div id="wrapper">

    <div class="header">
        <img src="LOGO1.PNG">
    </div>

    <div class="content2">

        <form method="post" action="two">
            <h3>FIRST NAME</h3> <input type="text" name="fname">
            <h3>LAST NAME</h3> <input type="text" name="lname">
            <h3>USER NAME</h3> <input type="text" name="uname">
            <h3>PASSWORD</h3> <input type="password" name="pass"><br>
            <h3>MOBILE NUMBER</h3> <input type="text" name="mnumber">
            <%--<h3>SEX</h3>
                <form>
                    <input type="radio"  value="male" name="male"> MALE<br>
                    <input type="radio"  value="female" name="female"> FEMALE<br>
                </form>
--%>
            <input type="submit" value="REGISTER">
        </form>

        <%-- </div>

         <div class="footer">
             <img src="footer.PNG">
         </div>--%>
    </div>
</div>
</body>
</html>
