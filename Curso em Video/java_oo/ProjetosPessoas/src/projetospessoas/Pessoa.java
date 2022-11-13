/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetospessoas;

/**
 *
 * @author wesle
 */
public class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade;
    
    //Métodos
    public void fazerAniversario(){
        this.idade++;
    }
    
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }    
}
