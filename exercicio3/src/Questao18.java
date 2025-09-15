import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 18. Faça um programa para ler o horário (hora, minuto e segundo) de início
        // e a duração, em segundos, de uma experiência biológica.
        // O programa deve resultar com o novo horário (hora, minuto e segundo) do término da mesma.

        System.out.print("Hora de início: ");
        int hora = scanner.nextInt();
        System.out.print("Minuto de início: ");
        int minuto = scanner.nextInt();
        System.out.print("Segundo de início: ");
        int segundo = scanner.nextInt();

        System.out.print("Duração da experiência (em segundos): ");
        int duracao = scanner.nextInt();

        int totalSegundosInicio = hora * 3600 + minuto * 60 + segundo;
        int totalSegundosFim = totalSegundosInicio + duracao;

        int horaFim = (totalSegundosFim / 3600) % 24;
        int minutoFim = (totalSegundosFim % 3600) / 60;
        int segundoFim = totalSegundosFim % 60;

        System.out.printf("Horário de término: %02d:%02d:%02d\n", horaFim, minutoFim, segundoFim);

        scanner.close();
    }
}
