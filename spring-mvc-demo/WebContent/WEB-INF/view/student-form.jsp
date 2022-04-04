<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student form</title>
</head>
<body>
<h3>Hello From </h3>
<h4>Spring MVC</h4>
<br/>
<form:form action="processForm" modelAttribute="student" >

First name: <form:input path="firstName" />
<br/>
Last name: <form:input path="lastName"  ></form:input>
<br/>

Country: 
<form:select path="country">
			<form:options items="${student.county}"/>
			
</form:select>
<br/>
<input type="submit" value="submit"></input>
</form:form>

</body>
</html>
