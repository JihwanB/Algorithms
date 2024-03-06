import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] cables = new long[K];

        long max = 0;
        for (int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
            if (cables[i] > max)
                max = cables[i];
        }


        max += 1;
        long min = 0;
        long mid = 0;

        while (min < max) {

            mid = (min + max) / 2;
            long count = 0;

            for (long l : cables) {
                count += (l / mid);
            }

            if (count < N)
                max = mid;
            else
                min = mid + 1;
        }

        System.out.println(min - 1);

    }

}
