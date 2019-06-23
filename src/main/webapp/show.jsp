<%--
  Created by IntelliJ IDEA.
  User: ginas
  Date: 2019/6/18
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" border="1" width="60%">
    <c:forEach items="${list}" var="k" varStatus="st">
        <Tr align="center">
            <TD>${st.count}</TD>
            <TD>${k.name}</TD>
            <TD>${k.score}</TD>
            <TD><A href="add.jsp">添加</A></TD>
        </Tr>
    </c:forEach>
</table>

</body>
</html>
