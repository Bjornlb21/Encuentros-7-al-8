
package Ejercicios;

// @author Artyom

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 *  yenes o libras.
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
 *  este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 *  0.86 libras es un 1 €
 *  1.28611 $ es un 1 €
 *  129.852 yenes es un 1 €
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    double eur;
    
    String res;
    
        System.out.print("Ingrese una cantidad de Euros a Convertir: ");
        eur = leer.nextInt();
                
        System.out.println("¿A qué moneda desea convertir los Euros?: ");
        
        System.out.println("1: Libras");
        System.out.println("2: Dólares");
        System.out.println("3: Yenes");
        res = leer.next();         
       
        conversion(eur, res);
       
    }
    
    public static void conversion(double eur, String res) {
        
        double resultado;
        
        String divisaDestino;
        
        switch(res) {
            
            case "dolares":
                
                resultado = eur * 1.28611;
                divisaDestino = "dolares";
                
                break;
                
            case "yenes":
                
                resultado = eur * 129.852;
                divisaDestino = "yenes";
                
                break;
                
            case "libras":
                
                resultado = eur * 0.86;
                divisaDestino = "libras";
                
                break;
                
            default:
                
                System.out.println("La moneda introducida no es válida.");
                return;
        }
       
        System.out.printf("%.2f euros son %.2f %s\n", eur, resultado, divisaDestino);
    }
  
}
