<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    </head>
    <body>
	    <h2>Submitted Employee Information</h2>
	    <table>
	        <tr>
	            <td>Name :</td>
	            <td>${name}</td>
	        </tr>
	        <tr>
	            <td>ID :</td>
	            <td>${id}</td>
	        </tr>
	        <tr>
	            <td>Contact Number :</td>
	            <td>${contactNumber}</td>
	        </tr>
	    </table>
	</body>
</html>