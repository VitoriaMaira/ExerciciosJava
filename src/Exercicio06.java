import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Maior: " + num1);
            System.out.println("Diferença: " + (num1 - num2));
        } else {
            System.out.println("Maior: " + num2);
            System.out.println("Diferença: " + (num2 - num1));
        }

        sc.close();
    }
}
