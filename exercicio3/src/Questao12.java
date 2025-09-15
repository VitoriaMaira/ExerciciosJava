import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 12. Receba a altura do degrau e a altura que o usuário deseja alcançar.
        // Calcule e mostre quantos degraus o usuário deverá subir.

        System.out.print("Altura do degrau (em metros): ");
        double alturaDegrau = scanner.nextDouble();

        System.out.print("Altura desejada (em metros): ");
        double alturaDesejada = scanner.nextDouble();

        int degraus = (int) Math.ceil(alturaDesejada / alturaDegrau);
        System.out.println("Você deverá subir " + degraus + " degraus.");

        scanner.close();
    }
}
