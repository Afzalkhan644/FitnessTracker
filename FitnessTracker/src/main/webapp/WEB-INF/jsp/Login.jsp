<!DOCTYPE link PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<HEAD>
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <style>
      body { padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */ }
    </style>
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
    <style>
    </style>
  </head>
</HEAD>
<BODY>


<div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="Register.html">
          Login
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>


<div class="container">
      <div>
        <h1>
        Login
        </h1>
       
      </div>






<form:form commandName="User">
		<form:errors path="*" cssClass="errorblock" element="div" />
			<label for="textinput1">
	          Enter UserName:
	        </label>	
			<form:input path="name" cssErrorClass="error" />
			<form:errors path="name" cssClass="error" />
			<br/>
			<label for="textinput2">
	          Enter Password:
	        </label>	
			<form:input path="password" cssErrorClass="error" />
			<form:errors path="password" cssClass="error" />
			<br/>
			
			
			<input type="submit" class="btn" value="Login"/>
	  </form:form>
     
      <div class="control-group">
      </div>
    </div>

     <script src="jquery-1.8.3.js">
    </script>
    <script src="assets/js/bootstrap.js">
    </script>













  
</BODY>
</html>