<%@ page pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

</head>

<body>
    hello world<br/>
    <c:forEach items="${sessionScope.list}" var="per">
        ${per.name}-----<fmt:formatDate value="${per.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate> <br/>
    </c:forEach>
</body>

</html>
