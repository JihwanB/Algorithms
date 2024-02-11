import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] ceiling = new int[H + 2];
        int[] floor = new int[H + 2];

        for (int i = 0; i < N / 2; i++) {
            floor[Integer.parseInt(br.readLine())]++;
            ceiling[H - Integer.parseInt(br.readLine()) + 1]++;
        }

        // 누적합 값 갱신
        for (int i = 1; i <= H; i++) {
            floor[i] = floor[i] + floor[i - 1];
        }

        // 누적합 값 갱신
        for (int i = H; i >= 1; i--) {
            ceiling[i] = ceiling[i] + ceiling[i + 1];
        }

        int min = N;
        int count = 0;
        for (int i = 1; i <= H; i++) {
            // 1번째 구간부터 차례로 장애물의 수 구하기
            int obstacle = (floor[H] - floor[i - 1]) + (ceiling[1] - ceiling[i + 1]);

            // 새로운 min 을 발견할 때 마다 갱신하고, count 를 1부터 다시 세기 시작
            if (obstacle < min) {
                min = obstacle;
                count = 1;
            } else if (obstacle == min) {
                count++;
            }
        }

        sb.append(min).append(" ").append(count);
        System.out.println(sb);

    }

}