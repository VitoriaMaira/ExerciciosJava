import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância percorrida (km): ");
        double km = scanner.nextDouble();

        System.out.print("Litros consumidos: ");
        double litros = scanner.nextDouble();

        double consumo = km / litros;
        System.out.printf("Consumo: %.2f Km/l - ", consumo);

        if (consumo < 8) {
            System.out.println("Venda o carro!");
        } else if (consumo <= 14) {
            System.out.println("Econômico!");
        } else {
            System.out.println("Super econômico!");
        }

        scanner.close();
    }
}
