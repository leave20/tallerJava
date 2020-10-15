/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fundamentosjava;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Escaneo {

    public static void main(String[] args) {
        System.out.println("Escriba su nombre");
        /**
         * Scanner es una clase en el paquete java. util utilizada para obtener
         * la entrada de los tipos primitivos como int, double etc. y también
         * String.
         */
        Scanner nombre = new Scanner(System.in);
        var consola = nombre.nextLine();
        System.out.println("mi nombre es: " + consola);
        System.out.println("Escriba su apellido");
        var apellido = nombre.nextLine();
        System.out.println("Nombre completo es:" + consola + " " + apellido);
    }
}
