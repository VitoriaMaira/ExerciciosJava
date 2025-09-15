import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado A: ");
        double A=sc.nextDouble();

        System.out.print("Lado B: ");
        double B=sc.nextDouble();

        System.out.print("Lado C: ");
        double C=sc.nextDouble();

        if(A<B+C && B<A+C && C<A+B){
            if(A==B && B==C) System.out.println("Equilátero");
            else if(A==B || B==C || A==C) System.out.println("Isósceles");
            else System.out.println("Escaleno");
        } else System.out.println("Não é triângulo");
    }
}
