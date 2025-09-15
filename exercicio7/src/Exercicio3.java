import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota um: ");
        double notaUm = scanner.nextDouble();

        System.out.print("Digite a nota dois: ");
        double notaDois = scanner.nextDouble();

        System.out.print("Digite a nota tres: ");
        double notaTres = scanner.nextDouble();

        double media = (notaUm + notaDois + 2 * notaTres)/4;
        System.out.println("A media do aluno é: " + media);

        if (media>=60) {
            System.out.println("Voce esta aprovado! ;) ");
        }

        else  {
            System.out.println("Voce esta reprovado :(");
        }
    }
}


