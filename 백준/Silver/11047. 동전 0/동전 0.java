import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }

        coins.sort(((o1, o2) -> o2 - o1));

        int coinNum = 0;
        while (K != 0) {
            for (int i = 0; i < coins.size(); i++) {
                if ((K / coins.get(i)) >= 1) {
                    coinNum += (K / coins.get(i));
                    K -= (K / coins.get(i)) * coins.get(i);
                }
            }
        }

        System.out.println(coinNum);

    }

}
