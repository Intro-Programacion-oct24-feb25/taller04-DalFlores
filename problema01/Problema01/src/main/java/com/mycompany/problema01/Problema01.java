/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema01;
import java.util.Scanner;
/**
 *
 * @author dalto
 */
public class Problema01 {
    
    /**
     * @param args the command line arguments 
     */

    public static void main(String[] args) {
        //TODO codde application logic here
        // declaramos las variables 
        Scanner entrada = new Scanner (System.in); 
         
        double base;
        double altura; 
        double area;
         
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
         
        area = (base*altura)/2;  
        System.out.println("Area del triangulo es: " + area);
        
    }
}
