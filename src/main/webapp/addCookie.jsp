<html>
<head>
    <title>Add Cookie</title>
</head>
<body>

<h2>Add Cookie</h2>

<form action="setCookie.jsp">
    Name: <input type="text" name="cname" required><br><br>
    Domain(Value): <input type="text" name="cvalue" required><br><br>
    Max Expiry Age (sec): <input type="number" name="age" required><br><br>

    <input type="submit" value="Add Cookie">
</form>

</body>
</html>