<%-- 
    Document   : contact
    Created on : Jan 6, 2019, 4:08:38 PM
    Author     : Columbus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="<%= "welcome.jsp" %>">
    <jsp:param name="ContactPageTitle" value ="Map View" />
  <jsp:param name="map_message" value ="${map_message}" />
 </jsp:include>
