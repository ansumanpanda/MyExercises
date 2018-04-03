<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <c:set var="contextPath" value="${pageContext.request.contextPath}"/> --%>
<html>
    <head>
    <style type="text/css">
	    div{
	    	color: red;
	    }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			   	$("#countryElement").change(function(){
			    var countryId = $(this).val();
			    $.ajax({
			        type: 'GET',
			        url: "${pageContext.request.contextPath}/countries/" + countryId,
			        success: function(data){
			            var selectStateElement=$('#stateElement'), option="";
			            selectStateElement.empty();
			
			            for(var i=0; i<data.length; i++){
			                option = option + "<option value='"+data[i].optionId + "'>"+data[i].optionValue + "</option>";
			            }
			            selectStateElement.append(option);
			        },
			        error:function(){
			            alert("error");
			        }
			
			    });
			});
		});
	</script>
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
                	 <td><sf:label path="country">Select Country</sf:label></td>
                	 <td>
                	 	<sf:select class="form-control" id="countryElement" path="country" >
         					<option value="">-Select-</option>
         					<sf:options items="${countryList}" itemValue="optionId" itemLabel="optionValue"/>
    					</sf:select>
                	 </td>
    			</tr>
    			<tr>
                	 <td><sf:label path="country">Select State</sf:label></td>
                	 <td>
                	 	<sf:select class="form-control" id="stateElement" path="state" multiple="true">
         					<option value="">-Select-</option>
         					<%-- <sf:options items="${countryList}" itemValue="optionId" itemLabel="optionValue"/> --%>
    					</sf:select>
                	 </td>
    			</tr>
    			 <tr>
                    <td><sf:label path="studentName">Student Name</sf:label></td>
                    <td><c:out value="${studentName}"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>