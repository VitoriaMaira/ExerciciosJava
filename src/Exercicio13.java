import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Soma 2-Diferença 3-Produto 4-Divisão");
        System.out.print("Escolha: "); int op=sc.nextInt();
        System.out.print("Valor 1: "); double a=sc.nextDouble();
        System.out.print("Valor 2: "); double b=sc.nextDouble();

        switch(op){
            case 1: System.out.println("Soma: "+(a+b)); break;
            case 2: System.out.println("Diferença: "+(Math.max(a,b)-Math.min(a,b))); break;
            case 3: System.out.println("Produto: "+(a*b)); break;
            case 4:
                if(b!=0) System.out.println("Divisão: "+(a/b));
                else System.out.println("Divisão por zero não permitida");
                break;
            default: System.out.println("Opção inválida");
        }
    }
}
