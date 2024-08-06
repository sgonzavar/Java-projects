<%-- 
    Document   : atenderFormulario
    Created on : 10-oct-2016, 21:08:56
    Author     : santiago
--%>


<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.MongoClientURI"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Programa Con JSP Y MongoBD </title>
    </head>
    <body>
        <h1>Programa Con JSP Y MongoBD</h1>
        <%
            String txtNombreJ = request.getParameter("txtNombreF");
            String txtApellidoJ = request.getParameter("txtApellidoF");
            
            MongoClientURI mongoURI = new MongoClientURI("" +
            "mongodb://user1:12345@ds153735.mlab.com:53735/clsjsp");
            
            MongoClient conexion = new MongoClient(mongoURI);
            
            MongoDatabase db = conexion.getDatabase("clsjsp");
            
            MongoCollection <Document> coleccion = db.getCollection("Listado");
            
            Document registro = new Document("Nombre", txtNombreJ)
                    .append("Apellido", txtApellidoJ);
            
            coleccion.insertOne(registro);
            
            out.print("(" + txtNombreJ +  " " +  txtApellidoJ + ")" + 
            "," +"Se Han Guardado En La Base Datos");
                    
      
        %>
            
       <br>
          <a href="formulario.html"> Ingresar </a> | 
          <a href="verCollection.jsp"> Listar Registros </a> | 
          <a href="consulta.html"> Consultar </a> 
        <br>
    </body>
</html>
