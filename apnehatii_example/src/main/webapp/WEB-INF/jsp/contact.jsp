<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring Tiles Contact Form</title>
	
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
<h2>Registration Form</h2>
<form:form  name="form" method="POST" action="addContact.html"   
        onsubmit=" return(validate());" >
      <table>
        
     


      <tr>
        <td>Name
        </td>
        <td><form:input id="name" path="name" /></td>
        <!--  <td><font id="firstNameError" style="color: red;"></font> 
         </td> --> 
        <td> <div class="error" id="nameErr"></div> </td>      
      </tr>
      <tr>
         <td>Email ID
         </td>
         <td><form:input id="emailId" path="emailId" /></td>
         <td> <div class="error" id="emailErr"></div> </td>

      </tr>
      <tr>
        <td>Mobile No.
        </td>
        <td><form:input id="mobileNo" path="mobileNo" /></td>
        <!--  <td><font id="firstNameError" style="color: red;"></font> 
         </td> --> 
        <td> <div class="error" id="mobileErr"></div> </td>      
      </tr>
      
        <tr>
        <td>Password
        </td>
        <td><form:input id="passwordid" path="password" /></td>
        <!--  <td><font id="firstNameError" style="color: red;"></font> 
         </td> --> 
        <td> <div class="error" id="passerr"></div> </td>      
      </tr>
        


  <tr>
    <td colspan="2">
        <input type="submit"  value="Sign Up"/>
    </td>
  </tr>


</table>  
     </form:form>
</body>
</html>
