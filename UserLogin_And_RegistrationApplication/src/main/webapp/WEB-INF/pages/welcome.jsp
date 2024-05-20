<%-- <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Welcome! </h2>

<h3 style="color:green text-align:center"> <a href="register_emp" style="color:blue">Click here to register</a></h3>
<h3 style="color:green text-align:center"> <a href="login_emp" style="color:blue">Click here to login</a></h3>
</body>
</html> --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }
        h2 {
            color: #00bfff;
        }
        h3 {
            margin: 10px 0;
        }
        a {
            color: #1e90ff;
            text-decoration: none;
            font-size: 18px;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Welcome!</h2>

    <h3><a href="register_emp">Click here to register</a></h3>
    <h3><a href="login_emp">Click here to login</a></h3>
</body>
</html>
