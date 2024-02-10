import java.io.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] rope = new int[N];

        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max < rope[i] * (N - i)) {
                max = rope[i] * (N - i);
            }
        }

        bw.write(String.valueOf(max));
        bw.close();

    }

}
