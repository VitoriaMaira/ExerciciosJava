public class Questao7 {
    public static void main(String[] args) {

        // 7. Calcule e imprima a quantia ganha por cada um dos ganhadores.

        double total = 780000.0;

        double primeiro = total * 0.46;
        double segundo = total * 0.32;
        double terceiro = total - primeiro - segundo;

        System.out.println("Primeiro ganhador: R$" + primeiro);
        System.out.println("Segundo ganhador: R$" + segundo);
        System.out.println("Terceiro ganhador: R$" + terceiro);
    }
}
