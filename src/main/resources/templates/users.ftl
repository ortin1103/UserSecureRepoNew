<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>Table</title>
</head>
<body>
<h1>Users</h1>
<h2><a href=/ />Home</a></h2>

<table border="1">
    <caption>Table</caption>
    <tr>
        <th>Name</th>
        <th>Password</th>
        <th>Role</th>
        <th>Detail</th>
    </tr>
<#list user as users>
    <tr>
        <th>${users.username}</th>
        <th>${users.password}</th>
        <th>${users.Role}</th>
        <th><a href=user/${users.id}>Detail</th>


    </tr>
</#list>


</table>
</body>
</html>