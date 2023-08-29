/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooep14;
import java.util.Scanner;
public class POOEP14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número:");
        double numero = scanner.nextDouble();
        double cuadrado = numero * numero;
        double cubo = numero * numero * numero;
        System.out.println("El cuadrado de " + numero + "es:" + cuadrado);
        System.out.println("El cubo de " + numero + "es:" + cubo);
        scanner.close();
    }
    
}


