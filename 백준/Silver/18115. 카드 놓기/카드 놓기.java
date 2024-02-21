import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        String command = sb.append(br.readLine()).reverse().toString();
        StringTokenizer st = new StringTokenizer(command);

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            switch (num) {
                case 1:
                    deque.addFirst(i);
                    break;
                case 2:
                    if (!deque.isEmpty()) {
                        int tmp = deque.pollFirst();
                        deque.addFirst(i);
                        deque.addFirst(tmp);
                    }
                    break;
                case 3:
                    deque.addLast(i);
                    break;

            }//switch

        }//for

        sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.pollFirst()).append(" ");
        }

        System.out.println(sb);

    }//main

}//class
