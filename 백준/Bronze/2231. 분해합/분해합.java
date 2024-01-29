import java.io.*;

public class Main {
    public static int getNum(int input) {
        int number = input;
        while (input > 0) {
            number += input % 10;
            input /= 10;
        }
        return number;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int N = Integer.parseInt(input);

        int ans = 0;
        for (int i = 1; i < N; i++) {
            if (getNum(i) == N) {
                ans = i;
                break;
            }
        }
        bw.write(String.valueOf(ans));
        bw.flush();
    }
}
