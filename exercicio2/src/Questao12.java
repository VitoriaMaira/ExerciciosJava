import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //12.Leia um valor de comprimento em jardas e apresente-o convertido em
        //metros. A fórmula de conversão é: M = 0, 91 ∗ J, sendo J o comprimento em
        //jardas e M o comprimento em metros.

        System.out.print("Insira um valor em jardas: ");

        double jardas = scanner.nextDouble();
        double metros = 0.91 * jardas;

        System.out.println("Seu valor em metros é: " + metros);

        scanner.close();

    }
}