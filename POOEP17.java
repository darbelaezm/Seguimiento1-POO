/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooep17;
import java.util.Scanner;

public class POOEP17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo:");
        double radio= scanner.nextDouble();
        double area = Math.PI * radio * radio;
        double longitudCirc = 2 * Math.PI * radio; //longitud de circunferencia
        System.out.println("Área del círculo:" + area);
        System.out.println("Longitud de la Circunferencia:" + longitudCirc);
        scanner.close();
    }
}


