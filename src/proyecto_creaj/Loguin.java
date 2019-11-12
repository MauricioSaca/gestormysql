//Contendedor de clases
package proyecto_creaj;

///////////////Llamada a paquetes//////////////////
import javax.swing.JOptionPane;
import javax.swing.*;//paquete contenedor de elementos swing
import org.jvnet.substance.*;//paquete para usar look and feeld
import org.jvnet.substance.watermark.*;//paquetes para manejar las marcas de agua
public class Loguin extends javax.swing.JFrame {//Inicio de la clase
    //Metodo Constructor
    public Loguin() {//Inicio Constructor
       //Le decimos al SO que java se encargara del manejo de la decoracion
       //del contorno de la ventana
       JFrame.setDefaultLookAndFeelDecorated(true);
       //Aplicamos un skin a nuestra ventana, en este caso SaharaSkin
       SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");
       SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSaturatedTheme");
       SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");
       initComponents();//Metodo que inicializa todos los componentes Swing
    }//Fin Constructor

   /*Este método se llama desde el constructor para inicializar el formulario.      
     ADVERTENCIA: No intente modificar este código.
      El contenido de este método es siempre 
     Regenerados por el editor de formularios.*/
   
    @SuppressWarnings("unchecked")
    
 ////////////////////////////////////////////////////////////   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Cerrar(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 51), new java.awt.Color(0, 0, 0)), "Gestor de Bases de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 255)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_creaj/Imagenes/ingreso.png"))); // NOI18N

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_creaj/Imagenes/aceptar.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_creaj/Imagenes/cancelar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Usuario:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Password:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(txtContra)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       ////////////Validaciones por medio de estructuras condicionales/////////////////////
        if(txtNombre.getText().equals("admin")&&txtContra.getText().equals("admin")){//Inicio del if
        //Si el usuario y el password son correctos nos muestra el menu
            new Menu().setVisible(true);//Creacion del Objeto Menu
            this.dispose();//Hacemos una referencia al objeto menu y que libere el recurso utilizado
        }//Fin del if
        else if(txtNombre.getText().equals("")&&txtContra.getText().equals("")){//Inicio del elseif
        //Si el usuario no ingresa su nombre ni el password mensaje de error
             JOptionPane.showMessageDialog(null, "Ingrese el Usuario y el Password","Error",JOptionPane.ERROR_MESSAGE);
        }//Fin del elseif
        else{//Inicio del else
        //En caso de que ninguna de las otras condiciones se cumpla el usuario y el password son incorrectos    
             JOptionPane.showMessageDialog(null, "Usuario y Password incorrecto");
        //Limpiamos Texbox para que vuelva a intentar Ingresar
            txtNombre.setText("");
            txtContra.setText("");
        }//Fin del else
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void Cerrar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Cerrar
        //Metofo por si desea cerrar la Aplicacion
        //Variable que guarda el valor numerico que devuelve el ConfirmDialog
        int result=JOptionPane.showConfirmDialog(this, "Desea Salir de la Aplicacion");
        if(result==JOptionPane.YES_OPTION){//Inicio del if
        //Si este valor es Afirmativo (0) cierra la aplicacion
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        }//Fin del if
        else if(result==JOptionPane.NO_OPTION){//Inicio del elseif
        //Si este valor es negativo (1) Continua la aplicacion 
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        }//Fin del elseif
    }//GEN-LAST:event_Cerrar

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
   //Cierre de aplicacion
    new Loguin().setVisible(false);//Creacion del Objeto Loguin
    this.dispose();//Referencia hacia el objeto Loguin para cerrar aplicacion y liberar recurso
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
          //Evento para Validar el Ingreso de datos// 
        char cadena_caracteres;//Varible de tipo Char 
        cadena_caracteres=evt.getKeyChar();//Igualamos la variable para capturar lo ingresado por teclado
        if(!(cadena_caracteres<'0'||cadena_caracteres>'9')){//Inicio del if
        evt.consume(); // ignorar el evento de teclado
            JOptionPane.showMessageDialog(null, "Error No puede Ingresar Numeros","Error",JOptionPane.ERROR_MESSAGE);
        }//Fin del if
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
            //Evento para Validar el Ingreso de datos// 
        char cadena_caracteres;//Varible de tipo Char 
        cadena_caracteres=evt.getKeyChar();//Igualamos la variable para capturar lo ingresado por teclado
        if(!(cadena_caracteres<'0'||cadena_caracteres>'9')){//Inicio del if
        evt.consume(); // ignorar el evento de teclado
            JOptionPane.showMessageDialog(null, "Error No puede Ingresar Numeros","Error",JOptionPane.ERROR_MESSAGE);
        }//Fin del if
    }//GEN-LAST:event_txtContraKeyTyped

  
    public static void main(String args[]) {//Inicio del metodo Principal
       
        java.awt.EventQueue.invokeLater(new Runnable() {//Encapsula máquinas asíncronas de distribución de eventos que extrae los eventos

            public void run() {//Inicio del metodo
                new Loguin().setVisible(true);//Muestra el Jframe Creado
            }//Fin del metodo
        });//Fin de la clase
    }//Fin del metodo Princiapal
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
