import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: 정수배열 누적합해서 트리셋에 넣고, 100을 찾을 수 있으면 찾아서 출력.
        //  없으면 100을 기준으로 기준으로 ceil, floor 써서 둘 중에 더 100에 가까운 거로.
        //  만약 두 수가 똑같이 가까우면 (-100 연산을 한 절대값이 같다면) 두 숫자중에 큰거로 출력.

        Integer[] scores = new Integer[11];
        Integer[] accScores = new Integer[11];
        TreeSet<Integer> set = new TreeSet<>();

        accScores[0] = 0;
        for (int i = 1; i <= 10; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            accScores[i] = accScores[i - 1] + scores[i];
            set.add(accScores[i]);
        }

        if (set.contains(100)) {
            System.out.println(100);
            System.exit(0);
        }

        Integer ans1 = set.floor(100);
        Integer ans2 = set.ceiling(100);
        if (ans1 == null) {
            System.out.println(ans2);
            System.exit(0);
        } else if (ans2 == null) {
            System.out.println(ans1);
            System.exit(0);
        }

        Integer ans1Abs = Math.abs(ans1 - 100);
        Integer ans2Abs = Math.abs(ans2 - 100);


        if (ans1Abs < ans2Abs) {
            System.out.println(ans1);
        } else if (ans2Abs < ans1Abs) {
            System.out.println(ans2);
        } else {
            System.out.println(Math.max(ans1, ans2));
        }

    }

}
