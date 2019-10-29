//Contenedor de clases
package proyecto_creaj;
//Importacion de librerias
import java.sql.*;
import cdb.edu.util.*;
import javax.swing.*;
import java.util.Vector;
import java.util.ArrayList;
//Inicio de la clase
public class Select extends javax.swing.JFrame {
 ///////////////////Miembros de la clase/////////////////
    //Bandera
    Integer estado = 0;
    Integer estado2=0;
    //Numero de campos que desea mostrar
    Integer numSelect;
    Integer mostrar;
    //Arreglo que almacena la opcion del usuario
    JComboBox Valor_Combo[];
    JCheckBox Valor_Check [];
    JCheckBox filtrar [];
    JTextField Valor_Texbox[];
    JComboBox Operadores[];
    //Arreglos que cpturan el valor de cada elemento creado dinamicamente
    String cantidad [];
    String Campo [];
    String operador [];
    Boolean chekeados [];
    Boolean filter[];
    //Contador de campos
    Integer conta = 0;
    //Creacion de objetos
    Mostrar objeto_mostrar = new Mostrar();
    Mostrar_Tablas objeto_table = new Mostrar_Tablas();
    Validaciones objeto_vali = new Validaciones();
    //Metodo Constructor
    public Select() {
        initComponents();
        //Muestros base de datos con el metodo de la clase mostrar
        objeto_mostrar.Ver(cmbBasesD);
        //Lleno combo box
        cmbModoSelect.addItem("");
        cmbModoSelect.addItem("Select campo , campo from tabla");
        cmbModoSelect.addItem("Select campo , campo from tabla where condicion");
      
    }

  /*
  Este método se llama desde dentro del constructor para inicializar el formulario.
  ADVERTENCIA: No intente modificar este código. El contenido de este método es siempre
  regenerados por el editor de formularios.
  */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmbBasesD = new javax.swing.JComboBox();
        cmbTablasD = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbModoSelect = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        txtNumCampos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Campo");

        jLabel2.setText("Operador Relacional");

        jLabel3.setText("Valor");

        jLabel4.setText("Mostrar");

        jScrollPane1.setAutoscrolls(true);

