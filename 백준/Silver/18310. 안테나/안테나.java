import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] house = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            house[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(house);
        int position;
        if (N % 2 == 0) {
            position = (N / 2) - 1;
        } else {
            position = N / 2;
        }
        bw.write(String.valueOf(house[position]));
        bw.flush();
    }

}
