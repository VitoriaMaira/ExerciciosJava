import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        int cod = sc.nextInt();

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        double preco;
        switch (cod) {
            case 100: preco = 1.20; break;
            case 101: preco = 1.30; break;
            case 102: preco = 1.50; break;
            case 103: preco = 1.20; break;
            case 104: preco = 1.70; break;
            case 105: preco = 2.20; break;
            case 106: preco = 1.00; break;
            default:
                System.out.println("Código inválido!");
                return;
        }

        System.out.println("Total: " + (preco * qtd));
        sc.close();
    }
}
