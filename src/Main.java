//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String nome1 = "João";
        int idade2 = 19;
        double nota = 9.99;


        System.out.printf("Nome: %s, Idade: %d\n", nome1, idade2);
        System.out.printf("Nota final: %.2f\n", nota);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome + "\n Idade: " + idade);

        scanner.close();
    }

}