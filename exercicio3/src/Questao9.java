import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 9. Leia o valor da hora de trabalho (em reais) e o número de horas trabalhadas no mês.
        // Imprima o valor a ser pago ao funcionário, com 10% de adicional.

        System.out.print("Valor da hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horas = scanner.nextInt();

        double salario = valorHora * horas * 1.10;

        System.out.println("Salário com adicional: R$" + salario);

        scanner.close();
    }
}
