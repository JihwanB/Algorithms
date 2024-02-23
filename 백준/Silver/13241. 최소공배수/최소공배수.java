import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println(getLCM(a, b));

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
