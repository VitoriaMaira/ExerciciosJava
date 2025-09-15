import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia um valor de volume em metros cúbicos m3 e apresente-o convertido em
        //litros. A fórmula de conversão é: L = 1000 ∗ M, sendo L o volume em litros e
        //M o volume em metros cúbicos.

        System.out.print("Digite um valor em metros cubicos: ");
        double metros = scanner.nextDouble();
        double litros = 1000 * metros;

        System.out.println("Seu valor em litros é: " + litros);


    }
}
