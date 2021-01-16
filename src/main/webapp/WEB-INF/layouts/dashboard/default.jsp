<%-- 
    Document   : default
    Created on : Jan 16, 2021, 2:43:59 PM
    Author     : J2EE
--%>
<%@taglib uri="http://tiles.apache.org/tags-tiles"  prefix="tiles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:getAsString name="title" /></title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <tiles:insertAttribute name="body" />
    </body>
</html>
