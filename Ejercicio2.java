
package Ejercicios;

// @author Artyom

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e 
 *  indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y 
 *  frenar cuando el usuario ingrese la palabra “No”.
 */

public class Ejercicio2 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
       
    renaper();
    
    }
    
    public static String renaper() {
        
    Scanner leer = new Scanner(System.in);
        
    String nombre, mayor, menor, respuesta, renaper;
    
    int edad, personas, contE;
    
    
        do {            
            
            System.out.print("¿Cuál es su Nombre?: ");
            nombre = leer.next();
            
            System.out.print("¿Cuál es su Edad?: ");
            edad = leer.nextInt();
            
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            
            if (edad >= 18) {
                
                System.out.println("Es Mayor de Edad");
                
            } else {
                
                System.out.println("Es Menor de Edad");
                
            }
            
            System.out.print("¿Desea agregar otra Persona?: ");
            respuesta = leer.next();
            
        } while (!respuesta.equalsIgnoreCase("no"));
        
        System.out.println("!Vuelva Pronto!");
        
        return null;
        
    }          

}
