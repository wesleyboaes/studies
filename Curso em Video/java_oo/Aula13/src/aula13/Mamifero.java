/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author wesle
 */
public class Mamifero extends Animal {
    //Atributos
    protected String corPelo;
    
    //Métodos
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    //Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
