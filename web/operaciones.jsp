<%-- 
    Document   : operaciones
    Created on : May 22, 2018, 4:29:55 PM
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import = "JSP.*" %>
        <%
            String num = request.getParameter("n1");
            String denom = request.getParameter("d1");
            Fraccion fraccionA = new Fraccion(Integer.parseInt(num), Integer.parseInt(denom));
            
            num = request.getParameter("n2");
            denom = request.getParameter("d2");
            Fraccion fraccionB = new Fraccion(Integer.parseInt(num), Integer.parseInt(denom));
            
            out.println(fraccionA+" + "+fraccionB+" = "+fraccionA.suma(fraccionB));
            out.println("<br>");
            out.println(fraccionA+" - "+fraccionB+" = "+fraccionA.resta(fraccionB));
            out.println("<br>");
            out.println(fraccionA+" * "+fraccionB+" = "+fraccionA.multiplicacion(fraccionB));
            out.println("<br>");
            out.println(fraccionA+" / "+fraccionB+" = "+fraccionA.division(fraccionB));
            out.println("<br>");
            if(fraccionA.resta(fraccionB).getNum()>0)
                out.println(fraccionA+" > "+fraccionB);
            else if(fraccionA.resta(fraccionB).getNum()==0)
                out.println(fraccionA+" == "+fraccionB);
            else out.println(fraccionA+" < "+fraccionB);
        %>
    </body>
</html>
