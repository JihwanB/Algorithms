import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int key : sorted) {
            if (!map.containsKey(key)) {
                map.put(key, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            int ranking = map.get(key);
            sb.append(ranking).append(" ");
        }
        System.out.println(sb);
    }
}