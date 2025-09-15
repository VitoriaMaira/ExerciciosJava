import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia uma distância em quilômetros e apresente-a convertida em milhas. A
        //fórmula de conversão é: M = K 1,61 , sendo K a distância em quilômetros é
        //M em milhas.

        System.out.println("Digite um valor em quilometros: ");
        double quilometros = scanner.nextDouble();
        double milhas = quilometros * 1.61 ;
        System.out.println("Seu valor em milha é: " + milhas);





        scanner.close();
    }
}
