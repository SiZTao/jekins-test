<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/17 0017
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>欢迎您</title>
</head>
<body>
    ${msg}
    <br>
    <c:forEach items="${lists}" var="num">
        ${num} &nbsp;&nbsp;
    </c:forEach>
</body>
</html>
