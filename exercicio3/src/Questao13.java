import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 13. Faça um programa para converter uma letra maiúscula em minúscula. Use a tabela ASCII.

        System.out.print("Digite uma letra MAIÚSCULA: ");
        char letra = scanner.next().charAt(0);

        if (letra >= 'A' && letra <= 'Z') {
            char minuscula = (char)(letra + 32);
            System.out.println("Letra minúscula: " + minuscula);
        } else {
            System.out.println("Entrada inválida.");
        }

        scanner.close();
    }
}
