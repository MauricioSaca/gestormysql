//Contenedor de clases
package cdb.edu.util;
//Importacion de paquetes
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Mostrar_Tablas {//Inicio de clase
    //Metodo
    public void Ver(String consulta,JComboBox bd,JTable model){//Inicio del metodo
         try{//Inicio del try
            //Objeto tipo tablamodel para el ingreso de los datos en el jTable
           DefaultTableModel modelo = new DefaultTableModel();
            //Tabla virtual que captura los datos arrojados por la consulta
            ResultSet rs;
            //Variables contenedoras de sentencias sql
            String sqlbd = bd.getSelectedItem().toString();
            //Creacion de objeto Conexion mandandole de parametro la bd
            Conexion con = new Conexion(sqlbd);
            //Mando consulta
            con.setRs(consulta);
            //Asiganmos datos capturados en la consulta al ResultSet
            rs = con.getRs();
             //Se obtiene el número de columnas.
           ResultSetMetaData metaDatos = rs.getMetaData();
           int numeroColumnas = metaDatos.getColumnCount();
           // Se crea un array de etiquetas para rellenar
           Object[] etiquetas = new Object[numeroColumnas];
           // Se obtiene cada una de las etiquetas para cada columna
           for (int i = 0; i < numeroColumnas; i++){
                // Nuevamente, para ResultSetMetaData la primera columna es la 1. 
                etiquetas[i] = metaDatos.getColumnLabel(i + 1); 
            }
           //Le agrego al modelo de la tabla las columnas identificadas
           modelo.setColumnIdentifiers(etiquetas);
           //Recorro cada una de las columnas capturadas por el resultSet
           while(rs.next()){
                // Se crea un array que será una de las filas de la tabla. 
                Object [] fila = new Object[numeroColumnas];
                // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                for (int i=0;i<numeroColumnas;i++)
                // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                fila[i] = rs.getObject(i+1); 
                modelo.addRow(fila);
           }
           //Agrego el modelo formado a la tabla 
           model.setModel(modelo);
            
           
        }catch(SQLException ex){//Inicio del catch
            JOptionPane.showMessageDialog(null, ex.getMessage()," Error",JOptionPane.ERROR_MESSAGE);
        }//Fin del catch
    }//Fin del metodo
}//Fin de la clase
