import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] gauss = new int[45];
        for (int i = 1; i < gauss.length; i++) {
            gauss[i] = (i * (i + 1)) / 2;
        }

        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            int answer = solve(K, gauss);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int solve(int K, int[] gauss) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    int sum = gauss[i] + gauss[j] + gauss[k];
                    if (sum == K) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}