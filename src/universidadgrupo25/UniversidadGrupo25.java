/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadgrupo25;


import java.util.List;
import universidadgrupo25.Entidades.Materia;
import universidadgrupo25.accesoADatos.MateriaData;

import java.sql.Connection;
import universidadgrupo25.Entidades.*;

import universidadgrupo25.accesoADatos.*;



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
        Connection con = Coneccion.getConection();
        
        
       /* AlumnoData ad= new AlumnoData ();
        MateriaData md= new MateriaData();
        InscripcionData id= new InscripcionData ();
        
        Alumno Rafael=ad.buscarAlumno(3);
        Materia Lengua= md.buscarMateria(7);
        Inscripcion insc= new Inscripcion ();
        id.guardarInscripcion(insc);
        
        
        /*for(Inscripcion insc: id.obtenerInscripto()){
        
                System.out.print("id "+inscripcion.getIdInscripcion());
                System.out.print("Apellido "+inscripcion.getAlumno().getApellido());
                System.out.print("Materia "+inscripcion.getMateria().getNombre()));
        }*/
        
       
        
    }
    
}
