import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static int[][] Aparment = new int[15][15];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getApartment();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(Aparment[k][n]).append('\n');
        }
        System.out.println(sb);
    }


    public static void getApartment() {

        for (int i = 0; i < 15; i++) {
            Aparment[i][1] = 1;
            Aparment[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {

            for (int j = 2; j < 15; j++) {
                Aparment[i][j] = Aparment[i][j - 1] + Aparment[i - 1][j];
            }
        }
    }

}