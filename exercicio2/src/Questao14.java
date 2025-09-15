
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //14. Leia um valor de área em metros quadrados m
        //2 e apresente-o convertido em
        //acres. A fórmula de conversão é: A = M ∗ 0, 000247, sendo M a área em
        //metros quadrados é A a área em acres.

        System.out.print("Digite um valor em metros quadrados: ");

        double metros = scanner.nextDouble();
        double acres = metros * 0.000247;

        System.out.println("Seu valor em acres é:" + acres);

        scanner.close();

    }
}