<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Student Result</h2>

<%
    String roll = (String) request.getAttribute("roll");
    String name = (String) request.getAttribute("name");
    int marks[] = (int[]) request.getAttribute("marks");
    double avg = (Double) request.getAttribute("average");
    String result = (String) request.getAttribute("result");
%>

Roll No: <%= roll %> <br><br>
Name: <%= name %> <br><br>

Marks:<br>
Sub1: <%= marks[0] %> <br>
Sub2: <%= marks[1] %> <br>
Sub3: <%= marks[2] %> <br>
Sub4: <%= marks[3] %> <br>
Sub5: <%= marks[4] %> <br><br>

Average: <%= avg %> <br><br>
Result: <b><%= result %></b> <br><br>

<a href="index.jsp">Go Back to Form</a>

</body>
</html>