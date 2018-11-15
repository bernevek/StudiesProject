<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>

    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>

    <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
    <c:url value="/css/main.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet"/>

</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">Spring Boot</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/">Home</a></li>
                <li class="active"><a href="/simpleForm">Form</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">

    <div class="starter-template">
        <form action="http://localhost:8080/simpleForm" method="post">
            <div>
                <input type="text" name="firstName" placeholder="First name">
                <input type="text" name="lastName" placeholder="Last name">
                <input type="text" name="age" placeholder="Age">
                <button type="submit" class="btn btn-primary">Save</button>
            </div>
        </form>
        <div>
            <table>
                <c:forEach var="user" items="${users}"> /* how set " " ? */
                    <tr>
                        <td>${user.firstName}</td>
                        <td>${user.lastName}</td>
                        <td>${user.age}</td>
                    </tr>

                </c:forEach>
            </table>

        </div>

    </div>

</div>
<!-- /.container -->

<script type="text/javascript"
        src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
