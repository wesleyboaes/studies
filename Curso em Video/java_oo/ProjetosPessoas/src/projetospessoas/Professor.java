/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetospessoas;

/**
 *
 * @author wesle
 */
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos
    public void receberAumento(float a){
        this.salario += a;
    }
    
    //Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
