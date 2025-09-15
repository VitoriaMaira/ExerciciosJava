import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maior: " + num2);
        } else {
            System.out.println("Números iguais.");
        }

        sc.close();
    }
}
