<%-- 
    Document   : verFiltro
    Created on : 03-oct-2016, 13:35:16
    Author     : Edi
--%>


<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mongodb.client.FindIterable"%>
<%@page import="java.util.List"%>
<%@page import="com.mongodb.client.model.Filters"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.MongoClientURI"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
       
        <% 
            String txtCriterio = request.getParameter("criterio"); 
            
            out.print("<h1>Filtrado por "+txtCriterio+"</h1>");
            
            
            MongoClientURI mongoURI =new MongoClientURI(""
                    + "mongodb://usuario01:qwerty123@ds049486.mlab.com:49486/clasejsp2016");
            MongoClient conexion = new MongoClient(mongoURI);
            
            MongoDatabase db = conexion.getDatabase("clasejsp2016");
            
            MongoCollection<Document> coleccion = db.getCollection("listado");
            
            
            BasicDBObject registroNuevo = new BasicDBObject();
            registroNuevo.append("$set", new BasicDBObject().append("clients", 110));

            BasicDBObject registroViejo = new BasicDBObject().append("hosting", "hostB");

            coleccion.updateOne(registroViejo, registroNuevo);
            
           
        %>
        
        <br>
          <a href="formulario.html"> Ingresar </a> | 
          <a href="verCollection.jsp"> Listar Registros </a> | 
          <a href="consulta.html"> Consultar </a> 
        <br>
        
    </body>
</html>
