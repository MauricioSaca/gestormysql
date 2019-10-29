
package cdb.edu.util;

import java.sql.*;//Llamada al paquete
public class Conexion {//Inicio de la clase
    //Miembros
    private Connection conexion = null;//Variable que mandas a llamar al Driver
    private Statement s = null;//Variable utilizada para enviar comandos sql
    private ResultSet rs=null;//Variable que obtiene los datos obtenidos por Statement
    
    //Constructor1
public Conexion() throws SQLException{//Inicio constructor
    try{//Inicio del try
        //obtenemos el driver de para mysql de forma dinamica
        Class.forName("com.mysql.jdbc.Driver");
        // Se obtiene una conexión con la base de datos.
        conexion = DriverManager.getConnection ("jdbc:mysql://localhost/","root", "");
        // Permite ejecutar sentencias SQL sin parámetros
        s = conexion.createStatement();
    }//Fin del try
    catch (ClassNotFoundException e1) {//Inicio del catch
        //Error si no puedo leer el driver de MySQL
        System.out.println("ERROR: No encuentro el driver de la BD: "+e1.getMessage());
    }//Fin del catch
}//Fin del constructor

    //Constructor2
public Conexion(String BD) throws SQLException{//Inicio constructor
    try{//Inicio del try
        //obtenemos el driver de para mysql
        Class.forName("com.mysql.jdbc.Driver");
        // Se obtiene una conexión con la base de datos.
        conexion = DriverManager.getConnection ("jdbc:mysql://localhost/"+BD,"root", "");
        // Permite ejecutar sentencias SQL sin parámetros
        s = conexion.createStatement();
    }//Fin del try
    catch (ClassNotFoundException e1) {//Inicio del catch
        //Error si no puedo leer el driver de MySQL
        System.out.println("ERROR: No encuentro el driver de la BD: "+e1.getMessage());
    }//Fin del catch
}//Fin del constructor

//Metodo que permite obtener los valores del resulset
public ResultSet getRs() {//Inicio metodo
    return rs;
}//Fin metodo

//Metodo que permite fijar la tabla resultado de la pregunta
//SQL realizada
public void setRs(String consulta) {//Inicio del metodo
    try {//Inicio del try
        this.rs = s.executeQuery(consulta);
        //System.out.println(consulta);
    }//Fin del try 
    
    catch (SQLException e2) {//Inicio del catch
        System.out.println("ERROR: Fallo en SQL: "+e2.getMessage());
    }//Fin del catch
}//Fin el metodo


//Metodo que recibe un sql como parametro que sea un update,insert,delete
public void setQuery(String query) throws SQLException {//Inicio del metodo
    this.s.executeUpdate(query);
}//Fin del metodo

//Metodo que cierra la conexion
public void cerrarConexion() throws SQLException{//Inicio del metodo
    conexion.close();
}//Fin del metodo



}//Fin de la clase
