package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Student Name: ");
        student.name = sc.nextLine();
        System.out.println("Student grade 1: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Student grade 2: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Student grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }else {
            System.out.println("PASS");
        }

        sc.close();

    }
}
