import java.util.Scanner;


public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //16. Leia um valor de área em metros quadrados m2 e apresente-o convertido em
        //hectares. A formula de conversaõ é: H = M ∗ 0, 0001, sendo M a area em
        //metros quadrados é H a area em hectares.

        System.out.print("Digite um valor em metros quadrados: ");

        double metros = scanner.nextDouble();
        double hectares = metros * 0.0001;

        System.out.println("Seu valor em hectares é: " + hectares);

        scanner.close();
    }
}