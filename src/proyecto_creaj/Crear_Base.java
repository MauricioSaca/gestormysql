//Contenedor de clases
package proyecto_creaj;

//Llamada a paquetes
import cdb.edu.util.Conexion;
import cdb.edu.util.Validaciones;
import java.sql.*;
import javax.swing.JOptionPane;

//Inicio de la clase
public class Crear_Base extends javax.swing.JFrame {
    //Creacion e intanciacion del objeto_vali de la clase Validaciones
    Validaciones objeto_vali = new Validaciones();
    //Constructor que inicia componentes
    public Crear_Base() {
        //Iniciacion de componentes
        initComponents();
    }

    /*Este método se llama desde el constructor para inicializar el formulario.      
     ADVERTENCIA: No intente modificar este código.
     El contenido de este método es siempre 
     Regenerados por el editor de formularios.*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        txtNombreBase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)), "Crear Base de datos"));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtNombreBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBaseKeyTyped(evt);
            }
        });

        jLabel1.setText("Ingrese el nombre de la base de datos");

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
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel1)
                    .addComponent(txtNombreBase, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNombreBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inicio del evento onclick del boton Crear tabla
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        //Variable que captura el nombre de la bases de datos ingresado por el usuario
        String Nombre;
        //Variable que guarda la consulta para la creacion de la base de datos
        String sqlNewBase;
        //Creacion de un objeto tipo ResultSet
        //Es la representación en memoria de las tablas de la base de datos en disco, se puede entender como una tabla virtual
        ResultSet rs=null;
        //Variable que captura el nombre de la base de datos
        String nombreBD;
        //Bandera 
        String estado="0";
        try {//Inicio del try
            //Creacion de objeto tipo conexion y al mismo tiempo se instancia
            Conexion conexion1 = new Conexion();
            //Condicionante si el valor del textbox es igual a 0 es decir vacio muestra respectivo error
            if (txtNombreBase.getText().equals("")){//Inicio del if
                JOptionPane.showMessageDialog(null, "Ingrese el nombre de la base de datos","Error",JOptionPane.ERROR_MESSAGE);
                txtNombreBase.requestFocus();
            }//Fin del if
            else if(objeto_vali.Vali(txtNombreBase)==true){
              //Muestro mensajes de errores
            }
            
            //En caso Contrario realiza las siguientes acciones
            
            else{//Inicio del else
                  //Variable que ejecuta el query show database de msql  
                  String sqlMostraBase;
                  //Asignamos la sentencia a sql a la variable
                  sqlMostraBase = "show databases";        
                  //El objeto conexion con su metodo setRs que executa query del tipo Select 
                  //Mandadole de parametro el query de shw database
                  conexion1.setRs(sqlMostraBase);
                  //Obtenemos el resultado de la consulta y los almacenamos en una tabla virtual que es el ResultSet rs
                  rs= conexion1.getRs();
                  //Capturamos el nombre que el usuario desea para su base de datos
                  Nombre = txtNombreBase.getText();
                  //Estructura repetitiva que ejecuta el metodo next del ResultSet para moverse entre filas de la tabla virtual ya llenada
                  while (rs.next()){//Inicio del while
                      //Asignamos a la variable el nombre de la base de datos ya creada 
                        nombreBD= rs.getString(1);
                        //Verificamos si la base de datos ya existe
                        //Y si la condicion se cumple cambiamos el valor a la bandera
                        if (nombreBD.equalsIgnoreCase(Nombre)){//Inicio del if
                            //Cambio de estado
                            estado="1";
                            //Termina ejecuacion del while
                            break;
                        }//Fin del if
                  }//Fin del while
                
                //Condicionante para mostrar mensaje  
                if (estado.equals("1")){//Inicio del if
                    //Mostramos mensaje
                    JOptionPane.showMessageDialog(null, "La base de datos ya Existe","Error",JOptionPane.ERROR_MESSAGE);
                }//Fin del if
                else{//Inicio del else
                     //Asignamos el query de create database a la variable con el nombre ingresado por el usuario
                     sqlNewBase = "create database " + Nombre;
                     //Metodo del objeto conexion que ejecuta el query de create database
                     conexion1.setQuery(sqlNewBase);
                     //Mostramos el mensaje de que la base de datos fue creada exitosamente
                     JOptionPane.showMessageDialog(null, "Base de datos "+Nombre+" Creada Exitosamente");
                     //Limpiamos Texbox
                     txtNombreBase.setText("");
                }//Fin del else
                
            }//Fin del else
        }//Fin del try 
        catch (Exception ex) {//Inicio del cacth
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
        }//fin del catch
      
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtNombreBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBaseKeyTyped

        //Varible de tipo Char 
        char cadena_caracteres;
        //Igualamos la variable para capturar lo ingresado por teclado
        cadena_caracteres=evt.getKeyChar();
        //Condicion para validar que no ingrese numeros y evitar el colapso del programa
        if(!(cadena_caracteres<'0'||cadena_caracteres>'9')){//Inicio del if
            // ignorar el evento de teclado
            evt.consume();
            //Mostramos mensaje
            JOptionPane.showMessageDialog(null, "Error No puede Ingresar Numeros","Error",JOptionPane.ERROR_MESSAGE);
        }//Fin del if
    }//GEN-LAST:event_txtNombreBaseKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Mostramos menu
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
            java.util.logging.Logger.getLogger(Crear_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Crear_Base().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreBase;
    // End of variables declaration//GEN-END:variables
}
