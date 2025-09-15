import java.util.Scanner;
import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("Ordem: " + nums[0] + ", " + nums[1] + ", " + nums[2]);

        sc.close();
    }
}
