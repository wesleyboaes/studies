/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author wesle
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
        g[1] = new Gafanhoto("Creuza", "F", 12, "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);//Jubileu assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);//Jubileu assiste PHP
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        //Pessoa p = new Pessoa("Jubileu", 22, "M");
        /*
        System.out.println("VÍDEOS\n----------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n----------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
    }
    
}
