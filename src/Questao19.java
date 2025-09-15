import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //19.Leia quatro notas, calcule a média aritmética e imprima o resultado.

        System.out.print("Digite a nota um: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota dois: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota tres: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota quatro: ");
        double nota4 = scanner.nextDouble();

        double resultado = (nota1 + nota2 + nota3 + nota4) /4 ;

        System.out.println("Sua média é: " + resultado);

        scanner.close();




    }
}
