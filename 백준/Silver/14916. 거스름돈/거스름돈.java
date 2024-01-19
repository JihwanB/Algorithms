import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int coins = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                coins += n / 5;
                break;
            } else {
                n -= 2;
                coins++;
            }
        }
        if (n < 0) {
            System.out.println(-1);
        } else {
            System.out.println(coins);
        }
    }
}