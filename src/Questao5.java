import java.util.Scanner;

public class Questao5 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//Leia um ângulo em radianos e apresente-o convertido em graus. A fórmula
//de conversão é: G = R ∗ 180/π, sendo G o ângulo em graus é R em radianos
//e π = 3.14.

    System.out.print("Digite um valor em radianos: ");
    double radianos = scanner.nextDouble();
    double graus  = radianos * 180 / Math.PI;

    System.out.println("Seu valor em graus é: " + graus);




  }
}
