import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cows = new int[10];
        int moveCount = 0;

        for (int i = 0; i < 10; i++) {
            cows[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            int cowNum = sc.nextInt();
            int cowPos = sc.nextInt();

            if (cows[cowNum - 1] == 0 && cowPos == 1) {
                cows[cowNum - 1] = cowPos;
                moveCount++;
            } else if (cows[cowNum - 1] == 1 && cowPos == 0) {
                cows[cowNum - 1] = cowPos;
                moveCount++;
            } else
                cows[cowNum - 1] = cowPos;
        }
        System.out.println(moveCount);
    }
}
