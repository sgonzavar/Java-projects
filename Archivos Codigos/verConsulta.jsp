<%-- 
    Document   : verFiltro
    Created on : 03-oct-2016, 13:35:16
    Author     : Edi
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="com.mongodb.client.FindIterable"%>
<%@page import="java.util.List"%>
<%@page import="com.mongodb.client.model.Filters"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.MongoClientURI"%>
<%@page import="static com.mongodb.client.model.Filters.eq"%>
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
        <div><h1>Consulta a MongoDB</h1></div>
          <br>
            Selecciona de la base de datos MongoDB el documento que es igual al valor del criterio. 
          <br>
          <br>
          <form action="verConsulta.jsp">
           
            Criterio de busqueda (nombre):
            <input type="text" name="criterio" value="">  
            <br>
            <input type="submit" value="Buscar">
          </form>
           
          <br>
          <br>
          --[ RESULTADO ]------------------------------
          <br>
          
        <% 
            String txtCriterio = request.getParameter("criterio"); 
            
            out.print("<h3>Filtrado por... Nombre = "+txtCriterio+"</h3>");
            
            MongoClientURI mongoURI =new MongoClientURI(""
                    + "mongodb://usuario01:qwerty123@ds049486.mlab.com:49486/clasejsp2016");
            MongoClient conexion = new MongoClient(mongoURI);
            
            MongoDatabase db = conexion.getDatabase("clasejsp2016");
            
            MongoCollection<Document> coleccion = db.getCollection("listado");
            
            //List<Document> docs1 = coleccion.find().into(new ArrayList<Document>());
            List<Document> docs = coleccion.find(new Document("nombre",txtCriterio)).into(new ArrayList<Document>()); //.first();
          
            if (docs.size() != 0){
            out.print("<table>");
            out.print("  <tr>");
            out.print("    <th>Nombre</th>");
            out.print("    <th>Apellido</th>");
            out.print("    <th>Acciones</th>");
            out.print("  </tr>");
 
  
            for (int i = 0; i < docs.size(); i++) {
                //docs.add(new Document("i", i));
                Document xxx = (Document)docs.get(i);
                String txtNombre = xxx.getString("nombre");
                String txtApellido = xxx.getString("apellido");
                //String txtId = xxx.getString("_id.ObjectId");
                //out.print("("+i+"): Nombre: "+txtNombre+", Apellido: "+txtApellido+" <br>");
           
                out.print("<tr>");
                out.print("  <td>"+txtNombre+"</td>");
                out.print("  <td>"+txtApellido+"</td>");
                out.print("  <td><a href='atenderEditar.jsp?nombre="+txtNombre+"&apellido="+txtApellido+"'> "
                        + "          <img src='images/edit2.png'></a> "
                        + "      <a href='atenderBorrado.jsp?nombre="+txtNombre+"&apellido="+txtApellido+"'> "
                        + "        <img src='images/delete.png'></a> "
                        + "  </td>");
                out.print("</tr>");
            }
            out.print("<table>");
            } else {
                out.print("No se encuentran coinciencias para " + txtCriterio);
            }
        %>
        
        <br>
          <a href="formulario.html"> Ingresar </a> | 
          <a href="verCollection.jsp"> Listar Registros </a> | 
          <a href="consulta.html"> Consultar </a> 
        <br>
        
    </body>
</html>
