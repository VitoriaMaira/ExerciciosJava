import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia um valor de volume em litros e apresente-o convertido em metros
        //cúbicos m3. A fórmula de conversão é: M = L / 1000 , sendo L o volume em
        //litros e M o volume em metros cúbicos.

        System.out.print("Digite um valor em litros: ");
        double litros = scanner.nextDouble();
        double metrosCubicos = litros /1000;

        System.out.println("Seu valor em metros cubicos é: " + metrosCubicos);


    }
}
