package com.mycompany.fundamentosjava;

public class Variables {

    public static void main(String args[]) {
        System.out.println("Hola Mundo");
        //Tipos de datos
        //Tipos primitivos
        //Tipos Enteros
        /*
        Tipos primitivos enteros : byte, short, int , long
         */
        //Determinando lops valores del tipo primitivo
        byte numeroByte = (byte) 128;
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        System.out.println(numeroByte);

        short numeroShort =(short) 32768;
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        System.out.println(numeroShort);

        int numeroInt = 2147483647;
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
        System.out.println(numeroInt);
        
        long numeroLong=922337203654775807L;
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long:" + Long.MAX_VALUE);
        System.out.println(numeroLong);
        /**
         * Definimos la variable primero declarando el tipo de dato que va a
         * tener dentro mi variable
         */
        int miVariableEntera = 10;
        System.out.println("Mi variable es: " + miVariableEntera);
        /**
         * Reutilizamos nuestra variable y le asignamos un nuevo valor
         */
        miVariableEntera = 20;
        System.out.println("El nuevo valor de mi variable es:" + miVariableEntera);

        //Tipos Flotantes
        //Tipos referenciados
        //Clases
        //Interfaces
        //Arreglos
    }
}
