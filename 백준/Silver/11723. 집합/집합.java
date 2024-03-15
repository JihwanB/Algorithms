import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String command = st.nextToken();
            int x = 0;
            if (st.hasMoreTokens())
                x = Integer.parseInt(st.nextToken());

            setOperations(set, command, x);

        }

        System.out.println(sb);

    }

    public static void setOperations(Set<Integer> set, String command, int x) {

        switch (command) {
            case "add":
                if (set.contains(x))
                    return;
                else {
                    set.add(x);
                    break;
                }
            case "remove":
                if (!set.contains(x))
                    return;
                else {
                    set.remove(x);
                    break;
                }
            case "check":
                if (set.contains(x))
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
                break;
            case "toggle":
                if (set.contains(x))
                    set.remove(x);
                else
                    set.add(x);
                break;
            case "all":
                set.clear();
                for (int i = 1; i <= 20; i++)
                    set.add(i);
                break;
            case "empty":
                set.clear();
                break;
        }
    }

}
