<%@ page import="javax.servlet.http.Cookie" %>

<%
    Cookie[] cookies = request.getCookies();
%>

<html>
<body>

<h2>Active Cookie List</h2>

<%
    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            <p>
                <b>Name:</b> <%= c.getName() %> <br>
                <b>Value:</b> <%= c.getValue() %>
            </p>
            <hr>
<%
        }
    } else {
%>
        <p>No cookies available</p>
<%
    }
%>

</body>
</html>