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
        StringTokenizer st;

        List<Integer> a;
        List<Integer> b;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            a = new ArrayList<>(N);
            b = new ArrayList<>(M);

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                a.add(i, Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                b.add(i, Integer.parseInt(st.nextToken()));
            }

            Collections.sort(a);
            Collections.sort(b);

            int aIndex = a.size() - 1;
            int bIndex = b.size() - 1;
            int count = 0;
            while (aIndex >= 0 && bIndex >= 0) {

                if (a.get(aIndex) > b.get(bIndex)) {
                    count += bIndex + 1;
                    aIndex--;
                } else if (a.get(aIndex) <= b.get(bIndex)) {
                    bIndex--;
                }

            }

            System.out.println(count);


        } // while block

    } // main block

} // class block
