/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea7;

import java.util.Scanner; 

/**
 * Programa Calculadora de Impuestos
 * Calcula el impuesto a pagar según diferentes rangos salariales
 * @author FRANKLIN PARRA
 */
public class Tarea7 {

    public static void main(String[] args) {
        // Crear objeto para leer datos de entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE IMPUESTOS");
        System.out.println("-----------------------");
        
        try {
            // Pedir al usuario que ingrese su salario
            System.out.print("Introduzca su salario mensual: $");
            double salario = entrada.nextDouble();
            
            // Verificar que el salario sea positivo
            if (salario < 0) {
                System.out.println("El salario no puede ser negativo");
                return;
            }
            
            // Variables para guardar los resultados
            double impuesto;
            String categoria;
            
            /*
             * Estructura condicional para calcular impuestos:
             * - Menos de $500: 0% de impuesto
             * - $500-$1000: 10% de impuesto
             * - $1001-$2000: 15% de impuesto
             * - Más de $2000: 20% de impuesto
             */
            if (salario < 500) {
                impuesto = salario * 0;
                categoria = "Exento";
            } 
            else if (salario <= 1000) {
                impuesto = salario * 0.10;
                categoria = "10%";
            }
            else if (salario <= 2000) {
                impuesto = salario * 0.15;
                categoria = "15%";
            }
            else {
                impuesto = salario * 0.20;
                categoria = "20%";
            }
            
            // Mostrar los resultados obtenidos
            System.out.println("\nRESULTADOS:");
            System.out.println("Categoría impositiva: " + categoria);
            System.out.printf("Total impuestos: $%.2f %n", impuesto);
            System.out.printf("Salario neto: $%.2f %n", salario - impuesto);
            
        } catch (Exception ex) {
            // Manejar error si no se introduce un número
            System.out.println("Error: Introduzca solamente valores numéricos");
        } finally {
            // Cerrar el objeto Scanner
            entrada.close();
        }
    }
}