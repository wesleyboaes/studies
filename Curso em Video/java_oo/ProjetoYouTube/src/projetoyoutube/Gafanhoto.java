/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author wesle
 */
public class Gafanhoto extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;
    
    //Métodos
    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);//Contrutor baseado na superclasse Pessoa
        this.login = login;
        this.totAssistido = 0;
    }

    //Métodos Especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString()/*super se refere a classe super, 
                no caso Pessoa*/ + "\nlogin=" + login + ", totAssistido=" 
                + totAssistido + '}';
    }
}
