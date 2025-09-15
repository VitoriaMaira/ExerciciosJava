import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10. Receba o salário-base de um funcionário.
        // Calcule o salário a receber, com gratificação de 5% e desconto de 7% de imposto.

        System.out.print("Salário-base: ");
        double salarioBase = scanner.nextDouble();

        double salarioFinal = salarioBase + (salarioBase * 0.05) - (salarioBase * 0.07);
        System.out.println("Salário a receber: R$" + salarioFinal);

        scanner.close();
    }
}
