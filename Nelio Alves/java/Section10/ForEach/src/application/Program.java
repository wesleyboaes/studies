package application;

public class Program {

    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {

            System.out.println(vect[i]);

        }

        /*Usando o laço for each*/

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (String obj : vect) { /*Tipo, Apelido(o nome que quiser) e Coleção*/
            System.out.println(obj);
        }
    }
}
