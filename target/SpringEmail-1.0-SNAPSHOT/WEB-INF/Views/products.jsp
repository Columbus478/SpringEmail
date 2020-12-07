<%-- 
    Document   : welcome
    Created on : Jan 3, 2019, 3:23:10 PM
    Author     : Columbus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<jsp:include page="<%= "welcome.jsp" %>">
 <jsp:param name="Title" value ="Products List." />
  <jsp:param name="message" value ="${message}" />
 </jsp:include>

   