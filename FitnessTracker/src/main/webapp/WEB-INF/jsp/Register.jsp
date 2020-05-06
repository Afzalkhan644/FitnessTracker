
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<style type="text/css">
.divider-text {
    position: relative;
    text-align: center;
    margin-top: 15px;
    margin-bottom: 15px;
}
.divider-text span {
    padding: 7px;
    font-size: 12px;
    position: relative;   
    z-index: 2;
}
.divider-text:after {
    content: "";
    position: absolute;
    width: 100%;
    border-bottom: 1px solid #ddd;
    top: 55%;
    left: 0;
    z-index: 1;
}

.btn-facebook {
    background-color: #405D9D;
    color: #fff;
}
.btn-twitter {
    background-color: #42AEEC;
    color: #fff;
}
</style>
</head>

<body>
<div class="container">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Create Account</h4>
    </p>
	<form:form commandName="User">
      	<form:errors path="*" cssClass="errorblock" element="div" />
	
	
		 	<form:input path="name" cssErrorClass="error" class="form-control" placeholder="Full name" type="text" />
			<form:errors path="name" cssClass="error"  class="form-control"/>
 
    	
        <form:input path="password" cssErrorClass="error" class="form-control" placeholder="Password" type="password" />
			<form:errors path="name" cssClass="error"  class="form-control"/>

    	<div class="input-group-prepend" >
    	
    	
    	
		  <select class="custom-select" style="max-width: 120px;">
		    <option label="Kg">Kg</option>
		    <option  label="lbs">lbs</option>
		    </select>
		 
		    
		         <form:input path="weight" cssErrorClass="error" class="form-control" placeholder="Weight" type="number" />
		
    </div> 



    	<div class="input-group-prepend">
		  
		<select class="custom-select" style="max-width: 120px;">
		    <option label="Feet" >Feet</option>
		    <option label="Inches">Inches</option>
		 </select>    
		
    	<input name="" class="form-control" placeholder="Height" type="Number">
  
    </div> <!-- form-group// -->














                                     
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Create Account  </button>
    </div> <!-- form-group// -->      
    <p class="text-center">Have an account? <a href="">Log In</a> </p>                                                                 
	</form:form>
</article>
</div> <!-- card.// -->

</div> 
<!--container end.//-->

<br><br>

</article>
</body>

</html>