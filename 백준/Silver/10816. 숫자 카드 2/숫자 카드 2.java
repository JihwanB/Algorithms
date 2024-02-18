import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> nMap = new HashMap<>(N);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            nMap.put(key, nMap.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        List<Integer> mList = new ArrayList<>(M);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            mList.add(Integer.parseInt(st.nextToken()));
        }

        ListIterator iter = mList.listIterator();
        while (iter.hasNext()) {
            int key = (int) iter.next();
            if (nMap.get(key) != null) {
                if (nMap.get(key) > 0) {
                    sb.append(nMap.get(key)).append(" ");
                } else if (nMap.get(key) == 0) {
                    sb.append(0).append(" ");
                }
            } else{
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

    }

}
