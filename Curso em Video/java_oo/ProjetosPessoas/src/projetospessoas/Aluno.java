/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetospessoas;

/**
 *
 * @author wesle
 */
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada.");
        this.matricula = 0;
    }
    
    //Métodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
