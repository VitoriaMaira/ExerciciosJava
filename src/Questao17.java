import java.util.Scanner;


public class Questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //17. Leia um valor de área em hectares e apresente-o convertido em metros
        //quadrados é m2 . A fórmula de conversão é: M = H ∗ 10000, sendo M a área
        //em metros quadrados é H a área em hectares. ́

        System.out.print("Digite um valor em hectares: ");

        double hectares = scanner.nextDouble();
        double metros = hectares * 1000;

        System.out.println("Seu valor em metros quadrados é: " + metros);

        scanner.close();
    }
}