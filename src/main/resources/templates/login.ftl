
<html>

<head>
    <title>Spring Security Login</title>
</head>

<body>
<h1> Login </h1>

<form action="/login" method="POST">
    <table>
        <tr><td>User:</td><td><input type='text' name='username' value=''/></td></tr>
        <tr><td>Password:</td><td><input type='password' name='password' value=''/></td></tr>

        <tr><td><input type="checkbox" name="remember-me"/></td><td>Don't ask for my password for two weeks</td></tr>

        <tr><td colspan='2'><input name="submit" type="submit"></td></tr>
        <tr><td colspan='2'><input name="reset" type="reset"></td></tr>
    </table>



</form>
<form action="/registration" method="get">
    <button  type="Submit">Go To Registration Page</button>
</form>


</body>
</html>