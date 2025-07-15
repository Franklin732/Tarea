/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle.pkgdo.pkgwhile;

import java.util.Scanner; // Importamos Scanner para leer la entrada del usuario

/**
 *
 * @author USUARIO
 */
public class BucleDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSecreto = 7; // Número que el usuario debe adivinar
        int intento; // Variable para guardar lo que ingresa el usuario
        
        System.out.println("Juego de Adivinanza");
        System.out.println("Adivina el número secreto (entre 1 y 10)");

        // Bucle do-while: se ejecuta al menos una vez
        do {
            System.out.print("Ingresa tu número: ");
            intento = input.nextInt(); // Leer lo que ingresa el usuario
            
            // Damos pistas al usuario
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor");
            }
            
        } while (intento != numeroSecreto); // Repetir mientras no acierte
        
        System.out.println("Adivinaste el número secreto: " + numeroSecreto);
    }
}