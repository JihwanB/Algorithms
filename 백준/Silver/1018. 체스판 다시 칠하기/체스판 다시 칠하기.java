import java.util.Scanner;

public class Main {
    public static int countDiff(char[][] chess, int startRow, int startColumn, String pattern){
        int cnt = 0;
        for (int i = startRow; i < startRow + 8; i++)
            for (int j = startColumn; j < startColumn + 8; j++)
                if (chess[i][j] != pattern.charAt((i + j) % 2))
                    cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] chess = new char[N][M];

        for(int i = 0; i < N; i++) {
            String line = sc.next();
            chess[i] = line.toCharArray();
        }

        int ans = N * M;
        for (int i = 0; i <= N - 8; i++)
            for (int j = 0; j <= M - 8; j++) {
                int countBW = countDiff(chess, i, j, "BW");
                int countWB = countDiff(chess, i, j,"WB");
                ans = Math.min(ans, Math.min(countBW, countWB));
            }
        System.out.println(ans);
    }
}
