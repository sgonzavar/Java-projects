package datos;

import java.sql.*;

public class Conexion {
    
    private String bd;
    private String dsn;
    private Connection cn;
    private Statement s;
    private ResultSet rs;
    private CallableStatement cstmt;
    
    
    public Conexion(){
        
        bd="Almacen";
        dsn="jdbc:sqlserver://SALAK402-16;databaseName=" + bd + ";user=sa;password=123456";
        
    }
    
    public void abrirConexion(){
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn= DriverManager.getConnection(dsn);
            
        
        
        }catch(Exception ex){
            
            
            
        }
        
        
    }
    
    
    public String ConsultarBD(String ced){
        
        try{
        
        s = cn.createStatement();
        
        rs = s.executeQuery ("select * from Cliente where cedula = " + ced);
        
                
        
        rs.next();
        
        
        return rs.getString(1);
        
        
        
        
        }catch(Exception ex){
            
            return null;
            
        }
    }
    
    
    public boolean InsertarBD(String ced, String nom){
        
        try{
            
            int filaguardada;
            
            s = cn.createStatement();
           
           filaguardada = s.executeUpdate("Insert into Cliente values('" + ced + "', '" + nom + "')");
            
           
           
           filaguardada = cstmt.executeUpdate();
           
           
           if (filaguardada == 1){
               
               return true;
               
           }else{
               
               return false;
           }
            
            
            
        }catch(Exception ex){
            
            return false;
            
        }
        
    }
    
    public void cerrarConexion(){
        
        try{
            
           cn.close();
            
        }catch(Exception e){
            
            
        }
        
        
    }
    
    
}
