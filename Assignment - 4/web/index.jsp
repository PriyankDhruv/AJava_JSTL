<%-- 
    Document   : index
    Created on : 26 Mar, 2019, 10:52:16 AM
    Author     : PRIYANK DHRUV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib uri="/WEB-INF/tlds/Book.tld" prefix="nm" %>
        <nm:Book imagex = "Images/Reema_Thareja.jpg"
                 title = "Data-Structure Using C"
                 author = "Reema Thareja"
                 isbn = "0979995688248"
                 publication = "Oxford"
                 price = "1200">
       </nm:Book>
    </body>
</html>
