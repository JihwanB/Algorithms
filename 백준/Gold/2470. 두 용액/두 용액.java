import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int findOptimalPairValue(int[] arr, int fromIndex, int toIndex, int value) {
        int optimalPairAbs = Integer.MAX_VALUE;
        int optimalPairValue = 0;
        int l = fromIndex;
        int r = toIndex;

        while (l <= r) {
            int m = (l + r) / 2;
            int sum = value + arr[m];
            int sumAbs = Math.abs(sum);
            if (optimalPairAbs > sumAbs) {
                optimalPairValue = arr[m];
                optimalPairAbs = sumAbs;
            }
            if (sum < 0) l = m + 1;
            else if (sum > 0) r = m - 1;
            else return arr[m];
        }
        return optimalPairValue;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] solution = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            solution[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(solution);

        int ansAbs = Integer.MAX_VALUE;
        int ans1 = -1;
        int ans2 = -1;
        for (int i = 0; i < N - 1; i++) {
            int pairValue = findOptimalPairValue(solution, i + 1, N - 1, solution[i]);
            int abs = Math.abs(solution[i] + pairValue);
            if (abs < ansAbs) {
                ansAbs = abs;
                ans1 = solution[i];
                ans2 = pairValue;
            }
        }

        System.out.println(ans1 + " " + ans2);

    }

}
