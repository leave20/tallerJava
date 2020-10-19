/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fundamentosjava;

/**
 *
 * @author User
 */
public class Strings {
    public static void main(String[] args) {
        
        String miVariableCadena = "Craig Kem Castro Pairazaman";
        System.out.println("Mi variable de tipo cadena es:" + miVariableCadena);
         miVariableCadena = "Rick Julcamoro Pairazaman";
        System.out.println("El nuevo valor de mi variable de tipo cadena es:" + miVariableCadena);
        //Caracteres especiales al momento de concatenar
        //Nuevo salto de linea
        miVariableCadena= "Trace Lizeth Julcamoro Pairazaman";
        System.out.println("El nuevo valor de mi variable de tipo cadena es: \n" + miVariableCadena);
        //Generar un espacio
        System.out.println("El nuevo valor de mi variable de tipo cadena es: \t" + miVariableCadena);
        //Omitir los espacios antes de una concatenación
        System.out.println("El nuevo valor de mi variable de tipo cadena es: \b" + miVariableCadena);
        //Agregar comillas dentro de una concatenación y que se muestre en consola
        System.out.println("El valor de mi variable es: \'"+ miVariableCadena+"\'");
        System.out.println("El valor de mi variable es: \""+miVariableCadena+"\"");
    }
   
}
