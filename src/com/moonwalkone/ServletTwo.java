package com.moonwalkone;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Sanjeev on 9/14/2014.
 */
public class ServletTwo extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        String mobile = request.getParameter("mnumber");

        String url = "jdbc:mysql://localhost:3306/moonwalk";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            boolean i = stmt.execute("insert into register values('" + fname + "','" + lname + "','" + uname + "','" + pass + "','"+mobile+"')");
            boolean j = stmt.execute("insert into login values('"+uname+"', '"+pass+"','"+fname+"')");
            if(i = true) {
                /*response.getWriter().println("Successfully Inserted");*/
                request.setAttribute("fname",fname);
                request.setAttribute("lname",lname);
                request.setAttribute("uname",uname);
                request.setAttribute("mnumber",mobile);

                RequestDispatcher view = request.getRequestDispatcher("home.jsp");
                view.forward(request,response);
            }
            
            else
                response.getWriter().println("Insert Unsuccessful");
        }catch (Exception e){
            e.printStackTrace();
        }

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
