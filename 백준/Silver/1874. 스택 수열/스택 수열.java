import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> stack = new Stack<>();
    static int num = 1;

    static void pushStack(int x) {
        while (num <= x) {
            stack.push(num++);
            sb.append("+\n");
        }
    }

    static void popStack(int x) {
        if (stack.peek() < x) {
            System.out.println("NO");
            System.exit(0);
        }
        stack.pop();
        sb.append("-\n");
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            pushStack(x);
            popStack(x);
        }

        System.out.println(sb);

    }

}
