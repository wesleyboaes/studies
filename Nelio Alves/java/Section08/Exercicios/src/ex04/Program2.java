package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Instanciando objeto*/
        /*Calculator calc = new Calculator();*/
        /*Ao definir as operações constantes como static, não há necessidade
        * de instanciar um objeto para chamar a operação a partir dele*/

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
