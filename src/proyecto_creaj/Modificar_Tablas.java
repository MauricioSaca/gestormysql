//Contenedor de clases
package proyecto_creaj;
///////////////////Llamada a los Paquetes///////////////////
import cdb.edu.util.*;
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;
 
//Inicio de la clase
public class Modificar_Tablas extends javax.swing.JFrame {//Inicio de la clase
     //Bandera
     Integer estadocombo=0;
     //Numero de campos que desea que posea la tabla
     Integer contCampos;
     //Arreglo que guarda el valor almacenado en cada uno de los campos especificados por el usuario
     String nombrescampos[];
     //Arreglo que guarda el el tipo de datos que desee que posea un determinado campo
     String tiposdatos[];
     //Arreglo que guarda la longitud de cada campo (tamaño)
     String LogintudDatos[];
     //Arreglo que guarda el indice que el usuario desea que posea un campo
     String IndiceCampo[];
     //Arreglo de texbox para el nombre de los campos
     JTextField jTextArraysCpus[] ;
     //Arreglo de combobox para para almacenar los tipo de datos disponibles en mysql
     JComboBox jTipoDato[];
     //Arreglo de textbox para especificar la longitud de los campos
     JTextField jTextArraysLogi[] ;
     //Arreglo de combobox para almecenar el indice de cada campo
     JComboBox jIndice[];
    
     //Creacion e instanciacion del objetoMostrar de la clase Mostrar
    Mostrar objetoMotrar = new Mostrar();
     //Creacion e instanciacion del  objeto_vali de la clase Validaciones
    Validaciones objeto_vali = new Validaciones();
    //Creacion e instanciacion del  objeto_vali de la clase Validaciones
    Mostrar_Tablas objeto_mostrarT = new Mostrar_Tablas();
    //Contructor
    public Modificar_Tablas() {//Inicio del constructor
        //Inicializacion de todos los componentes Swing
        initComponents();
        //Metodo del objetoMostrar para visualizar las bases de datos existentes
        objetoMotrar.Ver(cmbBases);
         
        //Componentes Ocultos
         jPanelCampos.setVisible(false);
         jPanelEli.setVisible(false);
         lbl1.setVisible(false);
         lbl2.setVisible(false);
         lbl3.setVisible(false);
         lbl4.setVisible(false);
        
    }//Fin del constructor

