


<%@page import="static com.mongodb.client.model.Updates.*"%>
<%@page import="static com.mongodb.client.model.Filters.*"%>
<%@page import="com.mongodb.client.model.Filters"%>
<%@page import="com.mongodb.client.model.Updates"%>
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
        <title>JSP Page</title>
    </head>
    <body>
       
        
        <h1>Actualizar registro</h1>
        <%
            String txtNombre = request.getParameter("txtNombre");
            String txtApellido = request.getParameter("txtApellido");
            String txtNombreNuevo = request.getParameter("txtNombreN");
            String txtApellidoNuevo = request.getParameter("txtApellidoN");
          
            MongoClientURI mongoURI =new MongoClientURI(""
                    + "mongodb://usuario01:qwerty123@ds049486.mlab.com:49486/clasejsp2016");
            MongoClient conexion = new MongoClient(mongoURI);
            
            MongoDatabase db = conexion.getDatabase("clasejsp2016");
            
            MongoCollection<Document> coleccion = db.getCollection("listado");
            
            Document registro = new Document("nombre", txtNombre)
                                .append("apellido", txtApellido);

            //coleccion.insertOne(registro);
            out.print("<br>("+ txtNombre + "::" + txtNombreNuevo
                    + ") <br>Se han gaurdado de forma con éxito en la base de datos.<br><br><br>");
            
            coleccion.updateOne(and(eq("nombre", txtNombre),eq("apellido",txtApellido)), and(set("nombre", txtNombreNuevo), set("apellido",txtApellidoNuevo)));
            
            out.print("<br>("+ txtNombre + "," + txtApellido + ") <br>Se han gaurdado de forma con éxito en la base de datos.<br><br><br>");
            
        %>
        
        <br>
          <a href="formulario.html"> Ingresar </a> | 
          <a href="verCollection.jsp"> Listar Registros </a> | 
          <a href="consulta.html"> Consultar </a> 
        <br>
        
    </body>
</html>
