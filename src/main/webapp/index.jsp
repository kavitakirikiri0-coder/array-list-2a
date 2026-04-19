<!DOCTYPE html>
<html>
<head>
    <title>Student Result Form</title>
    <script>
        function validateForm() {
            let roll = document.forms["f"]["rollno"].value;
            let name = document.forms["f"]["name"].value;
            let subs = ["sub1","sub2","sub3","sub4","sub5"];

            if (roll == "" || name == "") {
                alert("Roll No and Name are required");
                return false;
            }

            for (let i = 0; i < subs.length; i++) {
                let val = document.forms["f"][subs[i]].value;

                if (val == "" || isNaN(val)) {
                    alert("Enter valid marks for all subjects");
                    return false;
                }

                if (val < 0 || val > 100) {
                    alert("Marks should be between 0 and 100");
                    return false;
                }
            }
            return true;
        }
    </script>
</head>
<body>

<h2>Student Result Form</h2>

<form name="f" action="ResultServlet" method="post" onsubmit="return validateForm()">
    Roll No: <input type="text" name="rollno"><br><br>
    Name: <input type="text" name="name"><br><br>

    Sub1: <input type="text" name="sub1"><br><br>
    Sub2: <input type="text" name="sub2"><br><br>
    Sub3: <input type="text" name="sub3"><br><br>
    Sub4: <input type="text" name="sub4"><br><br>
    Sub5: <input type="text" name="sub5"><br><br>

    <input type="submit" value="Calculate Result">
</form>

</body>
</html>