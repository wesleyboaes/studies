/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        int n, par=0, imp=0, c=0, s=0, cem = 0, media;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            if(n%2==0){
                par++;
            } else{
                imp++;
            }
            if (n>100){
                cem++;
            }
            s += n;
            c++;
        } while(n!=0);
        media = s/c;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" 
                + "<br>Total de valores: " +c 
                + "<br>Total de pares: " +par 
                + "<br>Total de ímpares: "+imp
                + "<br>Acima de 100: "+cem
                + "<br>Média dos valores: "+media
                + "</html>");
        
        //JOptionPane.showMessageDialog(null, "Você digitou: "+n);
    }
    
}
