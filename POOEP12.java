/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooep12;
import java.util.Scanner;

public class POOEP12 {

    public static void main(String[] args) {
        double ht = 48; //Horas trabajadas
        double tarifaHora = 5000;
        double salarioBruto = ht*tarifaHora;
        double retFuente = salarioBruto * 0.125;
        double salarioNeto = salarioBruto - retFuente;
        System.out.println("Salario Bruto:" + salarioBruto);
        System.out.println("Retención en la fuente:" + retFuente);
        System.out.println("Salario Neto:" + salarioNeto);
    }
    
}



