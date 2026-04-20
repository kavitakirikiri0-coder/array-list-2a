<%@ page import="javax.servlet.http.Cookie" %>

<%
    String name = request.getParameter("cname");
    String value = request.getParameter("cvalue");
    int age = Integer.parseInt(request.getParameter("age"));

    Cookie cookie = new Cookie(name, value);
    cookie.setMaxAge(age);   // expiry time

    response.addCookie(cookie);
%>

<html>
<body>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Value:</b> <%= value %></p>
<p><b>Expiry Time:</b> <%= age %> seconds</p>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>