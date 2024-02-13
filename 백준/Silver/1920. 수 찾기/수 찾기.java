import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        List<Integer> nList = new ArrayList<>(N);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nList.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        List<Integer> mList = new ArrayList<>(M);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            mList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nList);

        for (int i = 0; i < M; i++) {
            if (Collections.binarySearch(nList, mList.get(i)) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);


    }

}
