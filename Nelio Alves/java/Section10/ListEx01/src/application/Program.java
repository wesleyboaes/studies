package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int N = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            System.out.println();
            System.out.printf("Employee #%d:%n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            /*Testando se o ID já foi digitado */
            while (hasId(list, id)) {
                System.out.println("ID already taken! Try again: ");
                id = sc.nextInt();
            }
            
            System.out.print("Name: ");
            sc.nextLine(); /* Para limpar o buffer de entrada, pois ao digitar o sc.nextInt anterior,
             * ao dar Enter, ele precisa consumir essa quebra de linha que é gerada no buffer de entrada.
             * Se apenas colocar o String name = sc.nextLine(); ele iria consumir esse enter dado após
             * digitar o cs.nextInt; */
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            /* Criando objeto funcionário */
            Employee emp = new Employee(id, name, salary);

            /* Inserindo o funcionário na lista */
            list.add(emp);


        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        /* Forma de busca da posição mais otimizada */
        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        /* Usando o stream, transformamos a lista em stream para conseguir utilizar funções de alta ordem
         * (lambda), nesse caso chamamos a função filter, para filtrar a lista de acordo com o que for
         * informado no predicado utilizado. Lê-se o predicado utilizado da seguinte forma: elemento x
         * tal que x.getID() seja igual ao idsalary. Com isso o findFirst() retorna o resultado do filto,
         * caso não existir retornará nulo. Resumindo, vc está buscando na lista a primeira ocorrência
         * de um funcionário que tenha o ID igual ao que foi digitado */

        /* Testando a busca da posição utilizando a função auxiliar position, criada no final do código*/
        /* Integer pos = position(list, idsalary); */
        /* if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent); /* Vou na lista e acesso o funcionário na posição pos
             * e utilizo a função increaseSalary */
        /*}*/

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");

        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    /* Função auxiliar para verificar se o ID já existe */
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    /* Função auxiliar para procurar um elemento na lista */

    /* Recebe como argumento uma lista de funcionários e um ID - Retorna a posição desse funcionário
     * na lista */
    public static Integer position(List<Employee> list, int id) { /* precisa do static pq o mais é static */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) { /* .get() retorna a posição do elemento, por exemplo,
             * a posição 0 (i == 0) vai comparar se o id dessa posição é igual ao id informado */
                return i; /* retornando a posição em que o id foi encontrado */
            }
        }
        return null;
    }
}