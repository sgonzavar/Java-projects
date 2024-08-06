<%-- 
    Document   : atenderBorrado
    Created on : 19-oct-2016, 13:27:27
    Author     : Edi
--%>

<%@page import="com.mongodb.client.result.DeleteResult"%>
<%@page import="static com.mongodb.client.model.Filters.*"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
            String txtNombre = request.getParameter("txtNombreF"); 
            String txtApellido = request.getParameter("txtApellidoF");

            MongoClientURI mongoURI =new MongoClientURI(""
                    + "mongodb://user1:12345@ds153735.mlab.com:53735/clsjsp");
            MongoClient conexion = new MongoClient(mongoURI);
            
            MongoDatabase db = conexion.getDatabase("clsjsp");
            
            MongoCollection<Document> coleccion = db.getCollection("Listado");

            DeleteResult deleteResult = coleccion.deleteMany(and(eq("nombre",txtNombre),eq("apellido",txtApellido)));
            out.println("<br> Resultado de borrar: "+deleteResult.getDeletedCount()+ " registros.");
          
        %>
        
        <br>
          <a href="formulario.html"> Ingresar </a> | 
          <a href="verCollection.jsp"> Listar Registros </a> | 
          <a href="consulta.html"> Consultar </a> 
        <br>
        
    </body>
</html>
