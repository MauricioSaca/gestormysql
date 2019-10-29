//Contenedor de paquetes
package proyecto_creaj;
//Importacion de clases a utilizar
import cdb.edu.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;
//Inicio de la clase
public class update extends javax.swing.JFrame {
    //Bandera
    Integer estado = 0;
    //Numero de campos que desea mostrar
    Integer numUpdate;
    //Arreglos de objetos a mostrar
    JComboBox Campos[];
    JTextField Set[];
    JTextField Where[];
    JCheckBox modificar[];
    JCheckBox Filtro[];
    //Arreglos que cpturan el valor de cada elemento creado dinamicamente
    String select_campo[];
    String nuevo_valor [];
    String busqueda[];
    Boolean modifique[];
    Boolean filter[];
    //Contador de campos
     Integer conta = 0;
    //Creacion e isntanciacion del objeto_mostrar de la clase Mostrar
    Mostrar objeto_mostrar = new Mostrar();
    Validaciones objeto_vali = new Validaciones();
    //Constructor
    public update() {
        //Unicializacion de los controles
        initComponents();
        //Ejecutanmos metodo del objeto_mostrar que visualizara las bases de datos existentes
        objeto_mostrar.Ver(cmbBases);
    }

    /*Este método se llama desde el constructor para inicializar el formulario.
    ADVERTENCIA: No intente modificar este código. 
    El contenido de este método es siempre regenerados por el editor de formularios.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTabla = new javax.swing.JComboBox();
        cmbBases = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtNumUpdate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jLabel1.setText("Campo");

        jLabel2.setText("Set");

        jLabel5.setText("Where");

        jLabel6.setText("Modificar");

        jLabel7.setText("Filtro");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null), "Seleccion de Base y Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        jLabel3.setText("Tabla");

        jLabel4.setText("Base de datos");

        cmbTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTablaActionPerformed(evt);
            }
        });

        cmbBases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbBases, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null), "Cantidad de campos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        jButton2.setText("Aceptar");
        jButton2.setActionCommand("");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtNumUpdate.setEnabled(false);
        txtNumUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumUpdateKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(8, 8, 8)
                        .addComponent(txtNumUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 204), null), "Realizar Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        jButton3.setText("Aceptar");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTablaActionPerformed
         if(estado == 0){
            estado = 1;
        }
        else{
          try{   
          //Tabla Virtual que captura los datos arrojados por la consuta realizada    
          ResultSet rs;
          //Creacion e instanciacion del objeto con de la clase Conexion mandandole 
          //de parametro la bd
          Conexion con = new Conexion(cmbBases.getSelectedItem().toString());
         //Ejecutamos metodo del objeto con donde mandamos la consulta
          con.setRs("describe "+ cmbTabla.getSelectedItem().toString());
          //Capturamos datos
          rs = con.getRs();
          //Inicialiazmos contador cada vez que cambie de bd
          conta=0;
          //Recorremos los datos recojidos por el ResulSet
          while (rs.next()){//Inicio del while
              //Aumento conatdor
              conta++;
          }//Fin del while
         //Cierro conexion
          con.cerrarConexion();
       }
       catch(Exception ex){
            //JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);          
       } 
            //Muestro el numero de campos a ingresar
           jLabel8.setText("Numero maximo de campos "+ conta.toString());
        }
    }//GEN-LAST:event_cmbTablaActionPerformed

    private void cmbBasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBasesActionPerformed
        if(estado == 0){
           estado = 1;
        }
        else{
          //Ejecutamos metodo del obejto_mostrar para visualizar las tablas de las bd
          objeto_mostrar.Ver_Tablas(cmbBases, cmbTabla);
          //Habilitamos componenetes
          jButton2.setEnabled(true);
          txtNumUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_cmbBasesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if(txtNumUpdate.getText().equals("")){
            //Muestro mensaje
            JOptionPane.showMessageDialog(null, "Campo Vacio","Error",JOptionPane.ERROR_MESSAGE);
            //Limpio el texbox y le mando el foco
            txtNumUpdate.setText("");
            txtNumUpdate.requestFocus();
        }else{
        //Capturo el numero de elementos a ingresar    
        numUpdate = Integer.parseInt(txtNumUpdate.getText());
        if(numUpdate > conta){
            //Muestro mensaje
            JOptionPane.showMessageDialog(null, "Numero de campos invalidos","Error",JOptionPane.ERROR_MESSAGE);
            //Limpio el texbox y le mando el foco
            txtNumUpdate.setText("");
            txtNumUpdate.requestFocus();
        }else{
        //Creacion de vector que guarda los valores del comboBox de tipo de datos 
         Vector<String> valores=new Vector();
         //Istanciamos objetos con el respetivo numero de elemetos
         Campos = new JComboBox[numUpdate];
         Set = new JTextField[numUpdate];
         Where = new JTextField[numUpdate];
         modificar = new JCheckBox [numUpdate];
         Filtro = new JCheckBox[numUpdate];
        //Contador
        Integer contador ;
        //Inicializamos contador
        contador = 0;
        try{
           //Tabla virtual que aloja los datos arrojados por la consulta 
           ResultSet rs;
           //Variable que captura la bd a trabajar
           String base ;
           //Asigancion a la variable de la bd a trabajar
           base = cmbBases.getSelectedItem().toString();
           //Creacion e instaciacion del objeto con mandandole de parametro la bd
           Conexion con = new Conexion(base);
           //Varaiable almacena la consulta
           String Consultabla;
           //Asigancion de consulta
           Consultabla = "describe "+ cmbTabla.getSelectedItem().toString();
          //Envio de consulta
           con.setRs(Consultabla);
           //Capturamos los datos devueltos por la consulta al Rresulset
           rs = con.getRs();
           //Mientras devuelva true agregara valores al vector
           while (rs.next()){
               valores.add(rs.getString(1));
           }
           
           //Creacion de controles dinamicamente
            for (int i=0;i<numUpdate;i++){
            //Se crea el objeto individualmente     
            Campos[i] = new JComboBox(valores);
           // Lo agregamos al Panel
            jPanel1.add(Campos[i]);
            // Le asignamos un nombre al componente
            Campos[i].setName("Campos "+i);
            //Mandamos como parametros x , y, Width , Height
            Campos[i].setBounds(20, contador, 100, 35);
            
            Set[i] = new JTextField("");
            jPanel1.add(Set[i]); 
            Set[i].setName("set "+i);
            Set[i].setBounds(160,contador, 100, 35);
            
            Where[i] = new JTextField("");
            jPanel1.add(Where[i]);
            Where[i].setName("where "+ i);
            Where[i].setBounds(290, contador, 100, 35);
            
            modificar[i] = new JCheckBox();
            jPanel1.add(modificar[i]);
            modificar[i].setName("check "+i);
            modificar[i].setBounds(420, contador, 100, 35);
            
            Filtro[i] = new JCheckBox();
            jPanel1.add(Filtro[i]);
            Filtro[i].setName("filtro "+i);
            Filtro[i].setBounds(520, contador, 100, 35);
             
            //Aumentamos contador
             contador=contador + 50;
             
            }
        //Propiedades del panel
        jPanel1.setAutoscrolls(true);
        jPanel1.setSize(583,310 );
        //Habilitamos boton
        jButton3.setEnabled(true);
        jButton2.setEnabled(false);
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
      }
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            //Contador
            Integer i = 0;
            //Variable que contiene el inicio de la consulta set
            String sqlUpdate ="update "+cmbTabla.getSelectedItem().toString() + " set ";
            //Variable que contiene el inicio del filtrado
            String where = " where ";
            //Intanciacion de lo objetos mandandoles un indice igual numUpdate
            select_campo = new String [numUpdate];
            nuevo_valor = new String [numUpdate];
            busqueda = new String [numUpdate];
            modifique = new Boolean [numUpdate];
            filter = new Boolean [numUpdate];
            //Capturo datos de cada elemento creado dinamicamente
            for(JComboBox elementos : Campos){
             //Capturamos los datos Ingresados por el usuario en el Texbox Nombre Campo
             select_campo[i] = elementos.getSelectedItem().toString();
             //Incrementamos contados por cada iteracion
             i++;
         }
         //Inicializamos nuevamente el contador a 0
         i=0;
         
         for(JTextField elementos : Set){
              if(objeto_vali.Vali(elementos)){
                //Muestro mensajes correspondientes
            }
            else{             
             //Capturamos los datos Ingresados por el usuario
             nuevo_valor[i]=elementos.getText().toString();             
              }
              //Incrementamos contados por cada iteracion
             i++;
         }
         
         i=0;//Inicializamos nuevamente el contador a 0
         
         for(JTextField elementos : Where){
             if(objeto_vali.Vali(elementos)){
                //Muestro mensajes correspondientes
            }
            else{   
             //Capturamos los datos Ingresados por el usuario en el Texbox Nombre Campo
             busqueda[i] = elementos.getText().toString();
             }
             //Incrementamos contados por cada iteracion
             i++;
         }
         
         i=0;//Inicializamos nuevamente el contador a 0
         
         for(JCheckBox elementos : modificar){
             modifique[i]=elementos.isSelected();
             i++;
         }
         
         i=0;//Inicializamos nuevamente el contador a 0
         
         for(JCheckBox elementos : Filtro){
            filter[i]= elementos.isSelected();
            i++;
         }
         //Inicializamos nuevamente el contador a 0
         i=0;
         //Empezamos a crear dinamicamente las consultas
         //Set
         String query="";
         //Where
         String query2="";
         try{
             //Inicializamos contador
             i=0;
             //Variable que captura la bd
             String BD = cmbBases.getSelectedItem().toString();
             //Creacion e instanciacion deo objeto con con parametro bd
             Conexion con = new Conexion(BD);
             //Banderas
             Integer banderaSet=0;
             Integer banderaWhere = 0;
             //For para crear el set 
             for(i = 0; i < numUpdate ; i++){
                 //CheckBox chekeados
                 if(modifique[i]==true){
                   //Construccion del set
                   query+=select_campo[i].toString()+" = " + '\'' +nuevo_valor[i]+ '\''+ " , ";  
                   //Cambio estado de las banderas
                   banderaSet=1;
                 }
             }
             
             //For para crear el where
             //Inicializamos contador
             i=0;
             for(i = 0; i < numUpdate ; i++){
                 if(filter[i]==true){
                     //Contruccion del where
                     query2+=select_campo[i].toString()+" = " + '\'' +busqueda[i]+ '\''+ " and ";
                     //Cambio de estado de la bandera
                     banderaWhere = 1;
                 }
             }             
             
             if(banderaSet==0 && banderaWhere==0){
                 JOptionPane.showMessageDialog(null, "Seleccione una operacion");
             }else{
                if(banderaSet == 1){
                    //Quitamos la ultima coma             
                    //Variable que captura la consulta final
                    String queryfinal;
                    //sacamos la longitud total de la candena
                    int longitud=query.length()-2;
                    //Sutraemos la cadena menos los dos ultimon elementos que seria el espacio y la coma
                    queryfinal=(query.substring(0,longitud)).toString();
                    //igualamos el query a la consulta final
                    query=queryfinal;
                }

                if(banderaWhere == 1){
                    //Quitamos el ultimo and
                   //Variable que captura la consulta final
                    String whereFinal;
                    //sacamos la longitud total de la candena
                    int longitud_where = query2.length()-4;
                     //Sutraemos la cadena menos los dos ultimon elementos que seria el espacio y la coma
                    whereFinal = (query2.substring(0,longitud_where)).toString();
                    //igualamos el query a la consulta final
                    query2 = whereFinal ;
                }


                //Union de consultas
                where = where + query2;
                sqlUpdate = sqlUpdate + query + where;
               //Mandamos consulta
                con.setQuery(sqlUpdate);
                JOptionPane.showMessageDialog(rootPane, "Consulta realizada Existosamente");
               //Removemos elementos creados dinamicamente para que el usuario 
                //pueda crear otra tabla y perpintamos el jpanel
                jPanel1.removeAll();
                jPanel1.repaint();
                txtNumUpdate.setText("");
                jButton3.setEnabled(false);
             }
         }
         
         catch(SQLException ex){
             JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
         }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumUpdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumUpdateKeyTyped
       //Declaramos e Igualamos la variable para que capture la tecla pulsada  
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)){//Inicio del if
         evt.consume();  // ignorar el evento de teclado
         JOptionPane.showMessageDialog(null, "Error No puede Ingresar Letras","Error",JOptionPane.ERROR_MESSAGE);
      }//fin del if
    }//GEN-LAST:event_txtNumUpdateKeyTyped

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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new update().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBases;
    private javax.swing.JComboBox cmbTabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumUpdate;
    // End of variables declaration//GEN-END:variables
}