    /*Este método se llama desde el constructor para inicializar el formulario.      
     ADVERTENCIA: No intente modificar este código.
     El contenido de este método es siempre 
     Regenerados por el editor de formularios.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbTablas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbBases = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jPanelCampos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNumCampos = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanelEli = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        cmbCampos = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Seleccion Base y Tabla"));

        cmbTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTablasActionPerformed(evt);
            }
        });

        jLabel2.setText("Tablas de la base de datos");
        jLabel2.setToolTipText("");

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

        jLabel1.setText("Seleccione Base de datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBases, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Estructura de la tabla"));

        btnMostrar.setText("Mostrar");
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

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
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrar)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Controles"));

        jButton1.setText("Agregar Registro");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Registro");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        lbl1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lbl1.setText("Nombre del Campo");

        lbl2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lbl2.setText("Tipo de Dato");

        lbl3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lbl3.setText("Logitud/Valores");

        lbl4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lbl4.setText("Indice");

        jPanelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Campos Nuevos"));

        jLabel5.setText("Numero de campos a agregar");

        txtNumCampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCamposKeyTyped(evt);
            }
        });

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNumCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar)
                    .addComponent(btnAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Eliminar Campo"));

        jLabel3.setText("Nombre de campo");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEliLayout = new javax.swing.GroupLayout(jPanelEli);
        jPanelEli.setLayout(jPanelEliLayout);
        jPanelEliLayout.setHorizontalGroup(
            jPanelEliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnEliminar)
                    .addComponent(cmbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelEliLayout.setVerticalGroup(
            jPanelEliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(163, 163, 163))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addGap(33, 33, 33)
                                .addComponent(lbl2)
                                .addGap(57, 57, 57)
                                .addComponent(lbl3)))
                        .addGap(50, 50, 50)
                        .addComponent(lbl4)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl2)
                    .addComponent(lbl3)
                    .addComponent(lbl4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBasesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBasesItemStateChanged

   }//GEN-LAST:event_cmbBasesItemStateChanged
    
    private void cmbBasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBasesActionPerformed
     
        if (estadocombo == 0) {
            estadocombo = 1;
        } else {
            //Metodo del objetoMostrar para visualizar las tablas que contiene la base de datos
            objetoMotrar.Ver_Tablas(cmbBases, cmbTablas);
            //Habilitamos compontes inactivos
            btnMostrar.setEnabled(true);
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
        }

    }//GEN-LAST:event_cmbBasesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Visualizamos componentes ocultos
        jPanelCampos.setVisible(true);
        lbl1.setVisible(true);
        lbl2.setVisible(true);
        lbl3.setVisible(true);
        lbl4.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //Consulta a realizar
       String sqlTable="describe "+cmbTablas.getSelectedItem().toString();;
       //Ejecutamos metodo del objeto_mostrarT para visualizar la estructura de la tabla 
       objeto_mostrarT.Ver(sqlTable, cmbBases, jTable1);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
       //Obtenemos el numero de campos que el usuario desea por medio de un texbox y hacemos la conversion de String a Entero
        contCampos=Integer.parseInt(txtNumCampos.getText());
        //Creacion de vector que guarda los valores del comboBox de tipo de datos
        Vector<String> valores=new Vector();
       ////////Valores del comboBox de tipo de datos/////////////
         valores.add("Varchar");
         valores.add("Char");
         valores.add("Int");
         valores.add("decimal");
         valores.add("Float");
         valores.add("Double");
         valores.add("Real");
         //////////////////////////////////////////////////////////
         
         //Creacion de vector que guarda los valores del comboBoz de los Indices
         Vector<String> Valores_Indices = new Vector();
         
         ///////////Valores del comboBox de Indices//////////////////
         Valores_Indices.add("");
         Valores_Indices.add("primary key");
         Valores_Indices.add("unique");
         Valores_Indices.add("null");
        
         ////////////////////////////////////////////////////////////
         
         
        //Instancioamos cada uno de los arreglos y le asignamos como indice el numero de campos  
        jTextArraysCpus= new JTextField[contCampos];
        jTextArraysLogi= new JTextField[contCampos];
        jTipoDato      = new JComboBox[contCampos];
        jIndice        = new JComboBox[contCampos];
        ///////////////////////////////////////////////////////////////////////////
        //Varible de tipo contador
        Integer contador1;
        //Inicializacion del contador
        contador1=0;
        
        //For para dibujar los controles dinamicamente
        for (int i=0;i<contCampos;i++) {//Inicio del for
             //Se crea el objeto individualmente
            jTextArraysCpus[i]  =   new JTextField("");  
             // Lo agregamos al Panel
            jPanel4.add(jTextArraysCpus[i]);            
            // Le asignamos un nombre al componente
            jTextArraysCpus[i].setName("campo"+i);     
           //Visualizamos componente en el panel en tiempo de ejecucion asignandole un ancho alto y sus coordenadas en x , y , width , height
            jTextArraysCpus[i].setBounds(0, contador1, 130, 35);
            
            jTipoDato[i]  =  new JComboBox(valores);
            jPanel4.add(jTipoDato[i]);
            jTipoDato[i].setName("tipodato"+1);
            jTipoDato[i].setBounds(160, contador1, 100, 35);
            
            jTextArraysLogi[i]  =   new JTextField("");
            jPanel4.add(jTextArraysLogi[i]);
            jTextArraysLogi[i].setName("Logitud"+i);
            jTextArraysLogi[i].setBounds(290, contador1, 130, 35);
            
            jIndice[i]          = new JComboBox(Valores_Indices);
            jPanel4.add(jIndice[i]);
            jIndice[i].setName("Indice"+1);
            jIndice[i].setBounds(450, contador1, 100, 35);
            
            // Contadar utilizado para dar una posición en y a las cajas de texto
            contador1=contador1 + 35; 
 
        }//Fin del for
        //Habilito boton
        btnAgregar.setEnabled(true);
        //Agrego propiedad
        jPanel4.setAutoscrolls(true);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Bandera
        Integer banderaCatch=0;
        Integer banderaError = 0;
        //Variable contador e inicializada a 0
        Integer i=0;
        //Comienzo de la creacion de la consulta
        String sql="alter table "+cmbTablas.getSelectedItem().toString()+" add column (";
        
        //Intanciamos cada Arreglo y le asignamos con indice el numero de campos  
        nombrescampos= new String[contCampos];
        tiposdatos   = new String[contCampos];
        LogintudDatos = new String[contCampos];
        IndiceCampo = new String[contCampos];
        //////////////////////////////////////////////////////////
        
        for (JTextField elemento : jTextArraysCpus) {//Inicio del for mejorado
            //Validaciones 
            if(elemento.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error verifique datos ingresados","Error",JOptionPane.ERROR_MESSAGE);
                 banderaError = 1;
            }
            else if(objeto_vali.Vali(elemento)){
                //Muestro mensajes correspondientes
                banderaError = 1;
            }
            
            else{
                //Capturamos los datos Ingresados por el usuario en el Texbox Nombre Campo 
                nombrescampos[i]=elemento.getText().toString();
            }
            //Incrementamos contados por cada iteracion
            i++;
            
        }//Fin del for mejorado
        //Inicializamos nuevamente el contador a 0
        i=0;
        
        for (JComboBox elemento : jTipoDato) {//Inicio del for mejorado
            //Validaciones
            if(elemento.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione Tipo de dato","Error",JOptionPane.ERROR_MESSAGE);
                banderaError = 1;
            }else{
                //Capturamos el tipo de datos que el usuario desea ingresar
                tiposdatos[i]=elemento.getSelectedItem().toString();
            } 
            //Incrementamos contados por cada iteracion
            i++;
        }//Fin del for mejorado
        //Inicializamos nuevamente el contador a 0
        i=0;
        
        for(JTextField elemento : jTextArraysLogi){//Inicio del for mejorado
             if(elemento.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error verifique datos ingresados","Error",JOptionPane.ERROR_MESSAGE); 
                banderaError = 1;
             }
            else if(objeto_vali.Vali(elemento)){
                //Muestro mensajes respectivo
                banderaError = 1;
            }
            else if(objeto_vali.validateNumeros(elemento.getText().toString())==false){
                JOptionPane.showMessageDialog(null, "Error verifique datos ingresados","Error",JOptionPane.ERROR_MESSAGE);
                banderaError = 1;
            }
            else{
                //Capturamos la longitud de cada campo  
                LogintudDatos[i]=elemento.getText().toString(); 
            } 
            //Incrementamos contados por cada iteracion
             i++;
        }//Fin del for mejorado
        //Inicializamos nuevamente el contador a 0
        i=0;
        
        ///////////////////Variables//////////////
        String sqlprimarykey="primary key (";//Inicio de la sentencia sql
        Integer sqlbandera=0;//Variable bandera
        Integer contllave=0;//Contador de llaves primarias
        //////////////////////////////////////////
        
        for (JComboBox elemento : jIndice) {//Inicio del for mejorado         
            //Capturamos el indice que el usuario desea para su campo
            IndiceCampo[i]=elemento.getSelectedItem().toString();
            if (IndiceCampo[i].equals("primary key")){//Inicio del if1
                //Cambiamos el valor a la bandera para ejecutar la sentencia
                sqlbandera=1;
                //No aseguramos que en la parte de la creacion de la sentencia del indice quede vacio
                IndiceCampo[i]="";
                if (i==(contCampos-1)){//Inicio del if2
                    //Agregamos a la sentecia los nombres de los campos que seran primary key
                    sqlprimarykey= sqlprimarykey + nombrescampos[i] ;
                }//Fin el if2
                else{
                    //Por cada iteracion agregamos la , segun los nombre de los campos
                    sqlprimarykey= sqlprimarykey + nombrescampos[i] +",";
                }               
                //Incremento del contado de llaves primarias
                contllave++;
            }//Fin el if1
            //Incrementamos contador por cada iteracion
            i++;
        }//Fin del for mejorado

        if (contllave==1){//Inicio del if3 en el caso que sea unicamente una llave primaria
            //Utilizamos el metodo replace para quitar la coma que coloca por cada iteracion por un espacio en blanco
            sqlprimarykey= sqlprimarykey.replace(",", "") ;
        }//Fin del if3
        //Fin de la sentencia
        sqlprimarykey=sqlprimarykey+")";
        //Inicializamos nuevamente el contador a 0
        i=0;
       
        if(banderaError == 1){
            //No dejamos que pase la consulta
        }else{      
        //Variable que guarda la consulta
        String sql2="";
        try{//Inicio del try
        //Varible que guarda la una consulta    
        String sqlQuery;
        //Creacion de la consulta para el uso de la base de datos
        sqlQuery = cmbBases.getSelectedItem().toString();
        //Creacion del objeto de la clase conexion y le mandamos de parametros la base de datos seleccionada
        Conexion conexion1 = new Conexion(sqlQuery); 
        for(i=0;i<contCampos;i++){//Inicio del for que va creando la consulta
                if (i==(contCampos-1)){//Inicio del if al momento que el indice i llegue a ser igual que el numero de campos se colocara el parentesis final a la consulta
                    if (sqlbandera==1){//Inicio del if 2 cuando se cambia el valor de la bandera se agrega la sentencia primary key creada 
                        sql2=sql2 + nombrescampos[i].toString()+ "  " + tiposdatos[i].toString() + "(" + LogintudDatos[i].toString() + ")" + " " + IndiceCampo[i].toString()+ ","  + sqlprimarykey + ")";
                    }//Fin del if2
                    else{//Inicio del else2 sigue su curso normal
                        sql2=sql2 + nombrescampos[i].toString()+ "  " + tiposdatos[i].toString() + "(" + LogintudDatos[i].toString() + ")" + " " + IndiceCampo[i].toString()+  ")";
                    }//Fin del else2
                }//Fin del if
                
                else{//Inicio del else y mientras tanto se formara la consulta
                    sql2= sql2 + nombrescampos[i].toString()+ "  " + tiposdatos[i].toString() + "(" + LogintudDatos[i].toString() + ")" + " " + IndiceCampo[i].toString()+",";
                }//Fin del else
        
        }//Fin del for
        //Consulta terminada para la creacion de la tabla
        sql= sql + sql2;
        //Metodo que manda la consulta para la creacion de la tabla
        conexion1.setQuery(sql);
        //Mostramos mensaje
        JOptionPane.showMessageDialog(null, "Consulta realizada exitosamente");
        }//Fin del try
        catch(Exception ex){//Inicio del Catch
            banderaCatch=1;
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
        }//Fin del Catch
        if(banderaCatch==1){
            for(i=0;i<contCampos;i++){//Inicio del for
                jTextArraysLogi[i].setText("");
                jTextArraysCpus[i].setText("");
            }//Fin del for 
            txtNumCampos.setText("");
        }else{
             txtNumCampos.setText("");
             //Removemos elementos creados dinamicamente para que el usuario 
             //pueda crear otra tabla y perpintamos el jpanel
             jPanel4.removeAll();
             jPanel4.repaint();  
        }
      }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jPanelEli.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
       //Variables contenedoras de las consultas a realizar    
       String SqlAlter;
       String sqlQuery;
       //Asignacion de base de datos a utilizar
       sqlQuery =cmbBases.getSelectedItem().toString();//Creacion de la consulta para el uso de la base de datos
      //Seleccion de tabla a modificar
       SqlAlter="alter table "+cmbTablas.getSelectedItem().toString()+" drop column "+cmbCampos.getSelectedItem().toString();
       //Creacion del objeto de la clase conexion  
       Conexion conexion1 = new Conexion(sqlQuery);
       //Mandamos consulta por medio del metodo del objeto conexion
       conexion1.setQuery(SqlAlter); 
       JOptionPane.showMessageDialog(null, "Consulta realizada exitosamente");
       cmbCampos.removeItem(cmbCampos.getSelectedItem());
       }
       catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNumCamposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCamposKeyTyped
        //Declaramos e Igualamos la variable para que capture la tecla pulsada
        char caracter = evt.getKeyChar();
        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)){//Inicio del if
            // ignorar el evento de teclado
            evt.consume();  
         JOptionPane.showMessageDialog(null, "Error No puede Ingresar Letras","Error",JOptionPane.ERROR_MESSAGE);
      }//fin del if
    }//GEN-LAST:event_txtNumCamposKeyTyped

    private void cmbTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTablasActionPerformed
       if(estadocombo==0){
           estadocombo=1;
       }
       else{
          //Metodo del ojetoMostrar que visualiza los los campos que posee la tabla
           objetoMotrar.VerElemento(cmbBases, cmbTablas, cmbCampos);
       }
    }//GEN-LAST:event_cmbTablasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //Muestra el menu
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
            java.util.logging.Logger.getLogger(Modificar_Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Modificar_Tablas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox cmbBases;
    private javax.swing.JComboBox cmbCampos;
    private javax.swing.JComboBox cmbTablas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelEli;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTextField txtNumCampos;
    // End of variables declaration//GEN-END:variables
}
