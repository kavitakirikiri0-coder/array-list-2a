<%
    String name = request.getParameter("uname");
    int time = Integer.parseInt(request.getParameter("time"));

    session.setAttribute("user", name);
    session.setMaxInactiveInterval(time);
%>

<html>
<body>
    <h2>Hello <%= name %>!</h2>
    <p>Session will expire in <%= time %> seconds.</p>

    <a href="check.jsp">Click to Check Session</a>
</body>
</html>