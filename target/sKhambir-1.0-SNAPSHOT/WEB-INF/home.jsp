<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1> Hello from jsp </h1>
<button type="button"><a href="<c:url value="/login"/>">Log In</a></button>
</body>
</html>