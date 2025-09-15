public class Questao6 {
    public static void main(String[] args) {

        // 6. A importância de R$780.000,00 será dividida entre três ganhadores de um concurso.
        // O primeiro ganhador receberá 46%; o segundo 32%; o terceiro o restante.

        double total = 780000.0;

        double primeiro = total * 0.46;
        double segundo = total * 0.32;
        double terceiro = total - primeiro - segundo;

        System.out.println("Primeiro ganhador: R$" + primeiro);
        System.out.println("Segundo ganhador: R$" + segundo);
        System.out.println("Terceiro ganhador: R$" + terceiro);
    }
}
