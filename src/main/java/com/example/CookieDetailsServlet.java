package com.example;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookieDetails")
public class CookieDetailsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int count = 1;

        Cookie[] cookies = request.getCookies();

        // Read existing cookies
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

        // Create new cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(count));

        // ⏳ Set expiry (Demo: 30 seconds)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times</h3>");

        // Display cookies with details
        out.println("<h3>Cookie Details:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>");
                out.println("<b>Name:</b> " + c.getName() + "<br>");
                out.println("<b>Value:</b> " + c.getValue() + "<br>");
                out.println("<b>Max Age:</b> " + c.getMaxAge() + "<br>");
                out.println("</p><hr>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        out.println("<p><i>(Cookies expire in 30 seconds)</i></p>");
        out.println("<a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}