<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- импорт библиотеки "core" из набора бибилиотек "jstl", для красивого форматирования выводов данных и т.д. --%>
<html>
<head>
    <title>Customers</title>
</head>
<body>

<%-- "<a> ... </a>" - тег "а" для указания ссылки --%>
<%-- "<br>" - тег "br" для переноса новой строки --%>
<a href="/app">Main page</a> <br> <%-- в скобочках пишем адресс ссылки, а затем отображаемый текст "активной ссылки"  --%>
<a href="/app/houses">Houses</a> <br> <%-- просто добавил для теста еще одну "кнопку" --%>

<c:forEach items="${customers}" var="item"> <%-- "<с: ..." - тег библиотеки для передачи списка (customers(указаный как ключ в сервлете) дальше как "item"), имеет встроенный forEach  --%>
    ${item.id}, ${item.name}, ${item.surname}, ${item.email} <br>
</c:forEach>
</body>
</html>