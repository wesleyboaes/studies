/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author wesle
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }
    
    //Métodos Abstratos
    /*Ao utilizar no construtor implements Controlador(nome da interface), ele 
    dá um alert com opção de gerar automaticamento os métodos abstratos.
    Ctrl+E apaga linha inteira, ao gerar os métodos abstratos, apaguei linha 
    por linha do conteúdo para adequação.*/

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------MENU-------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        System.out.print(" ");
        for (int i=0;i<=this.getVolume();i+=10){
            System.out.print("[]");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Não é possível aumentar o volume da TV desligada");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()-5);
        } else {
            System.out.println("Não é possível diminuir o volume da TV desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && (this.getVolume()>0)) {
            this.setVolume(0);
        } else {
            System.out.println("Não é possível colocar no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && (this.getVolume() == 0)) {
            this.setVolume(50);
        } else {
            System.out.println("Não é possível remotirar do mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("Não é possível dar Play");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não é possível dar Pause");
        }
    }
}
