<%-- 
    Document   : success
    Created on : Jan 4, 2019, 7:10:02 PM
    Author     : Columbus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <title>Email Successful</title>
	    <style type="text/css">
	    	#backToDiv {
	    		text-align: center;
    			padding-top: 16px;
	    	}
	    	
    		#dashBoardPage {
    			text-decoration: none;
    			text-align: center;
    			cursor: pointer;
    		}
    		
    		#successMessage {
    			text-align: center; 
    			color: green; 
    			font-size: 25px; 
    			padding-top: 17px;
    		}
    	</style>
	</head>
	
	<body>
	    <center>
	    	<h2>Email Success Page</h2>
	    </center>
	    <div id="successMessage">
	        <strong>${messageObj}</strong>
	    </div>
	    <div id="backToDiv">
	    	<a id="dashBoardPage" href="${pageContext.request.contextPath}/">Back to Dashboard.</a>
	    </div>
	</body>
</html>
