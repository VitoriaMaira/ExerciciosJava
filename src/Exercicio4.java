

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota Trabalho Laboratório (0-10): ");
        double tLab = scanner.nextDouble();
        System.out.print("Nota Avaliação Semestral (0-10): ");
        double aSem = scanner.nextDouble();
        System.out.print("Nota Exame Final (0-10): ");
        double exame = scanner.nextDouble();

        if (tLab < 0 || tLab > 10 || aSem < 0 || aSem > 10 || exame < 0 || exame > 10) {
            System.out.println("Nota inválida");
        } else {
            double media = (tLab * 2 + aSem * 3 + exame * 5) / 10;
            System.out.println("Média final: " + media);

            if (media < 3) {
                System.out.println("Reprovado");
            } else if (media < 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Aprovado");
            }
        }
    }
}

