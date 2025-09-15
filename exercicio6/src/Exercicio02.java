import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        if (numero >= 0) {
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        } else {
            System.out.println("Número inválido.");
        }

        sc.close();
    }
}
