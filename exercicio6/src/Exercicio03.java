import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = sc.nextDouble();

        if (numero >= 0) {
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        } else {
            System.out.println("Ao quadrado: " + Math.pow(numero, 2));
        }

        sc.close();
    }
}
