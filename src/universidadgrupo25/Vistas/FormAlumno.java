/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo25.Vistas;

import java.beans.PropertyVetoException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo25.Entidades.Alumno;
import universidadgrupo25.accesoADatos.AlumnoData;

/**
 *
 * @author Ramirez
 */
public class FormAlumno extends javax.swing.JInternalFrame {
    // Instanciar AlumnoData
    AlumnoData ad;
    /**
     * Creates new form FormAlumno
     */
    public FormAlumno() {
        initComponents();
        //Crear un nuevo AlumnoData
        ad = new AlumnoData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jbtnBuscarDni = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jcalFechaNac = new com.toedter.calendar.JDateChooser();
        jbtnGuardar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnSalr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jbtnBuscarId = new javax.swing.JButton();
        jlEstado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alumno");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DNI");

        jbtnBuscarDni.setText("Buscar");
        jbtnBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarDniActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado");

        jrbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbEstadoItemStateChanged(evt);
            }
        });
        jrbEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEstadoStateChanged(evt);
            }
        });
        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha de nacimiento");

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setPreferredSize(new java.awt.Dimension(85, 32));
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnModificar.setText("Modificar");
        jbtnModificar.setPreferredSize(new java.awt.Dimension(85, 32));
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnSalr.setText("Salir");
        jbtnSalr.setPreferredSize(new java.awt.Dimension(85, 32));
        jbtnSalr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalrActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Apellido");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Matricula");

        jbtnBuscarId.setText("Buscar");
        jbtnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSalr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnBuscarDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcalFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscarId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscarDni))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcalFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarDniActionPerformed
        try{
            
        int dni = Integer.parseInt(jtfDNI.getText());
        Alumno al = ad.buscarAlumnoPorDni(dni);
        
        jtfMatricula.setText(al.getIdAlumno()+"");
        jtfNombre.setText(al.getNombre());
        jtfApellido.setText(al.getApellido());
        jrbEstado.setSelected(al.isActivo());
        jcalFechaNac.setDate(Date.valueOf(al.getFechaNac()));
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error al buscar alumno");
            jtfDNI.setText("");
        }catch(NullPointerException e){            
            return;
        }
    }//GEN-LAST:event_jbtnBuscarDniActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Quiere modificar este alumno?");
        
        if(opcion == JOptionPane.YES_OPTION){
        
            try{
                int id = Integer.parseInt(jtfMatricula.getText());
                String nom = jtfNombre.getText();
                String apellido = jtfApellido.getText();
                int dni = Integer.parseInt(jtfDNI.getText());
                boolean estado = jrbEstado.isSelected();
                LocalDate fechaNac = jcalFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();


                if(nom.isEmpty() || apellido.isEmpty() || jtfDNI.getText().isEmpty()){

                    JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
                    return;

                }else{

                    Alumno alumno = new Alumno(id, dni, apellido, nom, fechaNac, estado);

                    ad.modificarAlumno(alumno);
                }

                limpiarCampos();


            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Campo Matricula necesario, no debe contener letras, ni caracteres");
                jtfMatricula.setText("");
                return;
            }catch(NullPointerException er){
                JOptionPane.showMessageDialog(this, "Fecha de nacimiento vacio o incorrecto");
                return;
            }
        }else{
            return;
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        try{
            //Extraer los dato que se da en el view
            String nom = jtfNombre.getText();
            String apellido = jtfApellido.getText();
            int dni = Integer.parseInt(jtfDNI.getText());
            boolean estado = jrbEstado.isSelected();
            LocalDate fechaNac = jcalFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            System.out.println(fechaNac);
            
            if(nom.isEmpty() || apellido.isEmpty()){
                
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
                return;
                
            }else{
                
                //Crear el objeto alumno con las variables como parametros
                Alumno alumno = new Alumno(dni, apellido, nom, fechaNac, estado);

                //Pasamos es onjeto alumno al metodo que lo guarde en la db
                ad.guardarAlumno(alumno);
            }
            
            limpiarCampos();
           
           
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Campo DNI necesario, no debe contener letras, ni caracteres");
            jtfDNI.setText("");
            return;
        }catch(NullPointerException er){
            JOptionPane.showMessageDialog(this, "Fecha de nacimiento vacio o incorrecto");
            return;
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnSalrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalrActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Quiere salir del formulario alumno?");
        
        if(opcion == JOptionPane.YES_OPTION){
            try {
                this.setClosed(true);
            } catch (PropertyVetoException ex) {
                System.out.println(ex);
            }
        }else{
            return;
        }
    }//GEN-LAST:event_jbtnSalrActionPerformed

    private void jbtnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarIdActionPerformed
        try{
            
        int id = Integer.parseInt(jtfMatricula.getText());
        Alumno al = ad.buscarAlumno(id);
        
        jtfDNI.setText(al.getDni()+"");
        jtfNombre.setText(al.getNombre());
        jtfApellido.setText(al.getApellido());
        jrbEstado.setSelected(al.isActivo());
        jcalFechaNac.setDate(Date.valueOf(al.getFechaNac()));
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error al buscar alumno");
            jtfMatricula.setText("");
        }catch(NullPointerException e){            
            return;
        }
    }//GEN-LAST:event_jbtnBuscarIdActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jrbEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEstadoStateChanged
        
    }//GEN-LAST:event_jrbEstadoStateChanged

    private void jrbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbEstadoItemStateChanged
        boolean estado = jrbEstado.isSelected();
        
        if(estado){
            jlEstado.setText("Regular");
        }else{
            jlEstado.setText("Libre");
        }
    }//GEN-LAST:event_jrbEstadoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnBuscarDni;
    private javax.swing.JButton jbtnBuscarId;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnSalr;
    private com.toedter.calendar.JDateChooser jcalFechaNac;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
        jtfMatricula.setText("");
        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jrbEstado.setSelected(false);
        jcalFechaNac.setDate(null);
        jlEstado.setText("");
    }
}
