
package universidadgrupo25.accesoADatos;



import universidadgrupo25.Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;
import universidadgrupo25.Vistas.FormAlumno;
public class AlumnoData {
    
    private Connection con = null;
    
    public AlumnoData() {

    con = Coneccion.getConection();
 
    }
    
    public void guardarAlumno(Alumno alumno) {

    String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNac, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //Aca buscamos a la columna idAlumno por numero en vez de por nombre
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se añadio con exito.");
                
            }
                ps.close();

                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 

            }catch(Exception e){
                System.out.println(e);
            }
}
    
     public void modificarAlumno (Alumno alumno){
       
        String sql= "UPDATE alumno SET dni=?, nombre=?, apellido=?, fechaNac=?, estado=? WHERE idAlumno=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3,alumno.getApellido() );
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6,alumno.getIdAlumno());
            int exito= ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Alumno modificado");
                
            }else{
                
                JOptionPane.showMessageDialog(null,"Alumno no se puedo modificar");
            }
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al modificar un alumno");
            
        }  
    
    }
    
    public void eliminarAlumno(int dni){
        
        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas eliminar este alumno?");
        
        if(opcion == JOptionPane.YES_OPTION){
            
            String sql= "UPDATE alumno SET estado=0 WHERE dni=? AND estado = 1";

            try {
                PreparedStatement ps= con.prepareStatement(sql);

                ps.setInt(1, dni);
                int exito= ps.executeUpdate();

                if(exito==1){
                    JOptionPane.showMessageDialog(null,"Alumno eliminado");
                }


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al eliminar un alumno");
            }  
        }else{
            return;
        }
    
    }
    
    public Alumno buscarAlumno (int id){
            

        String sql="SELECT dni, nombre, apellido, fechaNac, estado FROM alumno WHERE idAlumno =?";

        Alumno alumno=null;
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
            
            alumno=new Alumno();
            alumno.setIdAlumno(id);
            alumno.setDni(rs.getInt("dni"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setApellido(rs.getString("apellido"));
            
            alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
            alumno.setActivo(rs.getBoolean("estado"));                      
            
            
            
            
            }else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al buscar un alumno");
        }
            
        return alumno;    
        }
               
    public Alumno buscarAlumnoPorDni (int dni){
            
        String sql="SELECT idAlumno, dni, nombre, apellido, fechaNac, estado FROM alumno WHERE dni =?";
        Alumno alumno=null;
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1,dni);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
            
            alumno=new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setActivo(rs.getBoolean("estado"));
            alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
            
            
            
            }else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al buscar un alumno " + ex);
        }
            
        return alumno;    
        }
 
    public List<Alumno> listarAlumnos (){
            
        String sql="SELECT idAlumno, dni, nombre, apellido, fechaNac FROM alumno WHERE estado=1";
        ArrayList<Alumno> alumnos= new ArrayList<>();
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
            
            Alumno alumno=new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setApellido(rs.getString("apellido"));
            
            alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
            alumno.setActivo(true);
            
            alumnos.add(alumno);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al buscar un alumno");
        }
            
        return alumnos;    
        }
    }