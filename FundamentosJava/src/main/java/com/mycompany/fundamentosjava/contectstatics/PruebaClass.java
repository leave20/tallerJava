
package com.mycompany.fundamentosjava.contectstatics;

/**
 *
 * @author User
 */
public class PruebaClass {
    public static void main(String[] args) {
//        Se crea el objeto
        Domain persona=new Domain("Craig");
//        se muestra su nuevo valor
        System.out.println("persona =" + persona);
//        modificamos su dato inicial
        persona.setNombre("Juan");
//        se muestra el nuevo valor
        System.out.println("persona ="+ persona);
//        se crea otro objeto
        Domain persona2=new Domain("Keni");
//        siendo una nuevo objeto , el contador estatico de nuestra clase va a ir aumentando
        System.out.println("persona2 = " + persona2);
        
        imprimir(persona2);
        
        
    }
    
    public static void imprimir(Domain persona){
        System.out.println("persona = " + persona);
    }
}
 