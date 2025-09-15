import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 11. Escreva um programa de ajuda para vendedores.
        // A partir de um valor total lido, mostre:
        // a) total com 10% de desconto
        // b) valor de cada parcela em 3x sem juros
        // c) comissão à vista (5% do valor com desconto)
        // d) comissão parcelada (5% do valor total)

        System.out.print("Valor total da venda: ");
        double valor = scanner.nextDouble();

        double valorComDesconto = valor * 0.90;
        double parcela = valor / 3;
        double comissaoVista = valorComDesconto * 0.05;
        double comissaoParcelada = valor * 0.05;

        System.out.println("À vista (com 10% de desconto): R$" + valorComDesconto);
        System.out.println("Parcelado em 3x de R$" + parcela);
        System.out.println("Comissão à vista: R$" + comissaoVista);
        System.out.println("Comissão parcelada: R$" + comissaoParcelada);

        scanner.close();
    }
}
