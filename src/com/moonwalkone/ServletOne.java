package com.moonwalkone;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Sanjeev on 9/14/2014.
 */
public class ServletOne extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String uname = request.getParameter("uname");

         String passw = request.getParameter("pass");

        String url = "jdbc:mysql://localhost:3306/moonwalk";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password1 = "";
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, userName, password1);
            stmt = conn.createStatement();
            String sql = "SELECT user_Name , password , first_Name , last_Name from register";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){

                String userId = rs.getString("user_Name");
                String pass1 = rs.getString("password");
                String fname = rs.getString("first_Name");
                String lname = rs.getString("last_Name");

                if(userId.equals(uname) && pass1.equals(passw)){

                    /*response.sendRedirect("home.jsp");*/
                    //response.getWriter().println("User Name : " + userId);
                    request.setAttribute("fname",fname);
                    request.setAttribute("lname",lname);

                    RequestDispatcher view = request.getRequestDispatcher("home.jsp");
                    view.forward(request,response);

                }

                else
                {
                    response.sendRedirect("login.jsp");
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
