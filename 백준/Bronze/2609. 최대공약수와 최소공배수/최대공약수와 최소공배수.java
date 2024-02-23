import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(getGCF(a, b)).append("\n");
        sb.append(getLCM(a, b));

        System.out.println(sb);

    }

    public static int getGCF(int a, int b) {
        if (b == 0)
            return a;
        return getGCF(b, a % b);
    }

    public static int getLCM(int a, int b) {
        return a * b / getGCF(a, b);
    }

}
