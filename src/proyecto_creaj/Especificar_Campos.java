//Contenedor de clases
package proyecto_creaj;

//Importacion de paquetes a utilizar
import cdb.edu.util.Conexion;
import cdb.edu.util.Validaciones;
import cdb.edu.util.Mostrar;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;

////////////////////////////////////Inicio de la clase////////////////////////////////////
public class Especificar_Campos extends javax.swing.JFrame {//Inicio de la clase Principal
    //Creacion e instanciacion de un objeto de tipo Validaciones
    Validaciones objeto_vali = new Validaciones(); 
    ///////////////////Miembros de la clase/////////////////
     //Numero de campos que desea que posea la tabla
     Integer contCampos;
     //Arreglo que guarda el valor almacenado en cada uno de los campos especificados por el usuario
     String nombrescampos[];
     //Arreglo que guarda el el tipo de datos que desee que posea un determinado campo
     String tiposdatos[];
     //Arreglo que guarda la longitud de cada campo (tamaño)
     String LogintudDatos[];
     //Arreglo que guarda el indice que el usuario desea que posea un campo
     String IndiceCampo[];//
     //Arreglo de texbox para el nombre de los campos
     JTextField jTextArraysCpus[] ;
     //Arreglo de combobox para para almacenar los tipo de datos disponibles en mysql
     JComboBox jTipoDato[];
     //Arreglo de textbox para especificar la longitud de los campos
     JTextField jTextArraysLogi[] ;
     //Arreglo de combobox para almecenar el indice de cada campo
     JComboBox jIndice[];
    
     
     
