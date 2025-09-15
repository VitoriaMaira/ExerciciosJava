import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 19. Implemente um programa que calcule o ano de nascimento de uma pessoa
        // a partir de sua idade e do ano atual.

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int anoNascimento = anoAtual - idade;

        System.out.println("Ano de nascimento: " + anoNascimento);

        scanner.close();
    }
}
