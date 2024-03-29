import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] trees = new int[N];

        st = new StringTokenizer(br.readLine());

        int max = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max)
                max = trees[i];
        }

        int min = 0;
        while (min < max) {

            int mid = (min + max) / 2;
            long length = 0;

            for (int i = 0; i < trees.length; i++) {
                if (trees[i] - mid > 0)
                    length += (trees[i] - mid);
            }

            if (length < M)
                max = mid;
            else
                min = mid + 1;

        }

        System.out.println(min - 1);

    }

}
