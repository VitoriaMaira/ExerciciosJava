import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int inteiro = scanner.nextInt();

        if (inteiro < 0 ){
            System.out.println("Número inválido");
        } else {
            double log = Math.log(inteiro);
            System.out.println("Logaritmo natural do número: " + log);
        }

    }
}