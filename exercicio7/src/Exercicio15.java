import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano: "); int ano=sc.nextInt();

        if(ano%400==0 || (ano%4==0 && ano%100!=0))
            System.out.println("Bissexto");
        else
            System.out.println("Não bissexto");
    }
}
