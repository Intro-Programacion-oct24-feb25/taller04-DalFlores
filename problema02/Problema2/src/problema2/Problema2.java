/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
// import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Core i5-Pro
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaro variables
        Scanner entrada = new Scanner(System.in);
        double gastos_hijo1;
        double gastos_hijo2;
        double gastos_hijo3;
        double gasto_total;
        
        System.out.println("Ingrese los gastos del primer hijo");
        gastos_hijo1 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del segundo hijo");
        gastos_hijo2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo");
        gastos_hijo3 = entrada.nextDouble();
        
        gasto_total = gastos_hijo1 + gastos_hijo2 + gastos_hijo3;
        
        System.out.printf("Gastos hijo 1:%s%n Gastos hijo 2:%s%n"
                + "Gastos hijo 3:%s%n Gastos Totales:%s",
                
                gastos_hijo1,
                gastos_hijo2,
                gastos_hijo3,
                gasto_total);
    }
}

