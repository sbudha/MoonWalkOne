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
        <h3>Hello &nbsp;&nbsp; ${fname} &nbsp; ${lname}</h3>
    </div>

    <div class="content3">

        <table >

            <tr>

                <td>FIRST NAME</td>
                <td>LAST NAME </td>
                <td>USER NAME</td>
                <td>MOBILE N0.</td>
            </tr>
            <tr>
                <td>${fname}</td>
                <td>${lname}</td>
                <td>${uname}</td>
                <td>${mnumber}</td>
            </tr>
        </table>

    </div>

    <div class="footer">
        <img src="footer.PNG">
    </div>

</div>
</body>
</html>
