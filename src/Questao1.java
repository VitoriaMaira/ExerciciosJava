import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Leia um número inteiro e imprima o seu antecessor e o seu sucessor.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("Seu antecessor é: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));


    }
}