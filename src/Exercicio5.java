import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Trabalho Lab (0-10): ");
        double t = scanner.nextDouble();
        System.out.print("Avaliação Semestral (0-10): ");
        double a = scanner.nextDouble();
        System.out.print("Exame Final (0-10): ");
        double e = scanner.nextDouble();

        if (t < 0 || t > 10 || a < 0 || a > 10 || e < 0 || e > 10) {
            System.out.println("Nota inválida");
        } else {
            double media = (t*2 + a*3 + e*5)/10;
            System.out.println("Média: " + media);
            if(media < 3) System.out.println("Reprovado");
            else if(media < 5) System.out.println("Recuperação");
            else System.out.println("Aprovado");
        }
    }
}
