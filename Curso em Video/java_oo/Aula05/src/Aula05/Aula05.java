/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05;

/**
 *
 * @author wesle
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Vandinha");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);
        
        p1.fecharConta();
        
        p1.estadoAtual();        
        p2.estadoAtual();
    }
    
}
