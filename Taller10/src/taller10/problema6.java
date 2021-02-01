/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

/**
 *
 * @author JEanpa
 */
public class problema6 {
     public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"}, {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        int caracteres;
        String cadenaFinal = "";
         for (String[] estudiante : estudiantes) {
            for (String estudiante1 : estudiante) {
                caracteres = estudiante1.length();
                if (caracteres == 11) {
                    cadenaFinal = String.format("%s%s\n", cadenaFinal, estudiante1);
                }
            }
         }
        System.out.printf("Los estudiantes que tienen 11 caracteres"
                + "(contando el espacio en blanco como 1 caracter)son:\n%s",
                cadenaFinal);
    }
}

