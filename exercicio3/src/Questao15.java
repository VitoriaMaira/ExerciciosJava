import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 15. Gere outro número formado pelos dígitos invertidos do número lido.

        System.out.print("Digite um número de 3 dígitos: ");
        int numero = scanner.nextInt();

        int c = numero / 100;
        int d = (numero % 100) / 10;
        int u = numero % 10;

        int invertido = u * 100 + d * 10 + c;
        System.out.println("Número invertido: " + invertido);

        scanner.close();
    }
}
