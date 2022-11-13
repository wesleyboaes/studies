/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UltraEmojiCombat;

import java.util.Random;

/**
 *
 * @author wesle
 */
public class Luta {
    //Atributos
    private Lutador desafiado; //Instância de Lutador
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())/*l1.getCategoria() 
                == l2.getCategoria()*/) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("---------------------FIM DA LUTA---------------------");
                    System.out.println("LUTA ENCERRADA! Empate entre " 
                            + this.getDesafiado().getNome() + " e " + this.getDesafiante().getNome());
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                break;
                case 1:
                    System.out.println("---------------------FIM DA LUTA---------------------");
                    System.out.println("LUTA ENCERRADA! Vitória de " 
                            + this.getDesafiado().getNome() + " sobre " + this.getDesafiante().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                break;
                case 2:
                    System.out.println("---------------------FIM DA LUTA---------------------");
                    System.out.println("LUTA ENCERRADA! Vitória de " 
                            + this.getDesafiante().getNome() + " sobre " + this.getDesafiado().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                break;
            }
        }else{
            System.out.println("A luta não foi aprovada.");
        }
    }
    
    //Métodos Especiais

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
