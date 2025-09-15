import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Leia um valor de comprimento em centímetros e apresente-o convertido em
        polegadas. A fórmula de conversão é: P = C 2,54 , sendo C o comprimento
        em centímetros e P o comprimento em polegadas.*/

        System.out.print("Digite um valor em centimetros: ");
        double centimetros = scanner.nextDouble();
        double polegadas = centimetros / 2.54;

        System.out.println("Seu valor em polegadas é: " + polegadas);
        //formula errada na questao




    }
}