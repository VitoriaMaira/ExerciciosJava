import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: "); int idade=sc.nextInt();
        System.out.print("Tempo serviço: "); int t=sc.nextInt();

        if(idade>=65 || t>=30 || (idade>=60 && t>=25)) System.out.println("Pode se aposentar");
        else System.out.println("Não pode se aposentar");
    }
}
