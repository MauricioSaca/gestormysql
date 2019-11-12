package cdb.edu.util;

import java.util.StringTokenizer;

public class analizador_lexico {

    static String diccionario[] = {"#include", "<", "iostream.h", ">", "void", "main", "(", ")", "{", "int", "var", ";", "}"};
    static int grafo[][] = {
        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
    };

    static String codigo = "#include <iostream.h>\n"
            + "void main ()\n{"
            + "int a;\n"
            + "}";
    static String delimitador = " <>(){};";
    static int Panterior = -1, Pactual = -1, linea = 0;

    public static void main(String[] args) {
        StringTokenizer lineas = new StringTokenizer(codigo, "\n");//CORTAMOS POR SALTOS DE LINEA
        StringTokenizer tokens;
        while (lineas.hasMoreTokens()) {//LEEMOS LINEA A LINEA
            linea++;//incrementamos la linea
            tokens = new StringTokenizer(lineas.nextToken(), delimitador, true);//CORTAMOS CADA LINEA EN TOKENS SEPARADOS
            while (tokens.hasMoreTokens()) {
                String token = tokens.nextToken().trim();
                //visualizamos los tokens si queremos
                if (!token.equals("")) {
                    System.out.println(token);
                    Pactual = regresa(token);
                    if (Panterior > 0) {
                        if (grafo[Panterior][Pactual] == 0) {
                            System.out.println("ERROR DE SINTAXIS CERCA DE " + diccionario[Panterior] + " EN LINEA: " + linea);
                        }
                    }
                    Panterior = Pactual;
                }

            }

        }
    }

    static int regresa(String token) {
        for (int i = 0; i < diccionario.length; i++) {
            if (token.equals(diccionario[i])) {
                return i; //REGRESAMOS LA POSICION DE EL TOKEN EN EL VECTOR
            }
        }
        if (Character.isLetter(token.charAt(0))) {
            return 10; //REGRESAMOS LAPOSICION DE LA VARIABLE EN EL VECTOR
        } else {
            return 0;
        }

    }

}
