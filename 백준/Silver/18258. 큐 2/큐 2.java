import java.io.*;
import java.util.*;

public class Main {
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.remove() + "\n");
                    }
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.getFirst() + "\n");
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.getLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
