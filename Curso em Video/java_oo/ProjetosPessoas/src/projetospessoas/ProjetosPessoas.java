/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetospessoas;

/**
 *
 * @author wesle
 */
public class ProjetosPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setIdade(19);
        p2.setIdade(21);
        p3.setIdade(43);
        p4.setIdade(27);
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
         
        /*
        p1.receberAum(550.20f);
        p2.mudatTrabalho();
        p4.cancelarMatricula();
        */
    }
    
}
