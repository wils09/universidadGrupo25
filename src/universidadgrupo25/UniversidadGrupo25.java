/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadgrupo25;

import java.sql.Connection;
import java.sql.PreparedStatement;
import universidadgrupo25.Entidades.Alumno;
import universidadgrupo25.accesoADatos.Coneccion;

/**
 *
 * @author Aldo
 */
public class UniversidadGrupo25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con=null; 
           PreparedStatement ps = null;
           Alumno alumno = null;
           //llamamos a conexion de la bd
           con = Coneccion.getConection();
    }
    
}
