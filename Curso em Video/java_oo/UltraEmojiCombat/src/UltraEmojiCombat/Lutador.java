/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UltraEmojiCombat;
/**
 *
 * @author wesle
 */
public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    //Métodos Públicos
    public void apresentar(){
        System.out.println("-----------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " m de altura!");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Com card de " + this.getVitorias() + " vitória(s), " 
                + this.getDerrotas() + " derrota(s) e " + this.getEmpates() + " empate(s)");
        System.out.println("-----------------------------------------------------");
    }
    
    public void status(){
        System.out.println("-----------------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vez(es)");
        System.out.println("Perdeu " + this.getDerrotas() + " vez(es)");
        System.out.println("Empatou " + this.getEmpates() + " vez(es)");
        System.out.println("-----------------------------------------------------");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    //Métodos Especiais    
    public Lutador(String no, String na, int id, float al, float pe, 
            int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);/*Usamos setPeso para chamar a função setCategoria*/
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String no){
        this.nome = no;
    }
    
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float al){
        this.altura = al;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    private void setCategoria(){
        if(this.getPeso()<52.2){
            this.categoria = "Inválido";
        }else if (this.peso<=70.3){
            this.categoria = "Leve";
        } else if(this.peso<=83.9){
            this.categoria = "Médio";
        }else if (this.peso<=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }
    
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    
    public int getEmpates(){
        return this.empates;
    }
    
    public void setEmpates(int em){
        this.empates = em;
    }        
}
