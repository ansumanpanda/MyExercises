<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!doctype html>
<%-- <c:set var="contextPath" value="${pageContext.request.contextPath}"/> --%>
<html lang="en">
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
        	<div class="container-fluid"> 
        	 <!-- Pattern1 : Introduce by Guideline -->
			 <%-- <sf:form method="POST" action="${pageContext.request.contextPath}/addEmployee"  modelAttribute="employee"> --%>
			 
			 <!-- Pattern2 : By s:url -->
			<%-- <s:url value="/addEmployee" var="addEmployeeURL"/>
			<sf:form method="POST" action="${addEmployeeURL}"  modelAttribute="employee">  --%>
			
			<!-- Pattern3 : New way added by Spring 4.0(and 3.2.3) -->
			
			<sf:form method="POST" servletRelativeAction="/addEmployee" modelAttribute="employee" class="form-">
        	<%-- <c:set var="Income" scope="session" value="${getLabel()}"/> --%>
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
                    <td><sf:label path="formInputData['firstName']">Student FirstName</sf:label></td>
                    <td><sf:input path="formInputData['firstName']"/></td>
                </tr>
                 <tr>
                    <td><sf:label path="formInputData['lastName']">Student LastName</sf:label></td>
                    <td><sf:input path="formInputData['lastName']"/></td>
                </tr>
                
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </sf:form>
        </div>
       <%--  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script> --%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>