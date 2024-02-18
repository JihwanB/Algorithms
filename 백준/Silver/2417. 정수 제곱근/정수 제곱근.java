import java.io.*;

public class Main {

    static long findSqrt(long n) {

        long start = 0;
        long end = n;
        long ans = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            if (n <= Math.pow(mid, 2)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.println(findSqrt(n));
    }

}
