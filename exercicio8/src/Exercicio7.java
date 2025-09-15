import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço antigo: ");
        double preco = sc.nextDouble();

        double aumento = 0;
        if (preco <= 50) aumento = 0.05;
        else if (preco <= 100) aumento = 0.10;
        else aumento = 0.15;

        double novo = preco + (preco * aumento);
        System.out.println("Preço novo: " + novo);

        sc.close();
    }
}
