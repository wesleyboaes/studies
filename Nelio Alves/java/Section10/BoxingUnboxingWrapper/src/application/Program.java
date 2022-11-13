package application;

public class Program {

    public static void main(String[] args) {

        int x = 20;

        Object obj = x;
        /*Integer obj = x; --> Posso usar dessa forma, pois a wrapper class Integer equivale ao int*/
        System.out.println(obj);

        int y = (int) obj;
        /*Caso usar Integer, não há necessidade de usar o casting (int)
         * Poderia inclusive realizar expressões, por exemplo int y = obj * 2*/

        System.out.println(y);

    }
}
