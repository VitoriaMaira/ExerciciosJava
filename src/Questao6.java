import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia um valor de comprimento em polegadas e apresente-o convertido em
        //centímetros. A fórmula de conversão é: C = P ∗ 2, 54, sendo C o
        //comprimento em centımetros e P o comprimento em polegadas.

        System.out.print("Digite um valor em polegadas: ");
        double polegadas = scanner.nextDouble();
        double centimetros = polegadas * 2.54;

        System.out.println("Seu valor em centimetros é: " + centimetros);

    }
}
