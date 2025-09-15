import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();

        if((n%3==0 && n%5!=0) || (n%3!=0 && n%5==0))
            System.out.println("Divisível por 3 ou 5, mas não ambos");
        else
            System.out.println("Não atende à condição");
    }
}
