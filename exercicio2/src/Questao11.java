import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //11. Leia um valor de massa em libras e apresente-o convertido em quilogramas.
        //A fórmula de conversão é: K = L ∗ 0, 45, sendo K a massa em quilogramas e
        //L a massa em libras.

        System.out.print("Digite um valor de massa em libras: ");

        double libras = scanner.nextDouble();
        double quilogramas = libras * 0.45;
        System.out.println("Seu valor em quilogramas é:" + quilogramas);




    }
}