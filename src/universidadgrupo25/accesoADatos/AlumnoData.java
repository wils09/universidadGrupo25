
package universidadgrupo25.accesoADatos;

/**
 *
 * @author Aldo
 */
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
public class AlumnoData {
    
    private Connection con = null;
    
    public AlumnoData() {

    con = Coneccion.getConection();
 
    }
    
    public void guardarAlumno(Alumno alumno) {

    String sql = "INSERT INTO alumno (Dni, apellido, nombre, fechaNac, estado) VALUES (?, ?, ?, ?, ?)";
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
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "Se añadio con exito."); 
            }
                ps.close();

                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage()); 

            }
}
    
}
