/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva o nome do aluno: ");
        String nome = ler.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = ler.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        
    }
    
}
