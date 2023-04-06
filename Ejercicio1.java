
package Ejercicios;

// @author Artyom

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
 * La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */

public class Ejercicio1 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num1, num2, opcion, resS, resR, resM;
    double resD;
    
        System.out.print("Ingrese un número entero: ");
        num1 = leer.nextInt();
    
        System.out.print("Ingrese otro número entero: ");
        num2 = leer.nextInt();
        
        System.out.println("Menú");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        opcion = leer.nextInt();
        
        switch (opcion) {
            
            
            case 1:
                
                resS = suma(num1, num2);
                
                System.out.println("La Suma es: " + resS);
                
                break;
                
            case 2:
                
                resR = resta(num1, num2);
                
                System.out.println("La Resta es: " + resR);
                
                break;
                
            case 3:
                
                
                resM = mult(num1,num2);
                
                System.out.println("La Multiplicación es: " + resM);
            
                break;
                
            case 4:
                
                resD = div(num1,num2);
                
                System.out.println("La División es: " + resD);
                
                break;
                
            default:
                
                System.out.println("Opción Incorrecta");
                
        }
      
    }

    public static int suma(int num1, int num2) {
        
        int suma;
        
        suma = num1 + num2;
        
        return suma;
    }
    
    public static int resta(int num1, int num2) {
        
        int resta;
        
        resta = num1 - num2;
        
        return resta;
    }
    
    public static int mult(int num1, int num2) {
        
        int mult;
        
        mult = num1 * num2;
        
        return mult;
    }
    
    public static double div(double num1, double num2) {
        
        double div;
        
        div = num1 / num2;
        
        return div;
    }
    
}
