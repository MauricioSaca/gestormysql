/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdb.edu.util;
import javax.swing.*;
/**
 *
 * @author casa
 */
public class Validaciones {
    public boolean Vali(JTextField caja){
        Integer posicion =  caja.getText().indexOf(".");
        Integer posicion1 = caja.getText().indexOf("-");
        Integer posicion2 = caja.getText().indexOf("@");
        Integer posicion3 = caja.getText().indexOf("\"");
        Integer posicion4 = caja.getText().indexOf("\'");
        Integer posicion5 = caja.getText().indexOf("!");
        Integer posicion6 = caja.getText().indexOf("`");
        Integer posicion7 = caja.getText().indexOf("~");
        Integer posicion8 = caja.getText().indexOf("#");
        Integer posicion9 = caja.getText().indexOf("$");
        Integer posicion10 = caja.getText().indexOf("%");
        Integer posicion11 = caja.getText().indexOf("^");
        Integer posicion12 = caja.getText().indexOf("&");
        Integer posicion13 = caja.getText().indexOf("*");
        Integer posicion14 = caja.getText().indexOf("(");
        Integer posicion15 = caja.getText().indexOf(")");
        Integer posicion16 = caja.getText().indexOf("=");
        Integer posicion17 = caja.getText().indexOf("+");
        Integer posicion18 = caja.getText().indexOf(";");
        Integer posicion19 = caja.getText().indexOf(",");
        Integer posicion20 = caja.getText().indexOf("<");
        Integer posicion21 = caja.getText().indexOf(">");
        Integer posicion22 = caja.getText().indexOf("?");
        Integer posicion23 = caja.getText().indexOf("[");
        Integer posicion24 = caja.getText().indexOf("]");
        Integer posicion25 = caja.getText().indexOf("{");
        Integer posicion26 = caja.getText().indexOf("}");
        Integer posicion27 = caja.getText().indexOf("\\");
        Integer posicion28 = caja.getText().indexOf("|");
        Integer posicion29 = caja.getText().indexOf("/");
        Integer posicion30 = caja.getText().indexOf(":");
        Integer posicion31 = caja.getText().indexOf("¿");
        Integer posicion32 = caja.getText().indexOf("¡");
        Integer posicion33 = caja.getText().indexOf(" ");
       
        
        if(posicion != -1){
             JOptionPane.showMessageDialog(null, "No se permite el ingreso de Puntos","Error",JOptionPane.ERROR_MESSAGE);
             caja.setText("");
             caja.requestFocus();
             return true;
        }
        
        else if(posicion1 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Guiones","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                  return true;
            }
        
         else if(posicion2 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Arrobas","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
           else if(posicion3 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Comillas","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
           else if(posicion4 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Comilla simple","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
           else if(posicion5 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Signos de admiracion","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion6 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Comilla","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion7 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Signos de Virgula","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion8 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso Numerales","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion9 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso  Signo de dolar","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion10 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso Signo de porcentaje","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion11 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso del signo de potencia","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion12 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso Aspersan","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion13 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso Asteriscos","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        
         else if(posicion14 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso Parentesis","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
         else if(posicion15 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso Parentesis","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
         else if(posicion16 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso del Signo Igual","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        else if(posicion17 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso del Signo Mas","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        else if(posicion18 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de puntos y coma","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        else if(posicion19 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de comas","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
           else if(posicion20 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de operadores de relacion","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
          else if(posicion21 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de operadores de relacion","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
          else if(posicion22 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de signos de interrogacion","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
          else if(posicion23 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Corchetes","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        else if(posicion24 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Corchetes","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        else if(posicion25 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Llaves","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
          else if(posicion26 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Llaves","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
          else if(posicion27 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Contra Slash","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        else if(posicion28 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Palitos","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
        else if(posicion29 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Plecas","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
         else if(posicion30 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de los dos puntos","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
         else if(posicion31 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Signos de interrogacion","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
         else if(posicion32 != -1){
                JOptionPane.showMessageDialog(null, "No permite el ingreso de Signos de admiracion","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
         else if(posicion33 != -1){
                JOptionPane.showMessageDialog(null, "No se permiten los espacion en blanco","Error",JOptionPane.ERROR_MESSAGE);
                caja.setText("");
                caja.requestFocus();
                return true;
            }
     return false;   
    }
     public static boolean validateNumeros( String lastName )
        {
        return lastName.matches( "[\\d]+" );
        }
}
