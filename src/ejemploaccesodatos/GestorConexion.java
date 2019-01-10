/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploaccesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author xp
 */
public class GestorConexion {
    Connection conex;
    public void GestorConexion(){
        conex = null;
        
        try{
            String url = "jdbc:mysql://localhost:3306/discografica";
            String user = "";
            String password = "";
            
            conex = (Connection) DriverManager.getConnection(url, user, password);
            if(conex != null){
                System.out.println("Conectado a discografica");
            }
        }catch(SQLException ex){
            System.out.println("ERROR: direccion o usuario/clave no válida");
            ex.printStackTrace();
        }
    }
}
