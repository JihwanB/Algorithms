import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long n = getGCF(a, b);
        for (long i = 0; i < n; i++) {
            sb.append(1);
        }

        System.out.println(sb);

    }

    public static long getGCF(long a, long b) {
        if (b == 0)
            return a;
        return getGCF(b, a % b);
    }

}
