/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        
        System.out.println("Escreva o ano: ");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();        
        
        int a = 0;
        
        if (n%4==0){
            if (n%100!=0){
                a = 29;
            }
        } else if (n%400==0){
            a = 29;
        } else{
            a = 28;
        } //esse ifs tds p saber se o ano eh bissexto
        
        //System.out.println(a);
        
        int dias[] = {31,a,31,30,31,30,31,31,30,31,30,31};
        
        for (int c=0;c<mes.length;c++){
            System.out.println(mes[c] + " possui " + dias[c] + " dias");
        }
    }
    
}
