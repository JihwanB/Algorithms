import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String nextMove = br.readLine();
        if (nextMove == null) nextMove = "";

        boolean[][] verticalVisited = new boolean[N][N];
        boolean[][] horizontalVisited = new boolean[N][N];
        int r = 0, c = 0;

        for (int i = 0; i < nextMove.length(); i++) {
            char move = nextMove.charAt(i);
            if (move == 'D') {
                if (r == N - 1) continue;
                verticalVisited[r][c] = true;
                verticalVisited[r + 1][c] = true;
                r++;
            } else if (move == 'U') {
                if (r == 0) continue;
                verticalVisited[r][c] = true;
                verticalVisited[r - 1][c] = true;
                r--;
            } else if (move == 'L') {
                if (c == 0) continue;
                horizontalVisited[r][c] = true;
                horizontalVisited[r][c - 1] = true;
                c--;
            } else {
                if (c == N - 1) continue;
                horizontalVisited[r][c] = true;
                horizontalVisited[r][c + 1] = true;
                c++;
            }
        }


        for (int i = 0; i < N; i++) {
            String ans = "";
            for (int j = 0; j < N; j++) {
                if (verticalVisited[i][j] && horizontalVisited[i][j]) ans += '+';
                else if (verticalVisited[i][j]) ans += '|';
                else if (horizontalVisited[i][j]) ans += '-';
                else ans += '.';
            }
            bw.write(ans + "\n");
        }
        bw.flush();
    }
}