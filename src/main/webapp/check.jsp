<%
    String name = (String) session.getAttribute("user");

    if (name == null) {
%>
        <h3>Session expired!</h3>
<%
    } else {
%>
        <h3>Hello <%= name %>, session is still active.</h3>
<%
    }
%>