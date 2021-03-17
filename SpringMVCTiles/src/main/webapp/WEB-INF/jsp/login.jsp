
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script>
<%@include file="/WEB-INF/jsp/js/index.js" %>
</script>

<style type="text/css">
.has-error .help-block {
	color: red;
}

.error{
color: red;
}
.required {
	color: red;
}
</style>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
</head>
<body>

<h2>Login Form</h2>
<form:form  name="form" method="POST" action="addlogin.html"   
        onsubmit=" return(validate());" >
      <table>
        
     


      <tr>
        <td>User Name
        </td>
        <td><form:input id="name" path="name" /></td>
        <!--  <td><font id="firstNameError" style="color: red;"></font> 
         </td> --> 
        <td> <div class="error" id="nameErr"></div> </td>      
      </tr>
      <tr>
         <td>Password
         </td>
         <td><form:input id="passwordid" path="password" /></td>
         <td> <div class="error" id="passerr"></div> </td>

      </tr>
     
<tr>
    <td colspan="2">
        <input type="submit"  value="Login"/>
    </td>
  </tr>
</table>  
     </form:form>
<a href="contact.html">Sign Up</a>

<a href="forgot.html">Forgot Password</a>

</body>
</html>