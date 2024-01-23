import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int coins = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                coins += n / 5;
                break;
            } else {
                n -= 2;
                coins++;
            }
        }
        if (n < 0) {
            bw.write(Integer.toString(-1));
        } else {
            bw.write(Integer.toString(coins));
        }
        bw.flush();
    }
}