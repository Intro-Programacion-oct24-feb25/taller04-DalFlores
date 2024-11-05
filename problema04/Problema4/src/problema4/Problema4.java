/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author Core i5-Pro
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaro variables 
        String reporte = "";
        String nombres = "Luis Alberto Carvajal Ludeña";
        String valoresIniciales = "";
        double CPU = 600;
        double teclado = 20; 
        double ratón = 15; 
        double pantalla = 300;
        double costoComputadora = 935; 
        
        System.out.println(reporte);
        System.out.println(nombres);
        System.out.println(valoresIniciales);
        System.out.println(CPU);
        System.out.println(teclado);
        System.out.println(ratón);
        System.out.println(pantalla);
        
        costoComputadora = CPU + teclado + ratón + pantalla;
        
        System.out.printf("Reporte: %s\nNombres: %s\n"
                + "Valores iniciales: %s\nCPU: %.2f\nTeclado: $%.2f\n"
                + "Ratón: $%.2f\nPantalla: $%.2f\n\nValor a cancelar: $%.2f\n",
                reporte,
                nombres,
                valoresIniciales,
                CPU,
                teclado,
                ratón,
                pantalla,
                costoComputadora);
    }
    
}
