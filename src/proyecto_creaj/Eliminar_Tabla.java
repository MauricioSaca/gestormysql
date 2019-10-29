//Contenedor de clases
package proyecto_creaj;

//Importancion de paquetes
import cdb.edu.util.Conexion;
import cdb.edu.util.Mostrar;
import java.sql.*;
import javax.swing.JOptionPane;

//Inicio de la clase
public class Eliminar_Tabla extends javax.swing.JFrame {
    //Bandera  
    Integer estadocombo=0;
    //Creacion e instancion de objeto objeto_mostrar de la clase Mostrar
    Mostrar objeto_mostrar = new Mostrar();
    //Metodo Contructor
    public Eliminar_Tabla() {
        //Inicio de componentes
        initComponents();
        //Ejecutamos metodo del objeto para visualizar las bases de datos existentes
        objeto_mostrar.Ver(cmbBases);
    }

    /*Este método se llama desde el constructor para inicializar el formulario.      
     ADVERTENCIA: No intente modificar este código.
     El contenido de este método es siempre 
     Regenerados por el editor de formularios.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbBases = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbTablas = new javax.swing.JComboBox();
        btnEliminarTabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Bases de datos y Tablas"));

        jLabel1.setText("Seleccione Base de datos");

        cmbBases.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBasesItemStateChanged(evt);
            }
        });
        cmbBases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBasesActionPerformed(evt);
            }
        });

        jLabel2.setText("Tablas de la base de datos");
        jLabel2.setToolTipText("");

        btnEliminarTabla.setText("Eliminar");
        btnEliminarTabla.setEnabled(false);
        btnEliminarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbBases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTablas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTabla)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBasesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBasesItemStateChanged
        
   }//GEN-LAST:event_cmbBasesItemStateChanged

    private void cmbBasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBasesActionPerformed

        if (estadocombo == 0) {
            estadocombo = 1;

        } else {
            //Ejecutamos otro metodo de la objeto_mostrar para visualizar las tablas que posee la base de datos
            objeto_mostrar.Ver_Tablas(cmbBases, cmbTablas);
            //Habilitamos Boton
            btnEliminarTabla.setEnabled(true);
        }

    }//GEN-LAST:event_cmbBasesActionPerformed

    private void btnEliminarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTablaActionPerformed
        
        try{//Inicio del try
         //Variables contenedora de la base de datos a utilizar   
         String sqlQuery;
         //Variable contenedora del query
         String sqlEliminar;
         //Capturamos y Asignamos la base de datos
         sqlQuery = cmbBases.getSelectedItem().toString();
         //Creamos e instanciamos un objeto de tipo Conexion mandandole de paramtro la base de datos
         Conexion conexion2 = new Conexion(sqlQuery);   
         //Creamos la consulta 
         sqlEliminar="drop table "+cmbTablas.getSelectedItem().toString();
         //Ejecutamos la consulta
         conexion2.setQuery(sqlEliminar);
         //Mostramos mensale
         JOptionPane.showMessageDialog(rootPane, "Tabla "+cmbTablas.getSelectedItem().toString()+" Eliminada exitosamente");
         //Remuevo Tabla Eliminada
         cmbTablas.removeItem(cmbTablas.getSelectedItem());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btnEliminarTablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Eliminar_Tabla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarTabla;
    private javax.swing.JComboBox cmbBases;
    private javax.swing.JComboBox cmbTablas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
