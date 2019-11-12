package cdb.edu.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalisadorLexico {

    private static Scanner scanner;
    private static final String PATRON = ("(create|drop|database|table|insert|delete|update|set|values|from|where|select|order|by|asc|desc|and|or|not|is|null|varchar|number"
            + "|CREATE|DROP|DATABASE|TABLE|INSERT|DELETE|UPDATE|SET|VALUES|FROM|WHERE|SELECT|ORDER|BY|ASC|DESC|AND|OR|NOT|IS|NULL|VARCHAR|NUMBER)"
            + "|([[a-zA-Z']_]+)"
            + "|([0-9]+)"
            + "|([>|<|=|+|&|!|+|\\-|&|,|*]+)"
            + "|([(|)]?)"
            + "|(;)");

    public static List<String> tokensList;

    public static void generateTokensList(String cadena) {
        tokensList = new ArrayList<String>();
        scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(PATRON);
        Matcher matcher = pattern.matcher(cadena);

        int i = 0;
        while (matcher.find()) {
            
            String tokenTipo1 = matcher.group(1);

            if (tokenTipo1 != null && !tokenTipo1.isEmpty()) {
                tokensList.add(tokenTipo1);
            }

            String tokenTipo2 = matcher.group(2);

            if (tokenTipo2 != null && !tokenTipo2.isEmpty() && i > 0) {
                tokensList.add(tokenTipo2);
//                System.out.println("Variables: " + tokenTipo2);
            }

            String tokenTipo3 = matcher.group(3);

            if (tokenTipo3 != null && !tokenTipo3.isEmpty() && i > 0) {
                tokensList.add(tokenTipo3);
//                System.out.println("Numero: " + tokenTipo3);
            }

            String tokenTipo4 = matcher.group(4);

            if (tokenTipo4 != null && !tokenTipo4.isEmpty() && i > 0) {
                tokensList.add(tokenTipo4);
//                System.out.println("Operador: " + tokenTipo4);
            }

            String tokenTipo5 = matcher.group(5);

            if (tokenTipo5 != null && !tokenTipo5.isEmpty() && i > 0) {
                tokensList.add(tokenTipo5);
//                System.out.println("Parentesis: " + tokenTipo5);
            }

            String tokenTipo6 = matcher.group(6);

            if (tokenTipo6 != null && !tokenTipo6.isEmpty() && i > 0) {
                tokensList.add(tokenTipo6);
//                System.out.println("Punto y coma: " + tokenTipo6);
            }
            
            i++;

        }
    }

}
