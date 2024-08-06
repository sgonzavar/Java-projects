<%-- 
    Document   : verColeccion
    Created on : 24-oct-2016, 19:36:26
    Author     : santiago
--%>

<%@page import="java.util.List"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.MongoClientURI"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #ddd1dd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
        <title>Consulta de la base de datos</title>
    </head>
    <body>
        <h1>Consulta de la base de datos Mongo!</h1>
        <% 
            MongoClientURI mongoURI =new MongoClientURI(""
                    + "mongodb://user1:12345@ds153735.mlab.com:53735/clsjsp");
            MongoClient conexion = new MongoClient(mongoURI);
            
            MongoDatabase db = conexion.getDatabase("clsjsp");
            
            MongoCollection<Document> coleccion = db.getCollection("Listado");
            
            List<Document> docs = coleccion.find().into(new ArrayList<Document>());
            
            out.print("<table>");
            out.print("  <tr>");
            out.print("    <th>Nombre</th>");
            out.print("    <th>Apellido</th>");
            out.print("  </tr>");
 
  
            for (int i = 0; i < docs.size(); i++) {
                //docs.add(new Document("i", i));
                Document xxx = (Document)docs.get(i);
                String txtNombre = xxx.getString("nombre");
                String txtApellido = xxx.getString("apellido");
                //out.print("("+i+"): Nombre: "+txtNombre+", Apellido: "+txtApellido+" <br>");
           
                out.print("<tr>");
                out.print("  <td>"+txtNombre+"</td>");
                out.print("  <td>"+txtApellido+"</td>");
                out.print("</tr>");
            }
            out.print("<table>");
        %>
        
        <br> 
        
        <br>
          <a href="formulario.html"> Ingresar </a> | 
          <a href="verCollection.jsp"> Listar Registros </a> | 
          <a href="consulta.html"> Consultar </a> 
        <br>
       
    </body>
</html>
