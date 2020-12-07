<%-- 
    Document   : email
    Created on : Jan 4, 2019, 11:49:06 AM
    Author     : Columbus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <title>Send An Email</title>
	    <style type="text/css">
	    	#sendEmailBtn {
				float: left;
    			margin-top: 22px;
    		}
                #backToDiv {
	    		text-align: center;
    			padding-top: 16px;
	    	}
	    	
    		#dashBoardPage {
    			text-decoration: none;
    			text-align: center;
    			cursor: pointer;
    		}
    	</style>
	</head>

	<body>
	    <center>
	        <h2>Send us an email</h2>
	        <form id="sendEmailForm" method="post" action="sendEmail" enctype="multipart/form-data">
	            <table id="emailFormBeanTable" border="0" width="80%">
	                <tr>
	                    <td>Email To: </td>
	                    <td><input id="receiverMail" type="text" name="mailTo" size="65" /></td>
	                </tr>
	                <tr>
	                    <td>Subject: </td>
	                    <td><input id="mailSubject" type="text" name="subject" size="65" /></td>
	                </tr>
	                <tr>
	                    <td>Message: </td>
	                    <td><textarea id="mailMessage" cols="50" rows="10" name="message"></textarea></td>
	                </tr>
	                <tr>
	                    <td>Attachment: </td>
	                    <td><input id="mailAttachment" type="file" name="attachFileObj" size="60" /></td>
	                </tr>
	                <tr>
	                    <td colspan="2" align="center"><input id="sendEmailBtn" type="submit" value="Send Email" /></td>
	                </tr>
	            </table>
	        </form>
                <div id="backToDiv">
	    	<a id="dashBoardPage" href="${pageContext.request.contextPath}/">Back to Dashboard.</a>
	    </div>
	    </center>
	</body>
</html>
