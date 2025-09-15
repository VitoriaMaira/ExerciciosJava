import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4. Leia o valor de um produto e imprima o valor com desconto, tendo em vista que o desconto foi de 12%.

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        double valorComDesconto = valor * 0.88;
        System.out.println("Valor com desconto: R$" + valorComDesconto);

        scanner.close();
    }
}
