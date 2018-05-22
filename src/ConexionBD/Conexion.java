package ConexionBD;

import java.sql.*;

        
public class Conexion {
    boolean consulta=false;
    
    public ResultSet consultas(String sql){
        
        String url = "jdbc:postgresql://localhost:5432/Portillo";
        String usuario = "postgres";
        String contrasena = "admin";
        
        try{
        Class.forName("org.postgresql.Driver");
        Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
        java.sql.Statement st = conexion.createStatement();
        consulta=true;
       // if(st==null) consulta=false;
        return st.executeQuery(sql); 
        
        }
        catch(Exception e){
            System.err.println("Error:  "+e.getMessage());
            if(e.getMessage().equals("La consulta no retornó ningún resultado."))consulta=true;
  
            else 
            consulta=false;
        }
        
        return null;
    } 

    public boolean getConsulta() {
        return consulta;
    }
    
    
   
}


/*
libraries ->> add JAR/Folder -> postgresql....
copiar el mismo archivo en la carpeta principal del proyecto

servicios-> DataBases->>new Connection->Postgres

Host: localhost     Port: 5432
DataBase: Postgres
UserName: postgres
Password: password

copiar el url que genera

seleccionar el schema





public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/Portillo";
        String usuario = "postgres";
        String contrasena = "amauri";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url,usuario,contrasena);
            java.sql.Statement st = conexion.createStatement();
            String sql = "select * from portillito.proveedor";
            ResultSet resultado = st.executeQuery(sql);
            
            while(resultado.next()){
                String id = resultado.getString("idproveedor");
                String razon = resultado.getString("razonsocial");
                String telefono = resultado.getString("telefono");
                String email = resultado.getString("email");
                
                System.out.println("ID: "+id+"\trazonsocial: "+razon+"\ttelefono: "+telefono+"\temail: "+email);
            }
            resultado.close();
            st.close();
            conexion.close();     
        }
        catch(Exception e){
            System.out.println("Error de conexion  "+e.getMessage());
        }
    }


*/