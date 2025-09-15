import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 16. Leia um número inteiro de 4 dígitos (de 1000 a 9999) e imprima 1 dígito por linha.

        System.out.print("Digite um número de 4 dígitos (1000 a 9999): ");
        int numero = scanner.nextInt();

        if (numero >= 1000 && numero <= 9999) {
            int milhar = numero / 1000;
            int centena = (numero % 1000) / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            System.out.println(milhar);
            System.out.println(centena);
            System.out.println(dezena);
            System.out.println(unidade);
        } else {
            System.out.println("Número inválido.");
        }

        scanner.close();
    }
}
