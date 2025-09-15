import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia uma distância em milhas e apresente-a convertida em quilômetros. A
        //fórmula de conversão é: K = 1, 61 ∗ M, sendo K a distância em quilômetros é
        //M em milhas.

        System.out.println("Digite um valor em milhas: ");
        double milhas = scanner.nextDouble();
        double quilometros = 1.61 * milhas;

        System.out.println("Seu valor em quilometros é: " + quilometros);











        scanner.close();
    }
}
