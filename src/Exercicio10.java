import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        } else if (sexo == 'F') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo inválido.");
        }

        sc.close();
    }
}
