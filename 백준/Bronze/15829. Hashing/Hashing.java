import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    static final BigInteger M = new BigInteger("1234567891");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        BigInteger hash = new BigInteger("0");
        BigInteger r = new BigInteger("31");

        for (int i = 0; i < L; i++) {
            hash = hash.add(BigInteger.valueOf(str.charAt(i) - 'a' + 1).multiply(r.pow(i)));
        }

        System.out.println(hash.remainder(M));

    }

}
