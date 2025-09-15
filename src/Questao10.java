import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Leia um valor de massa em quilogramas e apresente-o convertido em libras.
        //A fórmula de conversão é: L = K / 0,45 , sendo K a massa em quilogramas e
        //L a massa em libras.

        System.out.print("Digite um valor em quilogramas:");

        double quilogramas = scanner.nextDouble();
        double libras = quilogramas / 0.45 ;
        System.out.println("Seu valor em libras é: " + libras);


    }
}