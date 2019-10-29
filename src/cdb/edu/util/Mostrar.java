//Contenedor de clases
package cdb.edu.util;
//Importacion de librerias
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Mostrar {//Inicio de la clase
    //Metodo que muestra las bases de datos existentes
    public void Ver(JComboBox Bases){//Inicio del metodo
        //Representa una conexion hacia los datos.
       //Extrae cada la informacion de la base de datos segun nuestra conveniencia
        ResultSet rs=null;  
        try{//Inicio del try
            //Creacion del objeto tipo Conexion
            Conexion conexion1 = new Conexion();
            //Variable que almacena la consulta
            String sqlMostraBase;
            //Asignacion de la consulta a la variable
            sqlMostraBase = "show databases";
            //Realizacion de la consulta por medio del metodo serRs
            conexion1.setRs(sqlMostraBase);
            //Asignamos la consulta ya realizada al la variable de tipo ResulSet que nos almacena los datos
            rs= conexion1.getRs();
            //Estructura repetitiva que ejecuta el metodo next del ResultSet para moverse entre filas de la tabla virtual ya llenada
            while (rs.next()){//Inicio del while
               //Llenado del comboBox con las bases de datos existentes  
                 if((rs.getString(1).equals("information_schema"))||(rs.getString(1).equals("mysql"))||(rs.getString(1).equals("performance_schema"))||(rs.getString(1).equals("test"))){
                    Bases.removeItem(rs.getString(1));
                }
                 else{
                     Bases.addItem(rs.getString(1));    
                 }                       
            }//Fin del while
         }//Fin del try
        catch (Exception ex) {//Inicio del cacth por cualquier error que pueda suceder
            //Mostramos mensaje
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }//fin del catch
    }
    
    //Metodo que muestras las tablas de una determinada bases de datos
    public void Ver_Tablas(JComboBox base,JComboBox tabla){
        try {//Inicio del Try
                //Variable que captura la base de datos seleccionada
                String sqlQuery;
                //Variable contenedora de la sentencia sql
                String sqlTable;
                //Tabla virtual que almacena los datos de la consulta realizada
                ResultSet rs1;
                //Selecciono la base de datos
                sqlQuery = base.getSelectedItem().toString();
                //Creo el objeto conexion y le mando de parametros la base de datos 
                Conexion conexion2 = new Conexion(sqlQuery);
                //Asigno la consulta a la variable
                sqlTable = "show tables";                                            
                //Ejecuto consulta por medio del objeto conexion y su metodo
                conexion2.setRs(sqlTable);
                //Asigno los resultado devueltos por la consulta al ResultSet
                rs1 = conexion2.getRs();
                //Elimino los datos del comboBox por cada seleccion hecha
                 tabla.removeAllItems();
                //Estrucrura Repetitiva que se ejecuta miestras el ResulSet con 
                //Su metodo Next devuelva true es decir que a encontrado datos en la Bd
                while (rs1.next()) {//Inicio del while
                    //Agrego cada elemento encontrado al ComboBox
                     tabla.addItem(rs1.getString(1));
                     
                }//fin de while
            }//Fin del try 
        catch (Exception ex) {//Inicio del Catch
            //Captura cualquier error producido detro del try    
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
            }//Fin del catch
    }
    
    
    public void VerElemento(JComboBox base,JComboBox tabla,JComboBox Elementos){
         try {//Inici odel try
            //Tabla Virtual que almacena los datos que devuelve la consulta realizada
                ResultSet rs=null;
                //Variable que contiene el nombre de la base de datos a seleccionar
                String BD ;
                //Asignacion de nombre de la Bd 
                BD = base.getSelectedItem().toString();
                //Creacion de objeto tipo conexion y le mando de parametro la Base de datos seleccinada
                Conexion conexion = new Conexion(BD);  
                //Variable contenedora de la sentencia sql a trabajar
                 String  SqldescribeTable;
                 //Asignacion de la consulta a la variable
                 SqldescribeTable = "describe "+tabla.getSelectedItem().toString();
                 //Ejecuto consulta por medio del objeto conexion y su metodo mandandole como parametros la consulta
                 //Construida
                 conexion.setRs(SqldescribeTable);
                 //Asigno los resultado devueltos por la consulta al ResultSet
                 rs = conexion.getRs();
                 //Remuevo elementos por cada cambio de seleccion
                 Elementos.removeAllItems();
                 //Estructura repetitiva que secuestra los datos de la Base de datos
                 while(rs.next()){//Inicio del while
                     //Lleno combobox con loe elementos encontrados
                     Elementos.addItem(rs.getString(1));
                 }//Fin del while
            } 
            catch (Exception ex) {//Inicio del catch
                //Captura de cualquier error ocurrido dentro del try
                 //JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }//Fin del catch
    }
}//Fin de la clase



