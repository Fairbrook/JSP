<%-- 
    Document   : index
    Created on : May 22, 2018, 4:28:35 PM
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fracciones</title>
    </head>
    <body>
        <style>
            .grid{
                display: grid;
                grid-gap: 10%;
                grid-template-columns: 45% 45%;
            }
            
            form{
                width: 10%;
            }
            
            hr{
                width: 100%;
            }
            
            input{
                max-width: 100%;
                box-sizing: border-box;
            }
        </style>
        <h1>Operaciones con fracciones</h1>
        <form action="operaciones.jsp" method="POST">
            <div class="grid">
                <input type="number" name="n1" required>
                <input type="number" name="n2" required>
                <hr>
                <hr>
                <input type="number" name="d1" required>
                <input type="number" name="d2" required>
            </div>
            
            <br>
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
