<%-- 
    Document   : index
    Created on : 21/03/2019, 06:25:01 AM
    Author     : salak404
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="Servlet_1" method="get"> 
        
        <%-- Bloque de listado desplegable --%>
        
        <h1>Selecciones un color</h1>
        <br>
        <select name="cmbColor">
            
            <option>Verde</option>
            <option>Azul</option>
            <option>Rojo</option>
            <option>Negro</option>
            
        </select>
        
        <br>
        <br>
        
        <%-- Bloque de listado de chequeo --%>
        
        <h1>Cheque las que necesita</h1>
        <br>
        
        <input type="CheckBox" name="chkChequeo" value="contrato">Acepta las condiciones del contrato
        <br>
        <input type="CheckBox" name="chkChequeo" value="correo">Deseo recibir info a mi correo
        
        <br>
        <br>
        
        <%-- Bloque de listado de opciones --%>
        
        <h1>Selecciones solo una opcion</h1>
        
        <input type="radio" name="optSistemaOperativo" value="Windows" checked>Windows
        <br>
        <input type="radio" name="optSistemaOperativo" value="Linux">Linux
        <br>
        <input type="radio" name="optSistemaOperativo" value="Mac">Mac
        
        <br>
        <br>
        
        <input type="submit" name="btnEnviar" value="Enviar">
        
        </form>
    </body>
</html>
