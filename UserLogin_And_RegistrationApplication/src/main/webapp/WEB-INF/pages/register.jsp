<%-- 
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<html>
<head>
<title>Employee Registration</title>
</head>
<body>

	<h2 style="color: cyan; text-align: center">Welcome to
		Registration page</h2>

	<frm:form modelAttribute="emp">
		<table style="text-align: center">
			<tr>
				<td>Employee name</td>
				<td><frm:input path="name" required="true" /></td>
			</tr>
			<tr>
				<td>Employee user Id</td>
				<td><frm:input path="loginId" required="true" /></td>
			</tr>
			<tr>
				<td>Employee password</td>
				<td><frm:input path="password" required="true" /></td>
			</tr>
			<tr>
				<td>Employee Date of Birth</td>
				<td><frm:input path="dateOfBirth" /></td>
			</tr>
			<tr>
				<td>Employee Gender</td>
				<td><frm:input path="gender" /></td>
			</tr>
			<tr>
				<td>Employee Address</td>
				<td><frm:input path="Address" /></td>
			</tr>
			<tr>
				<td>Employee State</td>
				<td><frm:input path="State" /></td>
			</tr>
			<tr>
				<td>Employee City</td>
				<td><frm:input path="city" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><input type="reset" value="clear"></td>
			</tr>
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
    <title>Employee Registration</title>
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
        .registration-container {
            background-color: #ffffff;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 600px;
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
        label {
            display: inline-block;
            width: 150px;
            text-align: right;
            padding-right: 10px;
        }
        input[type="submit"], input[type="reset"] {
            background-color: #00bfff;
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 20px 10px 0 0;
            cursor: pointer;
            border-radius: 5px;
        }
        input[type="submit"]:hover, input[type="reset"]:hover {
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
    <div class="registration-container">
        <h2>Welcome to Registration Page</h2>
        <frm:form modelAttribute="emp">
            <table>
                <tr>
                    <td><label for="name">Employee Name</label></td>
                    <td><frm:input path="name" id="name" required="true"/></td>
                </tr>
                <tr>
                    <td><label for="loginId">Employee User ID</label></td>
                    <td><frm:input path="loginId" id="loginId" required="true"/></td>
                </tr>
                <tr>
                    <td><label for="password">Employee Password</label></td>
                    <td><frm:input path="password" id="password" required="true" type="password"/></td>
                </tr>
                <tr>
                    <td><label for="dateOfBirth">Employee Date of Birth</label></td>
                    <td><frm:input path="dateOfBirth" id="dateOfBirth" type="date"/></td>
                </tr>
                <tr>
                    <td><label for="gender">Employee Gender</label></td>
                    <td>
                        <frm:select path="gender" id="gender">
                            <frm:option value="" label="Select"/>
                            <frm:option value="Male" label="Male"/>
                            <frm:option value="Female" label="Female"/>
                            <frm:option value="Other" label="Other"/>
                        </frm:select>
                    </td>
                </tr>
                <tr>
                    <td><label for="address">Employee Address</label></td>
                    <td><frm:input path="address" id="address"/></td>
                </tr>
                <tr>
                    <td><label for="state">Employee State</label></td>
                    <td><frm:input path="state" id="state"/></td>
                </tr>
                <tr>
                    <td><label for="city">Employee City</label></td>
                    <td><frm:input path="city" id="city"/></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" value="Submit">
                        <input type="reset" value="Clear">
                    </td>
                </tr>
            </table>
        </frm:form>
        <a href="./" class="home-link">Home</a>
    </div>
</body>
</html>
