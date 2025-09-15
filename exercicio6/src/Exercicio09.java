import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = sc.nextDouble();

        if (prestacao > salario * 0.2) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

        sc.close();
    }
}
