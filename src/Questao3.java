import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3. Leia o tamanho do lado de um quadrado e imprima como resultado a sua área.

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);

        scanner.close();
    }
}
