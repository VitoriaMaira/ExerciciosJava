import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5. Leia o salário de um funcionário. Calcule e imprima o valor do novo salário, sabendo que ele recebeu um aumento de 25%.

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.25;
        System.out.println("Novo salário: R$" + novoSalario);

        scanner.close();
    }
}
