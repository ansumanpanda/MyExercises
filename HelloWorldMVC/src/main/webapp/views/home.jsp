<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to the Super Specialty Sports Center</h2>
	<h2>Message : ${message}</h2>
	<h2>Start Meeting at : ${startMeeting}</h2>
	
	
	Language : <a href="?lang=en">English</a>

    <p>${message}</p>

    <p><s:message code="welcome.greeting" arguments="${startMeeting}"/></p>

    Current Locale : ${pageContext.response.locale} / ${locale}
</body>
</html>