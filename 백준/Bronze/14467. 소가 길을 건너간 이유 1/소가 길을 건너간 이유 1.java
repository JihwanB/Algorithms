import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cows = new int[10];
        int moveCount = 0;

        for (int i = 0; i < 10; i++) {
            cows[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cowNum = Integer.parseInt(st.nextToken());
            int cowPos = Integer.parseInt(st.nextToken());

            if (cows[cowNum - 1] == 0 && cowPos == 1) {
                cows[cowNum - 1] = cowPos;
                moveCount++;
            } else if (cows[cowNum - 1] == 1 && cowPos == 0) {
                cows[cowNum - 1] = cowPos;
                moveCount++;
            } else
                cows[cowNum - 1] = cowPos;
        }
        bw.write(Integer.toString(moveCount));
        bw.flush();
    }
}
