package COM.EXAMPLE;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String roll = request.getParameter("rollno");
        String name = request.getParameter("name");

        String[] subs = new String[5];
        int marks[] = new int[5];

        boolean isValid = true;
        String error = "";

        // Validate roll and name
        if (roll == null || roll.trim().isEmpty()) {
            isValid = false;
            error += "Roll No required<br>";
        }

        if (name == null || name.trim().isEmpty()) {
            isValid = false;
            error += "Name required<br>";
        }

        // Validate subjects
        for (int i = 0; i < 5; i++) {
            subs[i] = request.getParameter("sub" + (i + 1));

            try {
                marks[i] = Integer.parseInt(subs[i]);

                if (marks[i] < 0 || marks[i] > 100) {
                    isValid = false;
                    error += "Marks must be between 0 and 100<br>";
                }

            } catch (Exception e) {
                isValid = false;
                error += "Invalid marks for subject " + (i + 1) + "<br>";
            }
        }

        if (!isValid) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>Error:</h3>" + error);
            out.println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        // Calculate total and average
        int total = 0;
        boolean pass = true;

        for (int m : marks) {
            total += m;
            if (m < 40) {
                pass = false;
            }
        }

        double avg = total / 5.0;
        String result = pass ? "PASS" : "FAIL";

        // Send data to JSP
        request.setAttribute("roll", roll);
        request.setAttribute("name", name);
        request.setAttribute("marks", marks);
        request.setAttribute("average", avg);
        request.setAttribute("result", result);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}