<%
    String name = request.getParameter("uname");

    // If user submits name → create session
    if (name != null) {
        session.setAttribute("user", name);

        // ⏳ Set session expiry to 60 seconds (1 minute)
        session.setMaxInactiveInterval(60);
    }

    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire in 1 minute.</p>

        <a href="welcome.jsp">Refresh Page</a>

<%
    } else {
%>
        <h3>Session Expired!</h3>
        <p>Please enter your name again.</p>

        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>