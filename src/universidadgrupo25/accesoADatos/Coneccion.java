
package universidadgrupo25.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Coneccion {
    
    private static final String url="jdbc:mariadb://localhost/universidadulp";
    private static final String usuario="root";
    private static final String password="";
    
    private static Coneccion connection=null;
    
    private Coneccion(){
        //cargar driver
    
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase Connection: Error al cargar Driver"+ ex.getMessage());
        }
    
    }
    
    public static Connection getConection(){
        
        //metodo statico para llavar x el main la connection de la bd
        Connection con=null;
        if (connection == null){
        
                connection=new Coneccion();
        }
        try {
            
            con = DriverManager.getConnection("jdbc:mariadb://localhost/universidadulp","root","");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conecxion" + ex.getMessage());
        
        }
    
        return con;
    }
}
