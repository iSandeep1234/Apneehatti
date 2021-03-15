function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}
function validate(){
	 var firstName = document.form.name.value;
	 var mobileNo=document.form.mobileNo.value;
	 var Emailid = document.form.emailId.value;
		var password = document.form.passwordid.value;
	 var nameErr =true;
	 var mobileErr =true;
	 var emailErr=true;
	 var passerr=true;
	 
 if(firstName == "") {
    	 
    	 printError("nameErr", "Please enter your name");

    } else {
    	 
        var regex = /^[a-zA-Z\s]+$/;                
        if(regex.test(firstName) === false) {
        	 
            printError("nameErr", "Please enter a valid name");
        } else {
        	 
            printError("nameErr", "");
            nameErr = false;
        }
    }
 
 if(mobileNo=="") {
	 
	 
	 printError("mobileErr", "Please enter your mobile number");
    
} else {
    var regex = /^[1-9]\d{9}$/;
    if(regex.test(mobileNo) === false) {
        printError("mobileErr", "Please enter a valid 10 digit mobile number");
    } else{
    	//document.getElementById("div3").innerHTML="";
        printError("mobileErr", "");
        mobileErr = false;
    }
} 
 
 if(Emailid=="") {
	 
 	printError("emailErr", "Please enter your email address");
      
 } else {
     // Regular expression for basic email validation
     var regex = /^\S+@\S+\.\S+$/;
     if(regex.test(Emailid) === false) {
         printError("emailErr", "Please enter a valid email address");
     } else{
     	 

         printError("emailErr", "");
         emailErr = false;
     }
     
 }
 
 var pass_check = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{4,15}$/;
	if(password== ""){
		//window.alert("Please enter your  password."); 
		//password.focus();
	   // password.style.borderColor='red';

	    //document.getElementById("passerr").innerHTML="*Please Enter Your Password";
		printError("passerr","Please Enter Your Password");

     
	}
	
	else{
		
		if(pass_check.test(password)===false){
		//window.alert("your  password should contains atleast one uppercase letter, one lowercase letter, one special character and one digit."); 
		//password.focus(); 
		//password.style.borderColor='red';

	    //document.getElementById("passerr").innerHTML="*Please Enter Valid Password";
	    printError("passerr","your  password should contains atleast one uppercase letter, one lowercase letter, one special character and one digit.");

    
	}
	else{
	   // password.style.borderColor='green';

	    //document.getElementById("passerr").innerHTML="";
	    printError("passerr","");
	    passerr=false;

	}
	}
 
 
 if(nameErr||mobileErr||emailErr||passerr== true){
     return false;
  } else {
  	
  	
  	 
  	
  	return true;
  	
} 
 
 
		
		
		

};  