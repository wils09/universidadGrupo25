
package universidadgrupo25.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo25.Entidades.Alumno;
import universidadgrupo25.Entidades.Materia;


public class MateriaData {
       
     private Connection con=null;
     
public MateriaData(){
    con=Coneccion.getConection();
    
}

public void guardarMateria(Materia materia) {

    String sql= "INSERT INTO materia (nombre, anio , estado)"
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

public Materia buscarMateria (String nombre){
    
    Materia materia = null;
    
    String sql= "SELECT idMateria, anio, estado FROM materia WHERE nombre=?";
    
    
     
    try {
        PreparedStatement ps= con.prepareStatement(sql);
        
            ps.setString(1,nombre);
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()){
            
            materia=new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(nombre);
            materia.setAnio(rs.getInt("anio"));                                           
            materia.setEstado(rs.getBoolean("estado"));
                                               
            
            }else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
            
        }
         return materia;
               
}

public void modificarMateria (Materia materia){
       
        String sql= "UPDATE materia SET nombre=?, anio=?, estado=? WHERE idMateria=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4,materia.getIdMateria());
            int exito= ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Materia modificada");
                
            }else{JOptionPane.showMessageDialog(null, "Error, no se modifico nada, id incorrecta");}
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al modificar una materia");
            
        }  
                
    }
    
//public void eliminarMateia(int id){
//        
//        String sql= "UPDATE materia SET estado=0 WHERE idMateria=?";
//        
//        try {
//            PreparedStatement ps= con.prepareStatement(sql);
//            
//            ps.setInt(1, id);
//            int exito= ps.executeUpdate();
//            if(exito==1){
//                JOptionPane.showMessageDialog(null,"Materia eliminada");
//            }
//            
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error al eliminar una materia");
//        }  
//    
//    
//    }
    
public List<Materia> listarMaterias (){
            
        String sql="SELECT idMateria, nombre, anio FROM materia WHERE estado=1";
        ArrayList<Materia> materias= new ArrayList<>();
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
            
            Materia materia=new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("anio"));
            materia.setEstado(true);     
            
            materias.add(materia);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al buscar una materia");
        }
            
        return materias;    
        }
}
