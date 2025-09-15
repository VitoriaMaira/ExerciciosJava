import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //13.Leia um valor de comprimento em metros e apresente-o convertido em
        //jardas. A fórmula de conversão é: J = M / 0,91 , sendo J o comprimento em
        //jardas e M o comprimento em metros.

        System.out.print("Digite um valor em metros: ");

        double metros = scanner.nextDouble();
        double jardas = metros / 0.91;

        System.out.println("Seu valor e, jardas é:" + jardas);




    }
}