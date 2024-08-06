<%-- 
    Document   : verFiltro
    Created on : 03-oct-2016, 13:35:16
    Author     : Edi
--%>



<%@page import="static com.mongodb.client.model.Filters.*"%>
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
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
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
            
            List<Document> docs = coleccion.find(and(eq("nombre",txtNombre),eq("apellido", txtApellido))).into(new ArrayList<Document>()); //.first();
          
            out.print("Modificar registro <br>");
            out.print("<form action='updateRegistro.jsp?txtNombre="+txtNombre+"&txtApellido="+txtApellido+"'>");
            out.print("Nombre:");
            out.print("<input type='text' name='txtNombreN' value='"+txtNombre+"'><br>");
            out.print("<input type='hidden' name='txtNombre' value='"+txtNombre+"'><br>");
            out.print("Apellido:");
            out.print("<input type='text' name='txtApellidoN' value='"+ txtApellido +"'><br><br>");
            out.print("<input type='hidden' name='txtApellido' value='"+ txtApellido +"'><br><br>");
  
            out.print("<input type='submit' value='Actualizar en la base de datos'>");
            out.print("<input type='reset'>");
            
            out.print("</form>");
            
        %>
        
        <br>
          <a href="formulario.html"> Ingresar </a> | 
          <a href="verCollection.jsp"> Listar Registros </a> | 
          <a href="consulta.html"> Consultar </a> 
        <br>
        
    </body>
</html>
