import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == -1)
                break;
            if (num == 0 && !queue.isEmpty())
                queue.poll();
            else {
                if (!(queue.size() >= N))
                    queue.add(num);
            }
        }

        if (queue.isEmpty()) {
            System.out.println("empty");
            return;
        }

        Iterator<Integer> iter = queue.iterator();
        while (iter.hasNext()) {
            sb.append(iter.next()).append(" ");
        }

        System.out.println(sb);

    }

}
