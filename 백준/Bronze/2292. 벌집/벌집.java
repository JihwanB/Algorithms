import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        if (N == 1) {
            System.out.print(1);
        } else {
            while (range <= N) {    // 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * count);
                count++;
            }
            System.out.print(count);
        }

    }

}