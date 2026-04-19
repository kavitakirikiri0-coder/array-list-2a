<%
    String name = request.getParameter("uname");

    // Create session
    session.setAttribute("user", name);

    // Set session expiry time = 1 minute (60 seconds)
    session.setMaxInactiveInterval(60);
%>

<html>
<body>
    <h2>Hello <%= name %>!</h2>

    <a href="check.jsp">Check Session After 1 Minute</a>
</body>
</html>