//Contenedor de clases
package proyecto_creaj;
//Importacion de clases a utilizar
import cdb.edu.util.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
//Inicio de la clase
public class delete extends javax.swing.JFrame {
    //Bandera
    Integer estado = 0;
    //Numero de campos que desea mostrar
    Integer numDelete;
    //Arreglo que almacena la opcion del usuario
    JComboBox Campo[];
    JTextField ValTexbox[];
    JComboBox Operadores[];
    JCheckBox filtrar [];
    //Arreglos que cpturan el valor de cada elemento creado dinamicamente
    String dato_campo [];
    String condicion [];
    String ope_relaciones[];
    Boolean filter[];
    //Contador de campos
    Integer conta = 0;
    //Creacion e instanciacion de objeto
    Mostrar objeto_mostrar = new Mostrar();
    Validaciones objeto_vali = new Validaciones();
    //Costructor
    public delete() {
        //Inicializacion de controles
        initComponents();
        //Ejeucioin de metodo del objeto_mostrar para visualizar bd
        objeto_mostrar.Ver(cmbBasesD);
    }

     /*Este método se llama desde el constructor para inicializar el formulario.
    ADVERTENCIA: No intente modificar este código. 
    El contenido de este método es siempre regenerados por el editor de formularios.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbBasesD = new javax.swing.JComboBox();
        cmbTablasBD = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtNum = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Campo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jLabel5.setText("Condicion");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 204), null), "Seleccion de Base y Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        cmbBasesD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBasesDActionPerformed(evt);
            }
        });

        cmbTablasBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTablasBDActionPerformed(evt);
            }
        });

        jLabel2.setText("Tabla");

        jLabel3.setText("Base de datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbBasesD, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTablasBD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBasesD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTablasBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 204), null), "Cantidad de campos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204))));

        jButton2.setText("Aceptar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtNum.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 204), null), "Realizar Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        jButton1.setText("Aceptar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Operador Relacional");

        jLabel8.setText("Filtrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBasesDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBasesDActionPerformed
        if(estado == 0){
            estado = 1;
        }
        else{
            //Ejecutamos metodo para visualizar tablas de las bd
            objeto_mostrar.Ver_Tablas(cmbBasesD, cmbTablasBD);
            //Habilitamos controles
            jButton2.setEnabled(true);
            txtNum.setEnabled(true);
        }
    }//GEN-LAST:event_cmbBasesDActionPerformed

    private void cmbTablasBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTablasBDActionPerformed
       if(estado == 0){
            estado = 1;
        }
        else{
          try{   
          //Tabla Virtual que captura los datos arrojados por la consuta realizada    
          ResultSet rs;
          //Creacion e instanciacion del objeto con de la clase Conexion mandandole 
          //de parametro la bd
          Conexion con = new Conexion(cmbBasesD.getSelectedItem().toString());
         //Ejecutamos metodo del objeto con donde mandamos la consulta
          con.setRs("describe "+ cmbTablasBD.getSelectedItem().toString());
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
           jLabel4.setText("Numero maximo de campos "+ conta.toString());
        }
    }//GEN-LAST:event_cmbTablasBDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(txtNum.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Vacio" ,"Error",JOptionPane.ERROR_MESSAGE);
            txtNum.setText("");
            txtNum.requestFocus();
       }else{ 
        //Capturo el numero de campos a eliminar
        numDelete = Integer.parseInt(txtNum.getText());
         if(numDelete > conta){
            JOptionPane.showMessageDialog(null, "Numero de campos invalidos","Error",JOptionPane.ERROR_MESSAGE);
            txtNum.setText("");
            txtNum.requestFocus();
        }else{
        
           //Arreglo que guarda los operadores relacionales
           Vector<String> valores1=new Vector();
            valores1.add("<");
            valores1.add(">");
            valores1.add("<=");
            valores1.add(">=");
            valores1.add("<>");
            valores1.add("="); 
            valores1.add("like"); 
            //Creacion de vector que guarda los valores del comboBox de tipo de datos 
            Vector<String> valores=new Vector();
            //Igualamos cada Arreglo con su componente
         Campo = new JComboBox[numDelete];
         ValTexbox = new  JTextField [numDelete];
         Operadores = new JComboBox[numDelete];
         filtrar = new JCheckBox[numDelete];
         
         Integer contador ;
        contador = 0;
        try{
           ResultSet rs;
           String base ;
           base = cmbBasesD.getSelectedItem().toString();
           Conexion con = new Conexion(base);
           String Consultabla;
           Consultabla = "describe "+ cmbTablasBD.getSelectedItem().toString();
           con.setRs(Consultabla);
           rs = con.getRs();
           while (rs.next()){
               valores.add(rs.getString(1));
           }
           for (int i=0;i<numDelete;i++){
            Campo[i] = new JComboBox(valores);
            jPanel1.add(Campo[i]);
            Campo[i].setName("Campos "+i);
            // x , y, Width , Height
            Campo[i].setBounds(20, contador, 100, 35);
         
            Operadores[i] = new JComboBox(valores1);
            jPanel1.add(Operadores[i]);
            Operadores[i].setName("ope "+i);
            Operadores[i].setBounds(160, contador, 100, 35); 
            
            ValTexbox[i] = new JTextField("");
            jPanel1.add(ValTexbox[i]);
            ValTexbox[i].setName("Condicion "+i);
            // x , y, Width , Height
            ValTexbox[i].setBounds(290, contador, 100, 35);
            
            filtrar[i] = new JCheckBox();
            jPanel1.add(filtrar[i]);
            filtrar[i].setName("fill "+i);
            filtrar[i].setBounds(420, contador, 100, 35);
           
            
           
            
           contador=contador + 50;
           }
         jPanel1.setAutoscrolls(true);
         jPanel1.setSize(583,310 );
         jButton1.setEnabled(true);
         jButton2.setEnabled(false);
       
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex.getMessage());
       }
      }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Integer banderita = 0;
        Integer i = 0;
        String sqlDelete = "delete from "+cmbTablasBD.getSelectedItem().toString()+" ";
        String where = " where ";
        //Intanciacion de lo objetos
        dato_campo = new String [numDelete];
        condicion = new String [numDelete];
        ope_relaciones = new String[numDelete];
        filter = new Boolean[numDelete];
        
        for(JComboBox elementos : Campo){
             //Capturamos los datos Ingresados por el usuario en el Texbox Nombre Campo
             dato_campo[i] = elementos.getSelectedItem().toString();
             //Incrementamos contados por cada iteracion
             i++;
         }
         
         i=0;//Inicializamos nuevamente el contador a 0
         
        for (JTextField elementos : ValTexbox ){
             //Capturamos los datos Ingresados por el usuario en el Texbox Nombre Campo
            condicion[i]=elementos.getText().toString();              
         
           //Incrementamos contados por cada iteracion
             i++;
        } 
        
         
         i=0;//Inicializamos nuevamente el contador a 0
         
         for(JComboBox elementos : Operadores){
             ope_relaciones[i] = elementos.getSelectedItem().toString();
             i++;
         }
         
         i=0;//Inicializamos nuevamente el contador a 0
               
         for(JCheckBox elementos : filtrar){
             filter[i] = elementos.isSelected();
             i++;
         }
         i=0;//Inicializamos nuevamente el contador a 0
         //Empezamos a crear dinamicamente las consultas
         
         Integer cont=0;
         String query="";
         String query2 ="";
         Integer bandera1 = 0;
         Integer bandera2 = 0;
         try{
             i=0;
             String bd = cmbBasesD.getSelectedItem().toString();
             String table = cmbTablasBD.getSelectedItem().toString();
             Conexion con = new Conexion(bd);
             //Inicio del for para recocorrer el objeto check            
             for(i = 0; i<numDelete ; i++){
                 if(filter[i]==true){                 
                     if(ope_relaciones[i].equals("=")||ope_relaciones[i].equals("like")){
                         query2+=dato_campo[i].toString()+" "+ope_relaciones[i].toString()+" " + '\'' + condicion[i].toString() + '\''+ " and ";
                       bandera2 = 1;
                     }else{
                         query2+=dato_campo[i].toString()+" "+ope_relaciones[i].toString()+" " + condicion[i].toString() +" and ";
                     bandera2 = 1;
                     }                
                     
                 }
             }
    
                 
             if(bandera2==0){
                 JOptionPane.showMessageDialog(null, "Seleccione una Opcion");
             }else{            
             if(bandera2 == 1){
                String finalWhere;
                int longi = query2.length() - 4;
                finalWhere = (query2.substring(0,longi)).toString();
                query2 = finalWhere;
             }
             
             where = where + query2;
             sqlDelete = sqlDelete  +where;
             con.setQuery(sqlDelete);
             JOptionPane.showMessageDialog(rootPane, "Consulta realizada Exitosamente");
             //Removemos elementos creados dinamicamente para que el usuario 
             //pueda crear otra tabla y perpintamos el jpanel
             jPanel1.removeAll();
             jPanel1.repaint();
             //Limpiamos elementos para la realizacion de una siguiente consulta
             txtNum.setText("");  
             jButton1.setEnabled(false);
         }
       }
         catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
         }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new delete().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBasesD;
    private javax.swing.JComboBox cmbTablasBD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
