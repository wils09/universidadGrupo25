
package universidadgrupo25.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo25.Entidades.Alumno;
import universidadgrupo25.Entidades.Materia;
import universidadgrupo25.Vistas.Inscripcion;


public class InscripcionData {
   private  Connection con=null;
   private MateriaData md= new MateriaData ();
   private AlumnoData ad= new AlumnoData ();
   
    
 public InscripcionData(){
    
        this.con=Coneccion.getConection();
        
    }
 public void guardarInsc (Inscripcion insc){
    
        String sql="INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUE (?, ?, ?)";
    try {    
        PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, insc.getIdAlumno());
        ps.setInt(2, insc.getIdMateria());
        ps.setDouble(3, insc.getNota());
        ps.executeUpdate();
        ResultSet rs= ps.getGeneratedKeys();
        if(rs.next()){
        
            insc.setIdInscripcion(rs.getInt(1));
            JOptionPane.showMessageDialog(null,"Inscripcion guardada");
        }
        ps.close();              
                
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion ");
    }
    
    } 

 public void actualizarNota (int idAlumno, int idMateria, double nota){
   
       try {
           String sql= "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
                   
                   PreparedStatement ps= con.prepareStatement(sql);
                   ps.setDouble(1, nota);
                   ps.setInt(2, idAlumno);
                   ps.setInt(3, idMateria);
                   int fan= ps.executeUpdate();
                   if ( fan> 0){
                       JOptionPane.showMessageDialog(null, "Inscripcion actualizada ");
                   }
                   ps.close();
                   
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion ");
       }
               
   }
   
 public void borrarInscMatAlum (int idAlumno, int idMateria){
   
       String sql= "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
       
       try {
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setInt(1, idAlumno);
           ps.setInt(2, idMateria);
           int fbi= ps.executeUpdate();
           if (fbi>0){
               JOptionPane.showMessageDialog(null, "Borrada inscripcion ");
           }
           
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al borrar en la tabla Inscripcion ");
       }
       
   }
   
 public List<Inscripcion> obtenerInscripto (){
 
        ArrayList<Inscripcion> inscripto= new ArrayList<>();
        
        String sql= "SELECT * FROM inscripcion";
        
        try {
           PreparedStatement ps= con.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
           while (rs.next()){
              Inscripcion insc= new Inscripcion();
              insc.setIdInscripcion(rs.getInt("idInscripcion"));
              Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
              Materia mat=md.buscarMateria(rs.getInt("idMateria"));
              insc.setIdAlumno(alu);
              insc.setIdMateria(mat);
              insc.setNota(rs.getDouble("nota"));
              inscripto.add(insc);
                                       
           }
            ps.close();
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al listar inscripcion");
 
        }
        return inscripto;  
    }
 
 public List<Inscripcion> obtenerInscriptoAlumno (int idAlumno){
 
        ArrayList<Inscripcion> inscripto= new ArrayList<>();
        
        String sql= "SELECT * FROM inscripcion WHERE idAlumno =?";
        
        try {
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setInt(1, idAlumno);
           ResultSet rs= ps.executeQuery();
           while (rs.next()){
              Inscripcion insc= new Inscripcion();
              insc.setIdInscripcion(rs.getInt("idInscripcion"));
              Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
              Materia mat=md.buscarMateria(rs.getInt("idMateria"));
              insc.setIdAlumno(alu);
              insc.setIdMateria(mat);
              insc.setNota(rs.getDouble("nota"));
              inscripto.add(insc);
                                       
           }
            ps.close();
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al listar inscripcion");
 
        }
        return inscripto;  
    }
 
 public List<Materia> obtenerMateriasCursadas (int idAlumno){
 
     ArrayList<Materia> materias= new ArrayList<>();
     String sql= "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia"
             + "WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
     
       try {
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setInt(1,idAlumno);
           ResultSet rs= ps.executeQuery();
           while(rs.next()){
                
               Materia materia= new Materia ();
               materia.setIdMateria(rs.getInt("idMateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("año"));
               materias.add(materia);    
       
            }
            ps.close();  
         
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion");
       }
     return materias;   
 
 }
 
 public List<Materia> obtenerMateriasNoCursadas (int idAlumno){
 
     ArrayList<Materia> materias= new ArrayList<>();
     String sql= "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
             + "SELECT idMateria FROM inscripcion WHERE idAlumno = ?";
     
        try {
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setInt(1,idAlumno);
           ResultSet rs= ps.executeQuery();
           while(rs.next()){
                
               Materia materia= new Materia ();
               materia.setIdMateria(rs.getInt("idMateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("año"));
               materias.add(materia);    
       
            }
            ps.close();  
         
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion");
       }
     return materias;    
 
 }
 
 public List<Alumno> obtenerAlumnoPorMateria (int idMateria){
 
     ArrayList<Alumno> alumnosXMateria= new ArrayList<>();
     String sql= "SELECT a.idAlumno, dni, nombre, apellido, fechaNac, estado"
             + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno "
             + "AND idMateria = ? AND estado = 1";
     
       try {
           PreparedStatement ps = con.prepareCall(sql);
           ps.setInt(1, idMateria);
           ResultSet rs = ps.executeQuery();
           while (rs.next()){
           
               Alumno alumno= new Alumno();
               alumno.setIdAlumno(rs.getInt("idAlumno"));
               alumno.setApellido(rs.getNString("apellido"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setDni(rs.getInt("dni"));
               alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
               alumno.setActivo(rs.getBoolean("activo"));
               alumnosXMateria.add(alumno);
                                        
           }
           
           ps.close();
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a las tablas ");
       }
       return alumnosXMateria;   
  
 }
 
}