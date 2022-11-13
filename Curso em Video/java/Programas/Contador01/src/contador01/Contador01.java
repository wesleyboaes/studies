/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        while (c<10){
            c++;
            if (c == 5 || c == 7 || c == 9){
                continue;//Serve para que o while não faça o comando e continue o looping
            }
            if (c == 8){
                break;//Serve para que o looping pare
            }
            System.out.println("Cambalhota " +c);
        }
    }
    
}
