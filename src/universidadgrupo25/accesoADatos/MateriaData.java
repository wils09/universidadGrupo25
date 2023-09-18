/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo25.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo25.Entidades.Materia;

/**
 *
 * @author Sd
 */
public class MateriaData {
       
     private Connection con=null;
     
public MateriaData(){
    con=Coneccion.getConection();
    
}

public void guardarMateria(Materia materia) {

    String sql= "INSERT INTO materia (nombre, año , estado)"
                + "VALUES(?, ?, ?)";
    
         try {
             PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAnio());
             ps.setBoolean(3, materia.isEstado());
             
             ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                            
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia  agregada");
                            
            }
            ps.close();
            
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de materia");
         }
    
}

public Materia buscarMateria (int id){
    
    Materia materia = null;
    
    String sql= "SELECT nombre, año, FROM materia WHERE idMateria=? AND estado=true";
    
    
     
    try {
        PreparedStatement ps= con.prepareStatement(sql);
        
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()){
            
            materia=new Materia();
            materia.setIdMateria(id);
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("año"));                                           
            materia.setEstado(true);
                                               
            
            }else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
            
        }
         return materia;
               
}



}
