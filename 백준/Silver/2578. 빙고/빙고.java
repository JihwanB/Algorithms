import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] bingo = new int[5][5];
    static int nthNumber = 0;   // 사회자가 부른 숫자가 몇번째 숫자인지

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                nthNumber++;
                markNums(Integer.parseInt(st.nextToken()));
                if(isBingo(bingo)){
                    break;
                }
            }
            if(isBingo(bingo)) {
                System.out.println(nthNumber);
                break;
            }
        }
    }

    private static void markNums(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == n) {
                    bingo[i][j] = -1;
                }
            }
        }
    }

    public static boolean isBingo(int[][] bingo) {
        // 가로, 세로, 대각선으로 빙고를 확인할 배열 선언
        int[] horizontal = new int[bingo.length]; // 가로 빙고 수
        int[] vertical = new int[bingo.length];   // 세로 빙고 수
        int[] diagonal = new int[2];    // 대각선 빙고 수
        int count = 0;  // 빙고 수 카운트

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                // 대각선 빙고 확인
                if (bingo[i][j] == -1) {
                    horizontal[j]++;
                    vertical[i]++;
                    if (i == j) {
                        diagonal[0]++;
                    }
                    if (i + j == bingo.length - 1) {
                        diagonal[1]++;
                    }
                }
            }
        }

        for (int i = 0; i < horizontal.length; i++) {
            if (horizontal[i] == horizontal.length)
                count++;
            if (vertical[i] == horizontal.length)
                count++;
        }

        if (diagonal[0] == horizontal.length)
            count++;
        if (diagonal[1] == horizontal.length)
            count++;

        return count >= 3;
    }
}
