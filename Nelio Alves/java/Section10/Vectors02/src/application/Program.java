package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the quantity of products: ");
        int n = sc.nextInt(); /*Quebra de linha ficou pendente após o nectInt*/

        Product[] vect = new Product[n];

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++){
            sc.nextLine(); /*Para consumir a quebra de linha*/

            System.out.printf("Type the name of the product %d: %n", i + 1);
            String name = sc.nextLine();

            System.out.printf("Type the price of the product %d: %n", i + 1);
            double price = sc.nextDouble();

            vect[i] = new Product(name, price); /*Apontamento do vetor na posição i para dados do produto*/

            sum += vect[i].getPrice(); /*Somatório, pegando apenas o preço*/
        }

        double avg = sum / vect.length; /*Média*/

        System.out.printf("Average price = $%.2f%n", avg);

        sc.close();
    }
}
