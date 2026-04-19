package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/visit")
public class VisitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int count = 1;

        Cookie[] cookies = request.getCookies();

        // Read cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                    count++;
                }
                if (c.getName().equals("username")) {
                    name = c.getValue();
                }
            }
        }

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(count));

        // ⏳ Set expiry (30 seconds for demo)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Display output
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times</h3>");

        // Display cookie list
        out.println("<h3>List of Cookies:</h3>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>" + c.getName() + " = " + c.getValue() + "</p>");
            }
        } else {
            out.println("<p>No cookies available</p>");
        }

        out.println("<p><i>(Cookies expire in 30 seconds)</i></p>");
        out.println("<a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}