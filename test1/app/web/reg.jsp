<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<head>
    <title>Reg</title>
</head>
<body>
    <center><font size=5 color="blue"><B>用户注册页面</B></font></center>
    <form action="RegServlet" method="post">
        <table align="center" width="450" border="0">
            <!--用户名行-->
            <tr>
                <td align="right">Username:</td>
                <td>
                    <input type="text" name="username">
                </td>
            </tr>
            <!--密码行-->
            <tr>
                <td align="right">Password:</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <!--确认密码行-->
            <tr>
                <td align="right">Confirm Password:</td>
                <td>
                    <input type="password" name="repassword">
                </td>
            </tr>
            <!--提交 重置行-->
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Reg">
                    <input type="reset" value="Reset">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>