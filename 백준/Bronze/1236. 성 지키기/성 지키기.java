import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] castle = new char[N][M];
        for (int i = 0; i < N; i++) {
            castle[i] = sc.next().toCharArray();
        }

        int protectedRow = 0;
        for (int i = 0; i < N; i++) {
            boolean exists = false;
            for (int j = 0; j < M; j++) {
                if (castle[i][j] == 'X') {
                    exists = true;
                    break;
                }
            }
            if (exists) protectedRow++;
        }

        int protectedCol = 0;
        for (int i = 0; i < M; i++) {
            boolean exists = false;
            for (int j = 0; j < N; j++) {
                if (castle[j][i] == 'X') {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                protectedCol++;
            }
        }

        int neededRow = N - protectedRow;
        int neededCol = M - protectedCol;

        System.out.println(Math.max(neededRow, neededCol));
    }
}
