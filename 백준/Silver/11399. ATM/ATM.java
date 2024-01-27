import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] P = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // counting sort
        while (N-- > 0) {
            P[Integer.parseInt(st.nextToken())]++;
        }

        int sum = 0;
        int prev = 0;

        for (int i = 0; i < 1001; i++) {
            while (P[i]-- > 0) {
                sum += (i + prev);
                prev += i;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
