
package universidadgrupo25.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo25.Vistas.*;
import universidadgrupo25.Entidades.*;
import universidadgrupo25.accesoADatos.*;



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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtInscripcion = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnularInsc = new javax.swing.JButton();
        jcbAlumno = new javax.swing.JComboBox<>();
        jrbMatIns = new javax.swing.JRadioButton();
        jrbMatNoIns = new javax.swing.JRadioButton();

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

        jcbAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbAlumnoMouseClicked(evt);
            }
        });

        jrbMatIns.setText("Materias Inscriptas");

        jrbMatNoIns.setText("Materias No Inscriptas");
        jrbMatNoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatNoInsActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbMatIns)
                                .addGap(80, 80, 80)
                                .addComponent(jrbMatNoIns))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
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
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMatIns)
                    .addComponent(jrbMatNoIns))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInsc)
                    .addComponent(jBInscribir))
                .addContainerGap(23, Short.MAX_VALUE))
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
        }
    }//GEN-LAST:event_jBAnularInscActionPerformed

    private void jcbAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbAlumnoMouseClicked

    private void jrbMatNoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatNoInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMatNoInsActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularInsc;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JRadioButton jrbMatIns;
    private javax.swing.JRadioButton jrbMatNoIns;
    private javax.swing.JTable jtInscripcion;
    // End of variables declaration//GEN-END:variables
private void editartabla(){
    
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Nota");
    
    jtInscripcion.setModel(model); 
}

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
    
}
    

    

    
   
