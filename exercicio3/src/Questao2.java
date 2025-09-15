import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultado = (3 * numero + 1) + (2 * numero - 1);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
