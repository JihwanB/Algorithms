import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        BigInteger A = new BigInteger("1");
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A = A.multiply(new BigInteger(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        BigInteger B = new BigInteger("1");
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B = B.multiply(new BigInteger(st.nextToken()));
        }

        String ans = A.gcd(B).toString();
        if (ans.length() >= 9)
            System.out.println(ans.substring(ans.length() - 9));
        else
            System.out.println(ans);

    }

}
