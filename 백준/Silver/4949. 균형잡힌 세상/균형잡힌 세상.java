import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack;

        while (true) {
            String sentence = br.readLine();
            if (sentence.equals("."))
                break;

            sentence = sentence.substring(0, sentence.length() - 1);
            sb.append(buildString(sentence)).append("\n");
        }

        System.out.println(sb);

    }

    private static String buildString(String sentence) {
        Stack<Character> stack = new Stack<>();

        for (char c : sentence.toCharArray()) {
            if (c == '(' || c == '[')
                stack.push(c);
            else if (c == ')')
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else
                    stack.pop();
            else if (c == ']')
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else
                    stack.pop();
        }
        if (stack.empty())
            return "yes";
        else
            return "no";
    }

}