import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //18.Faça a leitura de três valores e apresente como resultado a soma dos
        //quadrados dos três valores lidos.

        System.out.print("Digite o valor um: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o valor dois: ");

        double numero2 = scanner.nextDouble();

        System.out.print("Digite o valor tres: ");
        double numero3 = scanner.nextDouble();

        double resultado = (numero1 * numero1) + (numero2 * numero2)
                + (numero3 * numero3);

        System.out.println("A soma do quadrado dos valores é: " + resultado );



    }
}