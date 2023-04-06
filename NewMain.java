
package Ejercicios;

// @author Artyom

import java.util.Scanner;

public class NewMain {
    
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca la cantidad de euros que desea convertir: ");
        double euros = input.nextDouble();
        
        System.out.print("A qué moneda desea convertir? Dólares, Yenes o Libras");
        String moneda = input.next();
        
        convertirDivisa(euros, moneda);
    }
    
    public static void convertirDivisa(double euros, String moneda) {
       
        double resultado;
        String divisaDestino;
        
        switch(moneda) {
            case "dolares":
                resultado = euros * 1.28611;
                divisaDestino = "dolares";
                break;
            case "yenes":
                resultado = euros * 129.852;
                divisaDestino = "yenes";
                break;
            case "libras":
                resultado = euros * 0.86;
                divisaDestino = "libras";
                break;
            default:
                System.out.println("La moneda introducida no es válida.");
                return;
        }
        
        System.out.printf("%.2f euros son %.2f %s\n", euros, resultado, divisaDestino);
    }
}
