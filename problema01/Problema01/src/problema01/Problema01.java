/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

// import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Core i5-Pro
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaramos variables
         Scanner entrada = new Scanner(System.in);
        
        double base; 
        double altura;
        double area;
        
        System.out.println("Ingrese la base del triángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        altura = entrada.nextDouble();
        
        area = base*altura/2;
        System.out.println("El area del triángulo es: " + area);
    }
    
}
