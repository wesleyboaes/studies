package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        //List<Integer> list; /*Lista não aceita tipo primitivo, precisa usar a Wrapper Class*/
        /*O uso de <> é o generics, que é quando vc pode parametrizar a definição de um tipo
        informando um outro tipo específico que vc quiser*/

        List<String> list = new ArrayList<>(); /*Para instancear um tipo que seja uma interface (List)
         precisamos usar uma classe que implementa essa interface (ArrayList)*/

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); /*Adiciona o item na lista, na posição informada*/

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

        System.out.println(list.size()); /*Imprime o tamanho da lista*/

        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

        //list.remove("Anna");/*Consegue remover por comparação*/
        //list.remove(1);/*Consegue remover pela posição*/

        list.removeIf(x -> x.charAt(0) == 'M');/*RemoveIF x tal que x.char na posição 0 seja igual a M.
        Isso se chama predicado e retornará True ou False*/

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        /*Criada nova lista result, converte para stream, assim conseguindo incluir o filtro
         * para encontrar a primeira letra = 'A'. Após isso devemos converter novamente para lista
         * usando collect(Collectors.toList())*/

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        /*Para achar o primeiro item que começa com a letra 'A'. Fazemos a msm coisa de usar o stream,
         * filtrar, usar o predicado, o comando findFirst que retorna o primeiro elemento, mas ele
         * é do tipo optional String, com isso devemos utilizar o comando orElse(null), fazendo retornar
         * nulo caso não comece com a letra 'A'*/

        System.out.println(name);

    }
}
