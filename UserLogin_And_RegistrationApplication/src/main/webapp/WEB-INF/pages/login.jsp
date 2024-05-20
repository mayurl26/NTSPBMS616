<%-- <%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<html>
<head>
<title>Login</title>
</head>
<h2 style="color: cyan; text-align: center">Welcome to login page</h2>

<frm:form modelAttribute="emp">
	<table style="text-align: center">
		<tr>
			<td>Employee Login Id</td>
			<td><frm:input path="loginId" required="true" /></td>
		</tr>
		<tr>
			<td>Employee Password</td>
			<td><frm:input path="password" required="true" /></td>
		</tr>

		<td><input type="submit" value="submit"></td>

	</table>

	<br>
	<br>
	<br>
	<a href="./">home </a>

</frm:form>
</body>

</html> --%>

<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .login-container {
            background-color: #ffffff;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 400px;
            width: 100%;
        }
        h2 {
            color: #00bfff;
            text-align: center;
        }
        table {
            width: 100%;
        }
        td {
            padding: 10px 0;
        }
        input[type="submit"] {
            background-color: #00bfff;
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 20px 0;
            cursor: pointer;
            border-radius: 5px;
            width: 100%;
        }
        input[type="submit"]:hover {
            background-color: #009acd;
        }
        .home-link {
            display: block;
            text-align: center;
            margin-top: 10px;
            color: #00bfff;
            text-decoration: none;
        }
        .home-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Welcome to the Login Page</h2>
        <frm:form modelAttribute="emp">
            <table>
                <tr>
                    <td><label for="loginId">Employee Login Id</label></td>
                    <td><frm:input path="loginId" id="loginId" required="true"/></td>
                </tr>
                <tr>
                    <td><label for="password">Employee Password</label></td>
                    <td><frm:input path="password" id="password" required="true" type="password"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit">
                    </td>
                </tr>
            </table>
        </frm:form>
        <a href="./" class="home-link">Home</a>
    </div>
</body>
</html>