        jPanel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), null), "Seleccion de Base y Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 204)));

        cmbBasesD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBasesDItemStateChanged(evt);
            }
        });
        cmbBasesD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBasesDActionPerformed(evt);
            }
        });

        cmbTablasD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTablasDActionPerformed(evt);
            }
        });

        jLabel5.setText("Base de datos");

        jLabel6.setText("Tabla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBasesD, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTablasD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBasesD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTablasD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null), "Tipo de Select", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        cmbModoSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbModoSelectItemStateChanged(evt);
            }
        });
        cmbModoSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModoSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbModoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbModoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null), "Cantidad de campos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 153)));

        txtNumCampos.setEnabled(false);
        txtNumCampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCamposKeyTyped(evt);
            }
        });

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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtNumCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null), "Realizar Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        jButton2.setText("Aceptar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 204), null), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jLabel8.setText("Filtrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBasesDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBasesDActionPerformed
      //Condicion para bandera
        if(estado == 0){
            estado = 1;
        }
        else{
            //Metodo del objeto_mostrar que visualiza las tablas que posee la bd
            objeto_mostrar.Ver_Tablas(cmbBasesD, cmbTablasD);
        }
    }//GEN-LAST:event_cmbBasesDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if(txtNumCampos.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Campo Vacio" ,"Error",JOptionPane.ERROR_MESSAGE);
            txtNumCampos.setText("");
            txtNumCampos.requestFocus();
        }else{
              
        //Capturo el numero de campos
        numSelect = Integer.parseInt(txtNumCampos.getText());
        //Validacion
        if(numSelect > conta){
            JOptionPane.showMessageDialog(null, "Numero de campos invalidos","Error",JOptionPane.ERROR_MESSAGE);
            txtNumCampos.setText("");
            txtNumCampos.requestFocus();
            }
     else{
      //Creacion de vector que guarda los valores del comboBox de tipo de datos 
      Vector<String> valores=new Vector();
       ////////Valores del comboBox para los operadores de busqueda/////////////
      valores.add("<");
      valores.add(">");
      valores.add("<=");
      valores.add(">=");
      valores.add("<>");
      valores.add("=");
      valores.add("like");   
      
      //Arreglo que guarda los campos que posee cada tabla
      Vector<String> valores1=new Vector();
      
      //Instanciamos cada arreglo de objetos
        Valor_Combo = new JComboBox [numSelect];
        Valor_Check = new JCheckBox [numSelect];
        filtrar = new JCheckBox [numSelect];
        Valor_Texbox = new JTextField [numSelect];
        Operadores = new JComboBox[numSelect];
        //Contador
        Integer contador ;
        //Inicializacion
        contador = 0;
       try{
           //Tabla virtual que contendra los datos arrojados por la consulta realizada
           ResultSet rs;
           //Variable que contendra la bd
           String base ;
           //Asiganacion de la bd a trabaja
           base = cmbBasesD.getSelectedItem().toString();
           //Creacion e instanciacion deo objeto con mandadole de parametro la bd
           Conexion con = new Conexion(base);
           //Variable contenedora de la consulta a contruir
           String Consultabla;
           //Iniciamos consulta
           Consultabla = "describe "+ cmbTablasD.getSelectedItem().toString();
           //mandamos consulta
           con.setRs(Consultabla);
           //capturamos datos en el resulSet de la consuta hecha
           rs = con.getRs();
           //Los recorremos los datos miesntras sea verdarero el valor del metodo
           while (rs.next()){
               //Agregamos valores al vector
               valores1.add(rs.getString(1));
           }
           //Creacion de controles dinamicamente 
           for (int i=0;i<numSelect;i++){
           //Se crea el objeto individualmente 
            Valor_Combo[i] = new JComboBox(valores1);
            // Lo agregamos al Panel
            jPanel1.add(Valor_Combo[i]);
             // Le asignamos un nombre al componente
            Valor_Combo[i].setName("Campos "+i);
            // dibujamos control dandole de parametrosx , y, Width , Height
            Valor_Combo[i].setBounds(20, contador, 100, 35);
            
            Operadores[i] = new JComboBox(valores);
            jPanel1.add(Operadores[i]);
            Operadores[i].setName("operador "+i);
            Operadores[i].setBounds(160, contador, 100, 35);
            
            Valor_Texbox[i] = new JTextField("");
            jPanel1.add(Valor_Texbox[i]);
            Valor_Texbox[i].setName("Num "+i);
            Valor_Texbox[i].setBounds(290, contador, 100, 35); 
            
            Valor_Check[i] = new JCheckBox();
            jPanel1.add(Valor_Check[i]);
            Valor_Check[i].setName("check "+i);
            Valor_Check[i].setBounds(420, contador, 100, 35);
            
            filtrar[i] = new JCheckBox();
            jPanel1.add(filtrar[i]);
            filtrar[i].setName("fill "+i);
            filtrar[i].setBounds(520, contador, 100, 35);
            
            contador=contador + 50;
            //Validaciones
            if(cmbModoSelect.getSelectedItem().equals("Select campo , campo from tabla")){
                //Deshabilito campos que no necesitare
                Operadores[i].setEnabled(false);
                filtrar[i].setEnabled(false); 
                Valor_Texbox[i].setEnabled(false); 
             } 
            else if(cmbModoSelect.getSelectedItem().equals("Select campo , campo from tabla where condicion")){
                //Habilito los campos
                Operadores[i].setEnabled(true);
                Valor_Texbox[i].setEnabled(true);
                filtrar[i].setEnabled(true);
            }
            
        }
        //Activo propiedad del panel 
        jPanel1.setAutoscrolls(true);
        //Asigano el anchio y largo del panel
        jPanel1.setSize(583,310 );
        //Habilito boton
        jButton2.setEnabled(true);
        jButton1.setEnabled(false);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }      
      }
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Contador
        Integer i = 0;
        //Comienzo de la consulta para el set
        String sqlSelect = "select ";
        //Comienza la consulta para el where
        String where = " where ";
        //Instancioamos cada uno de los arreglos asiganandoles como indice el numero de campos  
         cantidad = new String[numSelect];
         Campo = new String[numSelect];
         operador = new String[numSelect];
         chekeados = new Boolean [numSelect];
         filter = new Boolean[numSelect];
         
         
         for(JComboBox elementos : Valor_Combo){
             //Validaciones
            if(elementos.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione Tipo de dato","Error",JOptionPane.ERROR_MESSAGE);
            }else{           
             //Capturamos los datos Ingresados por el usuario 
             Campo[i] = elementos.getSelectedItem().toString();
            }
             //Incrementamos contados por cada iteracion
             i++;
         }
         //Inicializamos nuevamente el contador a 0
         i=0;
         
          for(JComboBox elementos : Operadores){              
               //Capturamos los datos Ingresados por el usuario
                operador[i] = elementos.getSelectedItem().toString();
            //Incrementamos contados por cada iteracion 
            i++;
         }
         
          //Inicializamos nuevamente el contador a 0
          i=0;
         for(JTextField elementos :Valor_Texbox){
            if(objeto_vali.Vali(elementos)){
                //Muestro mensajes correspondientes
            }
            else{
              //Capturamos valos ya pasada la validacion
              cantidad[i] = elementos.getText().toString();
            }
            //Incrementamos contados por cada iteracion  
            i++;
         }
        //Inicializamos nuevamente el contador a 0  
        i=0;
         
         for(JCheckBox elementos : Valor_Check){
             chekeados[i]=elementos.isSelected();
             i++;
         }
         i=0;//Inicializamos nuevamente el contador a 0
         
         for(JCheckBox elementos : filtrar){
             filter[i] = elementos.isSelected();
             i++;
         }
         
         i=0;//Inicializamos nuevamente el contador a 0
         
         //Empezamos a crear dinamicamente las consultas
         //Dependiendo de la seleccion del combobox
         switch(cmbModoSelect.getSelectedIndex()){
             case 1:
                 //Inicializamos nuevamente el contador a 0
                 i=0;
                 //Variable que contiene la consulta a formar
                 String sqlSelect2="";
                 //Contador de los no checkeados
                 Integer contFalse=0;
                 //Contador de lso checkeados
                 Integer contTrue=0;
                 //Contador
                 Integer j = 0;
                 //Seleccion de tabla    
                 String TablaBD = cmbTablasD.getSelectedItem().toString();
                     //Inicio del para contador los chekeados
                     for(i = 0;i<numSelect;i++){//Inicio del for
                         
                         if(chekeados[i]==true){//Inicio del if Check
                            contTrue++;                         
                         }//Fin del if Checj
                         else{//Si no esta check
                          contFalse++;
                         }//Si no esta chec               
                     }//Fin del for
                     //Validacion
                     if(contFalse != 0){
                         JOptionPane.showMessageDialog(null, "No a seleccionado ningun campo a mostrar");
                     }else{
                    
                         for (j =0 ; j < contTrue ; j++){
                             if(j==(contTrue-1)){//Inicio del if
                                  sqlSelect2+=Campo[j].toString()+" from " + TablaBD;
                             }//Fin del if                   
                            else{//Inicio del else
                                 sqlSelect2+=Campo[j].toString()+" , ";
                            }//Fin del else*/
                         }
                     //Union de la consulta completa
                     sqlSelect = sqlSelect + sqlSelect2;
                     //Metdodo del objeto_table que visualizamos los datos arrojados por la consulta en un jtable
                     objeto_table.Ver(sqlSelect, cmbBasesD, jTable1);
                     JOptionPane.showMessageDialog(null, "Consulta realizada exitosamente");
                     //Removemos elementos creados dinamicamente para que el usuario 
                     //pueda crear otra tabla y perpintamos el jpanel
                    jPanel1.removeAll();
                    jPanel1.repaint(); 
                    txtNumCampos.setText("");
                    jButton2.setEnabled(false);
                     }
                 break;
                 
             case 2:
                 //Inicializamos nuevamente el contador a 0
                 i=0;
                 //Variable contenedora del set
                 String query ="";
                 //Variable contenedora del where
                 String condicion="";
                 //Banderas
                 Integer banderaCampos = 0;
                 Integer banderaWhere = 0;
                 //Variable que captura la base de datos a utilizar
                 String table = cmbTablasD.getSelectedItem().toString();
                 //Inicio de la consulta
                 String select_table =" from " + table;
                      for(i = 0;i<numSelect;i++){
                         if(chekeados[i]==true){//Inicio del if Check
                             //Construccion del set
                             query +=Campo[i].toString()+" ,";
                             //Cambiamos el valor a la bandera
                             banderaCampos = 1;
                         }//Fin del if Checj                     
                     }
                      //Inicializamos contador
                      i=0;
                      for(i=0;i<numSelect;i++){//Inicio del for
                          if(filter[i]==true){
                              //Contruccion del where
                              if(operador[i].equals("=")||operador[i].equals("like")){
                              condicion+=Campo[i].toString()+" "+operador[i].toString()+" "+'\''+cantidad[i].toString()+'\''+" and ";
                              banderaWhere = 1;    
                              }
                              else{
                              condicion+=Campo[i].toString()+" "+operador[i].toString()+" "+cantidad[i].toString()+" and ";
                              //Cambio de estado a bandera
                              banderaWhere = 1;
                              }
                          }
                      }//Fin del for
                     
                      if(banderaCampos == 0 && banderaWhere ==0 ){
                          JOptionPane.showMessageDialog(null, "Seleccione los campos");
                      }else{
                      
                        if(banderaCampos == 1){
                            //Variable que captura la consulta final
                            String camposFinales;
                            //sacamos la longitud total de la candena
                            int longitud = query.length() - 2;
                            //Sutraemos la cadena menos los dos ultimon elementos que seria el espacio y la coma
                            camposFinales = (query.substring(0,longitud)).toString();
                            //igualamos el query a la consulta final
                            query = camposFinales;
                        }

                        if(banderaWhere == 1){
                            //Variable que captura la consulta final
                            String finalWhere;
                           //sacamos la longitud total de la candena
                            int longi = condicion.length() - 4;
                           //Sutraemos la cadena menos los dos ultimon elementos que seria el espacio y la coma
                            finalWhere = (condicion.substring(0,longi)).toString();
                            //igualamos el query a la consulta final
                            condicion = finalWhere;
                            
                        }
                      
                        //Uniio de la consulta
                        where =where + condicion;
                        sqlSelect = sqlSelect + query + select_table + where;
                        objeto_table.Ver(sqlSelect, cmbBasesD, jTable1);
                        JOptionPane.showMessageDialog(null, "Consulta realizada exitosamente");
                        //Removemos elementos creados dinamicamente para que el usuario 
                        //pueda crear otra tabla y perpintamos el jpanel
                         jPanel1.removeAll();
                         jPanel1.repaint();
                         txtNumCampos.setText("");
                         jButton2.setEnabled(false);
                      }
                      
                 break;
         }         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbTablasDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTablasDActionPerformed
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
          con.setRs("describe "+ cmbTablasD.getSelectedItem().toString());
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
           jLabel7.setText("Numero maximo de campos "+ conta.toString());
        }
    }//GEN-LAST:event_cmbTablasDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      //Muestro Menu
        new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbModoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModoSelectActionPerformed
       
    }//GEN-LAST:event_cmbModoSelectActionPerformed

    private void cmbModoSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbModoSelectItemStateChanged
        if(estado2==0){
            estado2=1;
       }else{
        //Habilito controles
        jButton1.setEnabled(true);
        txtNumCampos.setEnabled(true);
       }
    }//GEN-LAST:event_cmbModoSelectItemStateChanged

    private void cmbBasesDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBasesDItemStateChanged

    }//GEN-LAST:event_cmbBasesDItemStateChanged

    private void txtNumCamposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCamposKeyTyped
        //Declaramos e Igualamos la variable para que capture la tecla pulsada  
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)){//Inicio del if
         evt.consume();  // ignorar el evento de teclado
         JOptionPane.showMessageDialog(null, "Error No puede Ingresar Letras","Error",JOptionPane.ERROR_MESSAGE);
      }//fin del if
    }//GEN-LAST:event_txtNumCamposKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Select().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBasesD;
    private javax.swing.JComboBox cmbModoSelect;
    private javax.swing.JComboBox cmbTablasD;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNumCampos;
    // End of variables declaration//GEN-END:variables
}
