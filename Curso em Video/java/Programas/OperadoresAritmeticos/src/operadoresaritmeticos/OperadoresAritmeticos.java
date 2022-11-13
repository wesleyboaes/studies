/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template 
 */
package operadoresaritmeticos;

/**
 *
 * @author wesle
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
         *int n2 = 5;
         *float m = (n1 + n2)/2;
         *System.out.printf("A média é igual a %.2f \n", m);
         */
        
        /*int numero = 5;
         *int valor = 5 + numero++;
         */
        
        /*O resultado eh 10 pq ele soma cm o numero (5) e dps soma 1 
         *ao numero, com isso valor apenas pega o 5 + 5.
         *Caso fosse ++numero, esse incremento seria realizado antes do 
         *cálculo entre 5 e numero, assim fazendo ser 5+6.
         */
        //System.out.println(valor);
        
        /*
         *int x = 4;
         *x += 2; // x = x + 2, serve p qlqr operador (+, -, *, /, %)
         *System.out.println(x);
         */
        
        //Gerando aleatórios
        /*gera um num aleatorio entre 0 e 1
        double random = Math.random();
        System.out.println(random);*/
        
        /*para gerar entre qlqr numero, devemos somar o inicio com a variável
        multiplicada por (final - inicio)*/
        double random = Math.random();
        int n = (int) (5 + random * (10-5));//random entre 5 e 10
        System.out.println(n);
        
    }
    
}
