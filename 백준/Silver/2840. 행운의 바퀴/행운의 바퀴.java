import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        char[] wheel = new char[N];
        Arrays.fill(wheel, '?');

        int curIndex = 0;
        while (K-- > 0) {
            int step = sc.nextInt();
            char nextAlphabet = sc.next().charAt(0);
            int nextIndex = ((curIndex - step) % N + N) % N;

            if (wheel[nextIndex] == '?') wheel[nextIndex] = nextAlphabet;
            else if (wheel[nextIndex] != nextAlphabet) {
                System.out.println("!");
                return;
            }
            curIndex = nextIndex;
        }

        boolean[] isUsed = new boolean[26];
        for (int i = 0; i < N; i++) {
            if (wheel[i] == '?') continue;
            if (isUsed[wheel[i] - 'A']) {
                System.out.println("!");
                return;
            }
            isUsed[wheel[i] - 'A'] = true;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(wheel[(curIndex + i) % N]);
        }
    }
}
