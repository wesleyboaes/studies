/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoLivro;

/**
 *
 * @author wesle
 */
public class Livro implements Publicacao {
    
    //Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos
    public String detalhes() {
        return "Livro{\n" + " Título = " + titulo + ",\n Autor = " + autor 
                + ",\n Total de Páginas = " + totPaginas + ",\n Página Atual = " 
                + pagAtual + ",\n Está Aberto = " + aberto + ",\n Leitor = " 
                + leitor.getNome() + ", Idade = " + leitor.getIdade() + " anos" + 
                ", Sexo = " + leitor.getSexo()+ " }";
    }
    
    
    //Contrutor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    
    //Métodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos abstratos
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p <= this.totPaginas){
            this.pagAtual = p;
        }else{
            System.out.println("Não é possível abrir a página solicitada");
        }       
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
