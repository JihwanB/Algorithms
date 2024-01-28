import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static class Queue {
        static int[] queue = new int[10000];
        static int begin = 0;
        static int end = 0;

        static void push(int n) {
            queue[end] = n;
            end++;
        }

        static void pop() {
            if (end == begin) {
                System.out.println(-1);
            } else {
                System.out.println(queue[begin++]);
            }
        }

        static void size() {
            System.out.println(end - begin);
        }

        static void empty() {
            System.out.println((begin == end) ? 1 : 0);
        }

        static void front() {
            System.out.println((begin == end) ? -1 : queue[begin]);
        }

        static void back() {
            System.out.println((begin == end) ? -1 : queue[end - 1]);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    Queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Queue.pop();
                    break;
                case "size":
                    Queue.size();
                    break;
                case "empty":
                    Queue.empty();
                    break;
                case "front":
                    Queue.front();
                    break;
                case "back":
                    Queue.back();
                    break;
            }
        }
    }
}