     //Metodo Contructor que sirve para inicializar todos los componentes de Jframe
     Mostrar ver_mostrar = new Mostrar();
    public Especificar_Campos() {//Inicio del contructor
        //Metodo que inicializa componentes 
        initComponents();
        //Metodo el objeto ver_Mostrar de la clase Mostrar que visualiza las bases de datos existentes 
         ver_mostrar.Ver(cmbBases);
    }//Fin del constructo
    
     
    /*Este método se llama desde el constructor para inicializar el formulario.
    ADVERTENCIA: No intente modificar este código. 
    El contenido de este método es siempre regenerados por el editor de formularios.*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbBases = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre_Tabla = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTotalCampos = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel2.setText("Nombre del Campo");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel3.setText("Tipo de Dato");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Seleccionar Base de datos"));

        jLabel4.setText("Seleccione Base de datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbBases, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbBases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null), "Nombre y Campos de la tabla"));

        jLabel5.setText("Ingrese el nombre de la tabla");

        txtNombre_Tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_TablaKeyTyped(evt);
            }
        });

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese el numero de campos");

        txtTotalCampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalCamposKeyTyped(evt);
            }
        });

        jButton2.setText("Crear");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNombre_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel6.setText("Logitud/Valores");

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel9.setText("Indice");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1021, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1019, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Validacion de entrada de datos
        if(objeto_vali.Vali(txtNombre_Tabla)){
           //Muestro respectivos mensajes de error
       }
    
       else if(txtTotalCampos.getText().equals("")||txtNombre_Tabla.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos Vacios","Error",JOptionPane.ERROR_MESSAGE);
            txtNombre_Tabla.requestFocus();
       }
       else{
       //Obtenemos el numero de campos que el usuario desea por medio de un texbox y hacemos la conversion de String a Entero
           contCampos=Integer.parseInt(txtTotalCampos.getText());
       //ArrayList valores= new ArrayList<String>();
       Vector<String> valores=new Vector();//Creacion de vector que guarda los valores del comboBox de tipo de datos
         
         ////////Valores del comboBox de tipo de datos/////////////
         valores.add("");
         valores.add("Varchar");
         valores.add("Char");
         valores.add("Int");
         valores.add("decimal");
         valores.add("Float");
         valores.add("Double");
         //////////////////////////////////////////////////////////
         //Creacion de vector que guarda los valores del comboBox de los Indices
         Vector<String> Valores_Indices = new Vector();
         
         ///////////Valores del comboBox de Indices//////////////////
         Valores_Indices.add("");
         Valores_Indices.add("primary key");
         Valores_Indices.add("unique");
        Valores_Indices.add("null");
         ////////////////////////////////////////////////////////////
         
        //Instanciamos cada unpo de los Arreglos colocando como indice el numero de campos a crear  
        jTextArraysCpus= new JTextField[contCampos];
        jTextArraysLogi= new JTextField[contCampos];
        jTipoDato      = new JComboBox[contCampos];
        jIndice        = new JComboBox[contCampos];
        ///////////////////////////////////////////////////////////////////////////
        
        //Varible de tipo contador
        Integer contador1;
        //Inicializacion del contador
        contador1=0;
        //Estructura repetitiva que va desde 0 hasta el numero de campos Ingresados - 1
        for (int i=0;i<contCampos;i++) {//Inicio del for
            //Se crea el objeto individualmente     
            jTextArraysCpus[i]  =   new JTextField("");   
             // Lo agregamos al Panel
            jPanel1.add(jTextArraysCpus[i]);            
              // Le asignamos un nombre al componente
            jTextArraysCpus[i].setName("campo"+i);   
            //Visualizamos componente en el panel en tiempo de ejecucion asignandole un ancho alto y sus coordenadas en x, y width , height
            jTextArraysCpus[i].setBounds(0, contador1, 130, 35);
            
            jTipoDato[i]        =  new JComboBox(valores);
            jPanel1.add(jTipoDato[i]);
            jTipoDato[i].setName("tipodato"+i);
            jTipoDato[i].setBounds(160, contador1, 100, 35);
            
            jTextArraysLogi[i]  =   new JTextField("");
            jPanel1.add(jTextArraysLogi[i]);
            jTextArraysLogi[i].setName("Logitud"+i);
            jTextArraysLogi[i].setBounds(290, contador1, 130, 35);
            
            jIndice[i]          = new JComboBox(Valores_Indices);
            jPanel1.add(jIndice[i]);
            jIndice[i].setName("Indice"+1);
            jIndice[i].setBounds(450, contador1, 100, 35);
            
            // Contadar utilizado para dar una posición en y a las cajas de texto
            contador1=contador1 + 50; 
        }//Fin del for
        //Propiedad de autoScroll del Jpanel
        jPanel1.setAutoscrolls(true);
        //Tamanio del Jpanel
        jPanel1.setSize(583,310 );
        //Habilito componentes
        jButton2.setEnabled(true);
        jButton1.setEnabled(false);
       } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Banderas
        Integer banderaError=0;
        Integer banderaCatch = 0;
        //Variable contador e inicializada a 0
        Integer i=0;
        //Variable que captura el nombre de la tabla ingresada por el usuario
        String Nombre_tabla;
        //Capturamos el nombre de la tabla
        Nombre_tabla=txtNombre_Tabla.getText();
        //Comienzo de la creacion de la consulta
        String sql="create table "+Nombre_tabla+" (";
        
        //Intancioamos cada Arreglo y le asignamos como indice el numero de campos  
        nombrescampos= new String[contCampos];
        tiposdatos   = new String[contCampos];
        LogintudDatos = new String[contCampos];
        IndiceCampo = new String[contCampos];
        //////////////////////////////////////////////////////////
        
        //Capturacion de valores de cada control creado dinamicamente 
        
        for (JTextField elemento : jTextArraysCpus) {//Inicio del for mejorado
            //Validaciones
            if(elemento.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error verifique datos ingresados","Error",JOptionPane.ERROR_MESSAGE);
                banderaError=1;
            }
            else if(objeto_vali.Vali(elemento)){
                //Muestro mensajes correspondientes
                banderaError=1;
            }
            else{
                //Capturo Valor hasta que haya cumplido los requisitos
                nombrescampos[i]=elemento.getText().toString();//Capturamos los datos Ingresados por el usuario  
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
                banderaError=1;
            }else{
               //Capturo el valor despues de pasar los requisitos
            tiposdatos[i]=elemento.getSelectedItem().toString();//Capturamos el tipo de datos que el usuario desea ingresar
            }
            //Incrementamos contados por cada iteracion
            i++;
        }//Fin del for mejorado
        //Inicializamos nuevamente el contador a 0
        i=0;
        
        for(JTextField elemento : jTextArraysLogi){//Inicio del for mejorado
            //Validaciones
            if(elemento.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error verifique datos ingresados","Error",JOptionPane.ERROR_MESSAGE); 
                banderaError=1;
            
            }
            else if(objeto_vali.Vali(elemento)){
                //Muestro mensajes respectivo
                banderaError=1;
            }
            
            else if(objeto_vali.validateNumeros(elemento.getText().toString())==false){
                 JOptionPane.showMessageDialog(null, "Error verifique datos ingresados","Error",JOptionPane.ERROR_MESSAGE);
                 banderaError=1;
            }
     
            else{
                //Capturo valor depues de pasados los requisitos 
                LogintudDatos[i]=elemento.getText().toString(); //Capturamos la longitud de cada campo 
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
                if (contllave==0){//Inicio del if2
                    //Agregamos a la sentecia los nombres de los campos que seran primary key
                    sqlprimarykey= sqlprimarykey + nombrescampos[i] ;
                }//Fin el if2
                else{
                    //Por cada iteracion agregamos la , segun los nombre de los campos
                    sqlprimarykey= sqlprimarykey + "," + nombrescampos[i] ;
                }               
                //Incremento del contado de llaves primarias
                contllave++;
             }//Fin el if1
            //Incrementamos contador por cada iteracion
            i++;
        }//Fin del for mejorado
        //Fin de la sentencia
        sqlprimarykey=sqlprimarykey+")";
        //Inicializamos nuevamente el contador a 0
        i=0;
        //Variable que guarda la consulta
        if(banderaError==1){
            //No dejamos que pase la consulta creada
        }else{//En caso Contrario si  
        String sql2="";
        
        try{//Inicio del try
        //Creacion del objeto de la clase conexion    
        Conexion conexion1 = new Conexion(); 
        //Varible que guarda la una consulta
        String sqlQuery;
        //Creacion de la consulta para el uso de la base de datos
        sqlQuery = "use " + cmbBases.getSelectedItem().toString();
       
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
        //Metodo que manda la consulta para utilizar la base de datos  
        conexion1.setQuery(sqlQuery);
        //Consulta terminada para la creacion de la tabla
        sql= sql + sql2;
        //Metodo que manda la consulta para la creacion de la tabla
        conexion1.setQuery(sql);
        //Mensaje
        JOptionPane.showMessageDialog(null, "Tabla "+Nombre_tabla+" Creada Exitosamente");
        }//Fin del try
        
        catch(Exception ex){//Inicio del Catch
        //Si  Ocurre algun Error Cambio Valor a Bandera
        banderaCatch=1;
        JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
        
        }//Fin del Catch
        //Si Entro al Catch hay error y limpio Texbox para corregirlo
        if(banderaCatch==1){
            for(i=0;i<contCampos;i++){//Inicio del for
                jTextArraysLogi[i].setText("");
                jTextArraysCpus[i].setText("");
            }//Fin del for
            txtNombre_Tabla.setText("");
            txtTotalCampos.setText("");
        }else{//Caso Contrario
        //Habilito y deshabilito componentes    
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        //Limpiamos elementos
        txtNombre_Tabla.setText("");
        txtTotalCampos.setText("");
        //Removemos elementos creados dinamicamente para que el usuario 
        //pueda crear otra tabla y perpintamos el jpanel
        jPanel1.removeAll();
        jPanel1.repaint();  
        }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNombre_TablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_TablaKeyTyped
         //Evento para Validar el Ingreso de datos// 
        //Varible de tipo Char 
        char cadena_caracteres;
        //Igualamos la variable para capturar lo ingresado por teclado
        cadena_caracteres=evt.getKeyChar();
        if(!(cadena_caracteres<'0'||cadena_caracteres>'9')){//Inicio del if
        evt.consume(); // ignorar el evento de teclado
        JOptionPane.showMessageDialog(null, "Error No puede Ingresar Numeros","Error",JOptionPane.ERROR_MESSAGE);
        }//Fin del if
        
    }//GEN-LAST:event_txtNombre_TablaKeyTyped

    private void txtTotalCamposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalCamposKeyTyped
        //Declaramos e Igualamos la variable para que capture la tecla pulsada  
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)){//Inicio del if
         evt.consume();  // ignorar el evento de teclado
         JOptionPane.showMessageDialog(null, "Error No puede Ingresar Letras","Error",JOptionPane.ERROR_MESSAGE);
      }//fin del if
        
        
    }//GEN-LAST:event_txtTotalCamposKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //Mostramos menu
       new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {//Inicio del metodo principal
        
     
        java.awt.EventQueue.invokeLater(new Runnable() {//Inicio de la clase //Encapsula máquinas asíncronas de distribución de eventos que extrae los eventos

            public void run() {//Inicio del metodo run
                new Especificar_Campos().setVisible(true);
            }//Fin del metodo run
        });//Fin de la clase
    }//Fin del metodo principal
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBases;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombre_Tabla;
    private javax.swing.JTextField txtTotalCampos;
    // End of variables declaration//GEN-END:variables

}//Fin de la clase
