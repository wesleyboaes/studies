/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author wesle
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n[] ou int[] n = new int [4]; //Pode ser assim*/
        int n[] = {3,2,8,7,5,4}; //Ou assim
        
        /*System.out.println("Total de casas do N " + n.length);//n é um objeto
         * logo podemos usar atributos nele como o caso do length*/
        
        /* for(int c=0;c<=5;c++){
         *  System.out.println("Na posição " + c + " temos o valor " + n[c]);
         * } assim seria o uso "normal do for, com contagem até o valor 5 que 
         * sabemos ser o tamanho do vetor"
         */
        
        for (int c=0;c<=n.length-1;c++)/*ou int c=0;c<n.length;c++ ou int c=1;c<=n.length;c++*/{
            System.out.println("Temos na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}
