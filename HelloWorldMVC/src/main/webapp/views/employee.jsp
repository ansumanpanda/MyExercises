<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        	 
        	 <!-- Pattern1 : Introduce by Guideline -->
			 <%-- <sf:form method="POST" action="${pageContext.request.contextPath}/addEmployee"  modelAttribute="employee"> --%>
			 
			 <!-- Pattern2 : By s:url -->
			<%-- <s:url value="/addEmployee" var="addEmployeeURL"/>
			<sf:form method="POST" action="${addEmployeeURL}"  modelAttribute="employee">  --%>
			
			<!-- Pattern3 : New way added by Spring 4.0(and 3.2.3) -->
			<sf:form method="POST" servletRelativeAction="/addEmployee" modelAttribute="employee">
        	
        	<sf:errors path="*" element="div" cssClass="errors" />
             <table>
                <tr>
                    <td><sf:label path="name">Name</sf:label></td>
                    <td><sf:input path="name"/><sf:errors path="name" /><br/></td>
                </tr>
                <tr>
                    <td><sf:label path="id">Id</sf:label></td>
                    <td><sf:input path="id"/></td>
                </tr>
                <tr>
                    <td><sf:label path="contactNumber">Contact Number</sf:label></td>
                    <td><sf:input path="contactNumber"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>