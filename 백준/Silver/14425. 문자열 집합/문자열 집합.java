import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> setS = new ArrayList<>(N);
        List<String> toCheck = new ArrayList<>(M);

        for (int i = 0; i < N; i++) {
            setS.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            toCheck.add(br.readLine());
        }

        Collections.sort(setS);

        int count = 0;
        for (int i = 0; i < M; i++) {
            if (Collections.binarySearch(setS, toCheck.get(i)) >= 0) {
                count++;
            }
        }

        sb.append(count);
        System.out.println(sb);


    }

}
