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

        int N = Integer.parseInt(br.readLine());
        List<Integer> list;
        List<Integer> gcf;
        int max;

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list = new ArrayList<>();
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            gcf = new ArrayList<>();
            for (int j = 0; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    gcf.add(getGCF(list.get(j), list.get(k)));
                }
            }

            Collections.sort(gcf);

            max = gcf.get(gcf.size() - 1);

            sb.append(max).append("\n");
        }//for

        System.out.println(sb);

    }//main

    public static int getGCF(int a, int b) {
        if (b == 0)
            return a;
        return getGCF(b, a % b);
    }

}
