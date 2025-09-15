import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //20.Leia um valor em real e a cotação do dólar. Em seguida, imprima o valor
        //correspondente em dólares.

        System.out.print("Digite um valor em real: ");

        double real = scanner.nextDouble();
        double dolar = real / 5.51;

        System.out.println("Seu valor em dollar é: " + dolar);

        scanner.close();

    }
}