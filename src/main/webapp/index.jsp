<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Form Đăng Nhập</h2>
    <form action="login" method="post">
        Tên người dùng: <input type="text" name="username" /><br/>
        Mật khẩu: <input type="password" name="password" /><br/>
        <input type="submit" value="Đăng nhập" />
    </form>
</body>
</html>