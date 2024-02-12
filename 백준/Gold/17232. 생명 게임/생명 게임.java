import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] getPrefixSum(char[][] goBoard) {

        int[][] acc = new int[goBoard.length][goBoard[0].length];

        for (int i = 1; i < goBoard.length; i++) {
            for (int j = 1; j < goBoard[0].length; j++) {
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + (goBoard[i][j] == '*' ? 1 : 0);
            }
        }

        return acc;
    }

    static int getNearLife(int[][] acc, int row, int column, int K) {

        int row1 = Math.max(row - K, 1);
        int column1 = Math.max(column - K, 1);
        int row2 = Math.min(row + K, acc.length - 1);
        int column2 = Math.min(column + K, acc[0].length - 1);

        return acc[row2][column2] - acc[row2][column1 - 1] - acc[row1 - 1][column2] + acc[row1 - 1][column1 - 1];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        char[][] goBoard = new char[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String state = br.readLine();
            for (int j = 1; j <= M; j++) {
                goBoard[i][j] = state.charAt(j - 1);
            }
        }

        while (T-- > 0) {
            int[][] acc = getPrefixSum(goBoard);
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    int nearLife = getNearLife(acc, i, j, K);
                    if (goBoard[i][j] == '*') {
                        nearLife--;
                        if (nearLife < a || b < nearLife)
                            goBoard[i][j] = '.';
                    } else if (a < nearLife && nearLife <= b) {
                        goBoard[i][j] = '*';
                    }
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                sb.append(goBoard[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

}
