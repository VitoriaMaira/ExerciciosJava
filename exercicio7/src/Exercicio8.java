import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base maior (>0): ");
        double B = sc.nextDouble();
        System.out.print("Base menor (>0): ");
        double b = sc.nextDouble();
        System.out.print("Altura (>0): ");
        double h = sc.nextDouble();

        if(B <= 0 || b <= 0 || h <= 0) System.out.println("Valores inválidos");
        else System.out.println("Área: " + (B+b)*h/2);
    }
}
