import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int second = 0;
        int first = 0;
        int cycle = 0;
        int sum = 0;
        int newNum = N;

        do {
            if (newNum < 10) {
                first = 0;
                second = newNum % 10;
                sum = first + second;
            } else {
                first = (newNum / 10) % 10;
                second = newNum % 10;
                sum = first + second;
            }
            cycle++;
            newNum = (second * 10) + (sum % 10);
        } while (newNum != N);

        bw.write(String.valueOf(cycle));
        bw.flush();
    }
}
