/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaparimpar;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class ProgramaParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Escreva o número a ser verificado: ");
        int n = t.nextInt();
        if (n%2==0){
            System.out.println("O número é par!");
        }
        else{
            System.out.println("O número é ímpar!");
        }
    }
    
}
