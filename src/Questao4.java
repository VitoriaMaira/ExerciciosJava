import java.util.Scanner;

public class Questao4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia um ângulo em graus e apresente-o convertido em radianos. A fórmula
        //de conversão é: R = G ∗ π/180, sendo G o ângulo em graus é R em radianos
        //e π = 3.14.

        System.out.print("Digite um valor em graus: ");
        double graus = scanner.nextDouble();
        double radioanos = graus * Math.PI / 180;

        System.out.println("Seu valor em radianos é: " + radioanos);



        scanner.close();
    }
}
