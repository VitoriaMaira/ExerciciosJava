import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura (cm): ");
        int altura = sc.nextInt();

        System.out.print("Peso (kg): ");
        int peso = sc.nextInt();

        // Tabela
        String[][] tabela = {
                {"A", "D", "G"},
                {"B", "E", "H"},
                {"C", "F", "I"}
        };

        int linha, coluna;

        if (altura < 120) linha = 0;
        else if (altura <= 170) linha = 1;
        else linha = 2;

        if (peso < 60) coluna = 0;
        else if (peso <= 90) coluna = 1;
        else coluna = 2;

        System.out.println("Classificação: " + tabela[linha][coluna]);
        sc.close();
    }
}
