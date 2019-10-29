//Contenedor de clases
package proyecto_creaj;


//////////////////////Llamada a paquetes////////////////////////////
import cdb.edu.util.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

//////////////////////////////Inicio de la clase//////////////////////////////////
public class Ver_Bases extends javax.swing.JFrame {//Inicio de la clase
 
//Constructor
    public Ver_Bases() {//Inicio del constructor
        //Inicializacion de todos los componentes Swing
        initComponents();
    }//Fin del constructor

    /*Este método se llama desde el constructor para inicializar el formulario.      
     ADVERTENCIA: No intente modificar este código.
     El contenido de este método es siempre 
     Regenerados por el editor de formularios.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtABases = new javax.swing.JTextArea();
        btnVer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 204), null), "Bases de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        txtABases.setColumns(20);
        txtABases.setRows(5);
        jScrollPane1.setViewportView(txtABases);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVer.setText("Listar Bases");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        //Tabla Virtual que contendra los datos obtenidos de la consulta
        ResultSet rs;
        //Variable que guarda la consulta a realizar
        String bases="";
        try{//Inicio del try
            //Creacion e instanciacion del objeto Conexion
            Conexion conexion1 = new Conexion();
            //Variable que guarda la consulta
            String sqlMostraBase;
            //Creacion de la consulta       
            sqlMostraBase = "show databases";
            //Metodo que nos permite fijar los datos de la consulta realizada
            conexion1.setRs(sqlMostraBase);
            //Metodo que permite obtener los valores del ResultSet
            rs= conexion1.getRs();
            // recorrido de los datos obtenidos por el ResultSet misntras rs==true
            while (rs.next()){//Inicio del while 
               //No mostramos bases de datos del sistema
                if((rs.getString(1).equals("information_schema"))||(rs.getString(1).equals("mysql"))||(rs.getString(1).equals("performance_schema"))||(rs.getString(1).equals("test"))){
                    //Removemos esa bases
                    txtABases.removeAll();
                }
                else{
                    //Obtenemos los datos
                    bases= bases + rs.getString(1) + "\n";
                    //Mostramos los datos en el TextArea
                    txtABases.setText(bases);
                }  
            }//Fin de la clase
        }//Fin del try
        catch (Exception ex) {//Inicio del cacth
            JOptionPane.showMessageDialog(null, "Sentencia SQL incorrecta "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }//fin del catch    
    }//GEN-LAST:event_btnVerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //Mostramos Menu
       new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {//Inicio del metodo principal
    
        java.awt.EventQueue.invokeLater(new Runnable() {//Encapsula máquinas asíncronas de distribución de eventos que extrae los eventos

            public void run() {//Inicio del metodo
                new Ver_Bases().setVisible(true);//Muestra el Jframe Creado
                
            }//Fin del metodo
        });//Fin de la clase EventQuene
    }//Fin del metodo principal
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtABases;
    // End of variables declaration//GEN-END:variables

}//Fin de la clase
