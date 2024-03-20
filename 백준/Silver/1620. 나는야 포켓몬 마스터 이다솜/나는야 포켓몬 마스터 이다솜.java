import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> stringIntegerMap = new HashMap<>();
        Map<String, String> integerStringMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            stringIntegerMap.put(name, String.valueOf(i));
            integerStringMap.put(String.valueOf(i), name);
        }

        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            if(stringIntegerMap.get(question) != null)
                sb.append(stringIntegerMap.get(question)).append("\n");
            if(integerStringMap.get(question) != null)
                sb.append(integerStringMap.get(question)).append("\n");
        }

        System.out.println(sb);

    }

}
