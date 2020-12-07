<%-- 
    Document   : error
    Created on : Jan 4, 2019, 7:11:34 PM
    Author     : Columbus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <title>Spring MVC Email Example</title>
	    <style type="text/css">
    		#errorMessage {
    			text-align: center; 
    			font-size: 25px; 
    			padding-top: 17px;
    		}
    		
    		#errorMessage span {
    			color: red;
    		}
                #backToEmailFormDiv {
	    		text-align: center;
    			padding-top: 16px;
	    	}
	    	
    		#EmailFormPage {
    			text-decoration: none;
    			text-align: center;
    			cursor: pointer;
    		}
    	</style>
	</head>

	<body>
	    <center>
	        <h2>Email Error Page</h2>
	    </center>
	    <br /> <br />
	    <div id="errorMessage">
	        <strong>Sorry, The Email Was Not Sent Because Of The Following Error!</strong>
	        <span id="exceptionTrace">${exception.message}</span>
	    </div>
            <div id="backToEmailFormDiv">
	    	<a id="EmailFormPage" href="${pageContext.request.contextPath}/email">Back to Email Form Page.</a>
	    </div>
	</body>
</html>
