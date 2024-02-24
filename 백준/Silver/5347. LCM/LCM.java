import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long ans = getLCM(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
            sb.append(ans).append("\n");
        }

        System.out.println(sb);

    }

    public static long getGCF(long a, long b) {
        if (b == 0)
            return a;
        return getGCF(b, a % b);
    }

    public static long getLCM(long a, long b) {
        return a * b / getGCF(a, b);
    }

}
