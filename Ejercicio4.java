
package Ejercicios;

// @author Artyom

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false.
 * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 * 
 */

public class Ejercicio4 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num;
    
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
     primo(num);

    }

    public static void primo(int num) {
        
        int primo, c = 0;
        
        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0) {
                
                c++;
                
            }
           
        }
        
        if (c == 2) {
            
            System.out.println("El Número es Primo");
            
        } else {
            
            System.out.println("El número no es Primo");
            
        }
    }
    
}
