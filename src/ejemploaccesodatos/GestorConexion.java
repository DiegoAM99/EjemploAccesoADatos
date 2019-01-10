/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploaccesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author xp
 */
public class GestorConexion {
    
    Connection conn1;
    
    
    public GestorConexion(){
        conn1 = null;
        
        try{
            String url="jdbc:mysql://localhost:3306/discografica?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";          
            String user = "root";
            String password = "root";
            
            conn1 = (Connection) DriverManager.getConnection(url, user, password);
            if(conn1 != null){
                System.out.println("Conectado a discografica...");
            }
        }catch(SQLException ex){
            System.out.println("ERROR: direccion o usuario/clave no válida");
        }
    }
    
    
    
    public void cerrar_conexion(){
        try{
            conn1.close();
            System.out.println("Conexion cerrada");
        
        }catch(SQLException ex){
            System.out.println("Error al cerrar la conexion");
        }
    }
    
    public void insertar(){
        try{
            //Crea un statement
            Statement sta = conn1.createStatement();
            
            //Ejecuta la insercion
            sta.executeUpdate("INSERT INTO album VALUES(2, 'Greatest Hits', 'Queen')");
            //Cierra el statement
            sta.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al hacer un insert");
            ex.printStackTrace();
        }
    }
}
