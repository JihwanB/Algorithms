import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] sumCount = new int[(s1 + s2 + s3) - 2];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    int sum = i + j + k;
                    sumCount[sum - 3]++;
                }
            }
        }

        int max = 0;
        int ans = 0;

        for (int i = 0; i < sumCount.length; i++) {
            if (max < sumCount[i]) {
                max = sumCount[i];
                ans = i + 3;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
    }
}
