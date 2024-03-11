import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            String command = br.readLine();
            int numberCnt = Integer.parseInt(br.readLine());
            String numbs = br.readLine();
            numbs = numbs.substring(1, numbs.length() - 1);

            StringTokenizer st = new StringTokenizer(numbs, ",");
            Deque<Integer> deque = new ArrayDeque<>(numberCnt);

            while (st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            solve(command, deque);

        }

        System.out.println(sb);

    }

    public static void solve(String command, Deque<Integer> deque) {
        boolean isForwards = true;

        for (char c : command.toCharArray()) {

            if (c == 'R') {
                isForwards = !isForwards;
                continue;
            }

            if (isForwards) {
                if (deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }
            } else {
                if (deque.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }

        buildString(deque, isForwards);

    }

    public static void buildString(Deque<Integer> deque, boolean isForwards) {

        sb.append("[");
        if (!deque.isEmpty()) {

            if (isForwards) {
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollLast());
                }
            }

        }

        sb.append("]").append("\n");

    }

}
