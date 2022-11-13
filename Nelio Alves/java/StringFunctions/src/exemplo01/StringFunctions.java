package exemplo01;

public class StringFunctions {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG     ";

        //torna toda a string minúscula
        String s01 = original.toLowerCase();
        //torna toda a string maiúscula
        String s02 = original.toUpperCase();
        //remove os espaços nas extremidades da string
        String s03 = original.trim();
        //começa a string a partir do caracter na posição informada
        String s04 = original.substring(2);
        //começa e termina a string de acordo com as posições informadas
        String s05 = original.substring(2,9);
        //troca o caracter informado na esquerda pelo da direita
        String s06 = original.replace('a', 'x');
        //troca o substring informado na esquerda pelo da direita
        String s07 = original.replace("abc", "xy");
        //mostra a primeira posição da substring
        int i = original.indexOf("bc");
        //mostra a última posição da substring
        int j = original.lastIndexOf("bc");


        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2,9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace ('abc', 'xy'): -" + s07 + "-");
        System.out.println("indexOf('bc'): " + i);
        System.out.println("lastIndexOf('bc'): " + j);
    }
}
