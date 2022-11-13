package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

    /** final serve para que defina o valor PI
    * como constante e não como variável, uma
    * vez atribuído, ele não pode ser alterado */
    public static final double PI = 3.14159;
    /** Padrão de nome para constante é tudo em maiúsculo
    * se forem mais de uma palavra, usar underline */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }
    /**Os métodos precisam ser estáticos para serem chamados
     * na main, que é estática*/
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius /3.0;
    }

}
