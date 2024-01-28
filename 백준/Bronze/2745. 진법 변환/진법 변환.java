import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        long result = 0;
        int index = 0;
        int num = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            if (c >= '0' && c <= '9') {
                num = c - '0';
            } else {
                num = c - 55;
            }
            result += (long) (num * Math.pow(B, index++));
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
