package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10]; /*Vetor com tamanho 10 - seriam os quartos possíveis*/

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.printf("Rent #%d:%n", i + 1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println();

            vect[room] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
