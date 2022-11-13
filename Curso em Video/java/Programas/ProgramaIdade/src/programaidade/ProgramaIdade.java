/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2021-ano;
        System.out.println("Sua idade é: " +idade);
        if (idade >= 18){
            System.out.println("MAIOR DE IDADE");
        }
        else{
            System.out.println("MENOR DE IDADE");
        }
        
    }
    
}
