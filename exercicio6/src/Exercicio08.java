import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        if ((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10)) {
            double media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nota(s) inválida(s). Programa encerrado.");
        }

        sc.close();
    }
}
