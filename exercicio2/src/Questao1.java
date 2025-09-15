import java.util.Scanner;

public class Questao1 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida
        //em km/h (quilômetros por hora). A fórmula de conversão é: K = M ∗ 3.6,
        //sendo K a velocidade em km/h e M em m/s.

        System.out.println("Digite uma velocidade em metros por segundo (m/s)): ");
        double metrosPorSegundo= scanner.nextDouble();

        double kmPorHora = metrosPorSegundo * 3.6;
        System.out.println("A velocidade é: " + kmPorHora );







        scanner.close();


    }

}
