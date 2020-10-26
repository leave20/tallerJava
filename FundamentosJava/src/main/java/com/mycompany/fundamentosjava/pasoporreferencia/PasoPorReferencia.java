
package com.mycompany.fundamentosjava.pasoporreferencia;

import com.mycompany.fundamentosjava.base.Persona;

/**
 *
 * @author Craig
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        
        persona1.nombre="Craig";
        persona1.apellido="Castro";
        System.out.println("Persona 1 nombre = " + persona1.nombre);
        System.out.println("persona 1 apellido = " + persona1.apellido);
        /**
         * Llamando el metodo de tipo void
         */
        cambiarValor(persona1);
        System.out.println("persona1 cambio de nombre = " +  persona1.nombre);
        System.out.println("persona1 cambio de apellido = " + persona1.apellido);
        /**
         * otorgando el nuevo valor a nuestro objeto, usando el metodo de tipo Persona
         */
        persona1=cambiarValorRetornandoUnObjeto(persona1);
        System.out.println("persona1 otro cambio de nombre = " + persona1.nombre);
    }
    /**
     * usando un metodo de tipo Void
     * @param persona 
     */
    public static void cambiarValor(Persona persona) {
            persona.nombre="Karla";
            persona.apellido="Vasquez";
    }
    /**
     * Usando un metodo de tipo Object el cual va a retornar los nuevos valores
     * @param persona
     * @return 
     */
    public static Persona cambiarValorRetornandoUnObjeto(Persona persona){
        persona.nombre="Helena";
        persona.apellido="Gomez";
        return persona;
    }
    
    
}
