/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploaccesodatos;

/**
 *
 * @author xp
 */
public class EjemploAccesoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        GestorConexion gc = new GestorConexion();
        gc.insertar();
        gc.cerrar_conexion();
        
//        PoolConexiones pc = new PoolConexiones();
//        pc.cerrar_conexion();
        
    }
}