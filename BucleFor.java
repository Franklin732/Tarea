/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle.pkgfor;

/**
 *
 * @author USUARIO
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0; // Variable para almacenar la suma total
        
        System.out.println("Calcular la suma de los primeros 10 números...");
        
        // Bucle for para sumar los números del 1 al 10
        for(int i = 1; i <= 10; i++) {
            suma = suma + i; // Sumamos el número actual al total
            System.out.println("Sumando " + i + " -> Total parcial: " + suma);
        }
        
        System.out.println("\nLa suma total de los primeros 10 números es: " + suma);
    }
}
