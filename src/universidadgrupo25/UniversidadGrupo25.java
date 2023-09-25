/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadgrupo25;

import java.util.List;
import universidadgrupo25.Entidades.Materia;
import universidadgrupo25.accesoADatos.MateriaData;

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
        universidadgrupo25.accesoADatos.Coneccion.getConection();
        
        MateriaData matdata = new MateriaData();
        List<Materia> lista = matdata.listarMaterias();
        System.out.println(lista);
        
    }
    
}
