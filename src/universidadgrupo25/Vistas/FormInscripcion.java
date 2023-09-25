/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo25.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo25.Vistas.*;
import universidadgrupo25.Entidades.*;
import universidadgrupo25.accesoADatos.*;


/**
 *
 * @author HP
 */
public class FormInscripcion extends javax.swing.JInternalFrame {
   private List<Materia> listaM; 
   private List<Alumno> listaA;
   private InscripcionData inscD;
   private MateriaData md;
   private AlumnoData ad;
   private DefaultTableModel model;
   
    public FormInscripcion() {
     
        initComponents();
        ad= new AlumnoData();
        md= new MateriaData ();
        inscD= new InscripcionData();
        listaA=  ad.listarAlumnos();
        model= new DefaultTableModel();
        cargarAlumno();
        editartabla();
        cargarMatInsc();
        cargarMatNoInsc();
        
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtInscripcion = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnularInsc = new javax.swing.JButton();
        jrbMatNoInsc = new javax.swing.JRadioButton();
        jrbMatInsc = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();
        jcbAlumno = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de inscripcion");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de materias ");

        jtInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jtInscripcion);

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnularInsc.setText("Anular inscripcion");
        jBAnularInsc.setEnabled(false);
        jBAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscActionPerformed(evt);
            }
        });

        jrbMatNoInsc.setText("Materia No Inscriptas");
        jrbMatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatNoInscActionPerformed(evt);
            }
        });

        jrbMatInsc.setText("Materias Inscripta");
        jrbMatInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatInscActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbAlumnoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBInscribir)
                        .addGap(49, 49, 49)
                        .addComponent(jBAnularInsc)
                        .addGap(49, 49, 49)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jrbMatInsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbMatNoInsc)
                        .addGap(52, 52, 52)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMatNoInsc)
                    .addComponent(jrbMatInsc))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInsc)
                    .addComponent(jBInscribir)
                    .addComponent(jbSalir))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        // TODO add your handling code here:
        int filasSelec = jtInscripcion.getSelectedRow();
        if(filasSelec !=-1){
            Alumno a= (Alumno)jcbAlumno.getSelectedItem();
            
            int idMateria= (Integer)model.getValueAt(filasSelec, 0);
            String nombre= (String) model.getValueAt(filasSelec,1);
            int anio= (Integer)model.getValueAt(filasSelec, 2);
            Materia m= new Materia (idMateria, nombre, anio, true);
           
            Inscripcion i= new Inscripcion (a,m,0);
            
            inscD.guardarInscripcion(i);
            
            borrarFilaTabla();
            
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

        
    private void jBAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscActionPerformed
        // TODO add your handling code here:
        int filasSelec = jtInscripcion.getSelectedRow();
        if(filasSelec !=-1){
            Alumno a= (Alumno)jcbAlumno.getSelectedItem();
            
            int idMateria= (Integer)model.getValueAt(filasSelec, 0);
            
            inscD.borrarInscMatAlum(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
    }//GEN-LAST:event_jBAnularInscActionPerformed

    private void jrbMatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatNoInscActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jrbMatInsc.setSelected(false);
        cargarMatNoInsc();
        jBAnularInsc.setEnabled(false);
        jBInscribir.setEnabled(true);
    }//GEN-LAST:event_jrbMatNoInscActionPerformed

    private void jrbMatInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatInscActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jrbMatNoInsc.setSelected(false);
        cargarMatInsc();
        jBAnularInsc.setEnabled(true);
        jBInscribir.setEnabled(false);
    }//GEN-LAST:event_jrbMatInscActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbAlumnoMouseClicked

    private void cargarAlumno (){
        for (Alumno item: listaA){
            jcbAlumno.addItem(item);
        }
    }
    
    private void borrarFilaTabla(){
        int indice= model.getRowCount() -1;
        for (int i= indice; i>=0; i--){
            model.removeRow(i);
        }
    }
    
    private void cargarMatNoInsc (){
        Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
        listaM = inscD.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for(Materia m: listaM){
            model.addRow(new Object [] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()} );
        }
    }
    
     private void cargarMatInsc (){
        Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
        listaM = inscD.obtenerMateriasCursadas(selec.getIdAlumno());
        for(Materia m: listaM){
            model.addRow(new Object [] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()} );
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBAnularInsc;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JRadioButton jrbMatInsc;
    private javax.swing.JRadioButton jrbMatNoInsc;
    private javax.swing.JTable jtInscripcion;
    // End of variables declaration//GEN-END:variables
private void editartabla(){
    
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Nota");
    
    jtInscripcion.setModel(model); 
}

   
    
}
    

    

    
   
