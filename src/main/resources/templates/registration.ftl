<!DOCTYPE html>
<html>
    <head>
        <title>Registration Form</title>
    </head>
    <body>
        <form action="/" method="get">
            <button type="Submit">Go To Login Page</button>
        </form>


        <form action="/registration" modelAttribute="userForm" method="post" >
            <h2>Registration Form</h2>
            <input type="text" name="username" placeholder="Login"/><br>
            <input type="text" name="password" placeholder="Password" /><br>
            <input type="text" name="passwordConfirm" placeholder="passwordConfirm" /><br>
            <input type="text" name="roles" placeholder="roles" /><br>

            <#--<select name="roles">-->
                <#--<option value="ADMIN">Admin</option>-->
                <#--<option value="USER">User</option><-->
            <#--</select>-->
            <#--<br><br>-->
            <button type="submit">Register User</button>
        </form>


    </body>
</html>