/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle.pkgwhile;

/**
 *
 * @author USUARIO
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;  // Iniciar el contador en 1 que es el primer número natural
        
        System.out.println("Los primeros 5 números naturales son:");
        
        // Bucle while que se ejecuta mientras el numero sea menor o igual a 5
        while (numero <= 5) {
            System.out.println("Numero " + numero);  // Imprime el número actual
            numero++;  // Incrementa el número en 1 para la siguiente iteración
        }
        
        System.out.println("Fin del programa");
    }
}