import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 8. Uma empresa contrata um encanador a R$30,00 por dia.
        // Leia o número de dias trabalhados e calcule a quantia líquida (com desconto de 8% de IR).

        System.out.print("Dias trabalhados: ");
        int dias = scanner.nextInt();

        double bruto = dias * 30.0;
        double liquido = bruto * 0.92;

        System.out.println("Pagamento líquido: R$" + liquido);

        scanner.close();
    }
}
