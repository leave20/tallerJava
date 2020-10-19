package com.mycompany.fundamentosjava;

public class Sentencias {

    public static void main(String[] args) {
        /**
         * If - else
         */

        var condicion = false;
        if (condicion) {
            System.out.println("Condición es verdadera");
        } else {
            System.out.println("Condición es falsa");
        }

        /**
         * if - else if - else
         */
        var numero = 5;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto= " + numeroTexto);

        /**
         * Ejercicio de las estaciones del año con if y else if
         */
        var mes = 1;
        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }  
        System.out.println("Estación: " + estacion);
        
        /**
         * Ejercicio de las estaciones del año con if y else if
         */
        switch(mes){
            case 1: case 2: case 12:
                estacion="Invierno";
                break;
            case 3: case 4: case 5:
                estacion="Primavera";
                break;
            case 6: case 7: case 8:
                estacion="Verano";
                break;
            case 9: case 10: case 11:
                estacion="Otoño";
        }
        System.out.println("estacion:" + estacion);
    }

}
