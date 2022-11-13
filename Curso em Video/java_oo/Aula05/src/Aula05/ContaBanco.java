/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author wesle
 */
public class ContaBanco {
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais
    public ContaBanco(){//Construtor
        this.saldo = 0;
        this.status = false;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus( boolean st){
        this.status = st;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    //Métodos Personalizados 
    
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){//CC -> Conta Corrente / CP -> Conta Poupança
            this.setSaldo(50);//Poderia ser this.saldo = 50;
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){// Poderia ser if (this.saldo >0){
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro.");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois ainda tem débito.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){//Poderia ser getStatus() == true ou this.status ==true
            //this.saldo += v;
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de " + this.getDono() + 
                        ", seu novo saldo é de " + this.getSaldo());
            }else{
                System.out.println("Saldo insuficiente para saque.");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    
    public void pagarMensal(){
        float v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }  
}
