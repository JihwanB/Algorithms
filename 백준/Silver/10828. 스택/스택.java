import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String command;
        int data;
        while (N-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            switch (command) {
                case "push":
                    data = Integer.parseInt(st.nextToken());
                    stack.push(data);
                    break;
                case "pop":
                    if (!stack.empty()) {
                        sb.append(stack.pop()).append("\n");
                    } else
                        sb.append(-1).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.empty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "top":
                    if(stack.empty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(stack.peek()).append("\n");
                    break;
            }//switch

        }//while

        System.out.println(sb);

    }//main

}//class
