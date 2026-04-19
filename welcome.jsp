<%
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("username", name);
    }

    session.setMaxInactiveInterval(60); // 1 min

    String user = (String) session.getAttribute("username");
%>

<html>
<body>

<% if (user != null) { %>
    <h2>Hello <%= user %>!</h2>
    <p>Session valid for 1 minute.</p>
    <a href="check.jsp">Check Session</a>
<% } else { %>
    <h2>Session Expired!</h2>
    <a href="index.jsp">Try Again</a>
<% } %>

</body>
</html>