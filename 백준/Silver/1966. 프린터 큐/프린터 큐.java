import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int T;
    static int N;
    static int M;
    static Queue<Integer> queue;
    static Queue<Integer> order;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            queue = new LinkedList<>();
            order = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.offer(Integer.parseInt(st.nextToken()));
                order.offer(i);
            }
            getCount();
        }

        System.out.println(sb);

    }

    private static void getCount() {
        int count = 1;

        while (!queue.isEmpty()) {
            int max = Collections.max(queue);
            int document = queue.poll();
            int idx = order.poll();

            if (document == max) {
                if (idx == M) {
                    sb.append(count).append("\n");
                    break;
                }
                count++;
            } else {
                queue.offer(document);
                order.offer(idx);
            }
        }
    }

}
