import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 14. Faça um programa que leia um número inteiro positivo de três dígitos (de 100 a 999).

        System.out.print("Digite um número entre 100 e 999: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            System.out.println("Centena: " + centena);
            System.out.println("Dezena: " + dezena);
            System.out.println("Unidade: " + unidade);
        } else {
            System.out.println("Número inválido.");
        }

        scanner.close();
    }
}
