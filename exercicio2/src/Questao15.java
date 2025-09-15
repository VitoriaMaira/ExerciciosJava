import java.util.Scanner;


public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //15. Leia um valor de área em acres e apresente-o convertido em metros
        //quadrados m2
        //. A fórmula de conversão é: M = A ∗ 4048,58 sendo M a área
        //em metros quadrados é A a área em acres.

        System.out.print("Digite um valor em acres: ");

        double acres = scanner.nextDouble();
        double metros = acres * 4048.58;

        System.out.println("Seu valor em acres é: " + acres);

        scanner.close();
    }
}
