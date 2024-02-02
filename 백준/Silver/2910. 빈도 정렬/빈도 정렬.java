import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> original = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            list.add(key);
            original.add(list.get(i));
            map.put(key, map.getOrDefault(key, 0) + 1);
        }


        Collections.sort(list, (o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
                return original.indexOf(o1) - original.indexOf(o2);
            } else {
                return Integer.compare(map.get(o2), map.get(o1));
            }

        });

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            bw.write(it.next() + " ");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
