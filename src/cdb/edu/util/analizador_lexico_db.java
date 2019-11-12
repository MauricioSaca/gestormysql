package cdb.edu.util;

import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class analizador_lexico_db {

    static List<String> diccionario;
    static String diccionario_db[] = {"create", "table", "nameTable", "(", "columnName", "typeColumn", ",", ")", ";"};

    static int matriz[][];

    public static void generateMatriz(int size) {
        matriz = new int[size][size];

        for (int m = 0; m < size; m++) {
            for (int n = 0; n < size; n++) {
                matriz[m][n] = 0;
            }
        }

        for (int z = 0; z < size; z++) {
            if (z < (size - 1)) {
                matriz[z][z + 1] = 1;
            }
        }

    }

    static String delimitador = " ,();";
    

    public static boolean runAnalizadorSintactico(String cadena) {
        int Panterior = 0, Pactual = -1, linea = 0;
        boolean isValid = true;
        AnalisadorLexico.generateTokensList(cadena);
        diccionario = AnalisadorLexico.tokensList;

        StringTokenizer lineas = new StringTokenizer(cadena, "\n");//CORTAMOS POR SALTOS DE LINEA
        StringTokenizer tokens;
        System.out.println(diccionario);

        generateMatriz(diccionario.size());
        System.out.println(matriz);

        System.out.println("AFTER analizador lexico \n\n");

        while (lineas.hasMoreTokens()) {//LEEMOS LINEA A LINEA
            linea++;//incrementamos la linea
            tokens = new StringTokenizer(lineas.nextToken(), delimitador, true);//CORTAMOS CADA LINEA EN TOKENS SEPARADOS
            while (tokens.hasMoreTokens()) {
                String token = tokens.nextToken().trim();
                if (!token.equals("")) {
                    System.out.println(token);
                    Pactual = regresa(token, Panterior);
                    if (!token.equalsIgnoreCase(diccionario.get(Pactual)) && linea == 1) {
                        JOptionPane.showMessageDialog(null, "NO es una palabra reservada ", "Info", JOptionPane.INFORMATION_MESSAGE);
                                
                        isValid = false;
                        break;
                    } else {
                        if (Panterior > 0) {
                            if (matriz[Panterior][Pactual] == 0) {
                                isValid = false;
                                JOptionPane.showMessageDialog(null, "ERROR DE SINTAXIS CERCA DE " + diccionario.get(Panterior) + " EN LINEA: " + linea, "Info", JOptionPane.INFORMATION_MESSAGE);
                                
                            }
                        }
                    }
                    Panterior = Pactual;
                }

            }

        }
        
        return isValid;
    }

    static int regresa(String token, int panterior) {
        for (int i = (panterior + 1); i < diccionario.size(); i++) {
            if (token.equals(diccionario.get(i))) {
                return i; //REGRESAMOS LA POSICION DE EL TOKEN EN EL VECTOR
            }
        }
        return 0;
    }

}
