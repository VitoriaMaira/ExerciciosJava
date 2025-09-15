import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o estado (MG, SP, RJ, MS): ");
        String estado = scanner.next().toUpperCase();

        double imposto = 0;
        switch (estado) {
            case "MG":
                imposto = 0.07;
                break;
            case "SP":
                imposto = 0.12;
                break;
            case "RJ":
                imposto = 0.15;
                break;
            case "MS":
                imposto = 0.08;
                break;
            default:
                System.out.println("Estado inválido!");
                scanner.close();
                return;
        }

        double precoFinal = valor + (valor * imposto);
        System.out.printf("Preço final: R$ %.2f%n", precoFinal);
        scanner.close();
    }
}


