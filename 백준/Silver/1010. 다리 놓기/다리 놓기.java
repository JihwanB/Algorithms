import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] dp;

    public static void makeDP(int N, int M) {

        dp = new int[N + 1][M + 1];
        dp[1][1] = 1;

        for (int i = 1; i <= M; i++) {
            dp[1][i] = i;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= M; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (j > i) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            makeDP(N, M);
            bw.write(dp[N][M] + "\n");
            bw.flush();
        }
        bw.close();
    }

}
