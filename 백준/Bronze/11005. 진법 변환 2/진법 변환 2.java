import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // N을 B로 나눈 나머지를 구하고, 나눈 몫을 N에 다시 저장
        // 가장 마지막에 구해진 나머지 값이, 실제로는 가장 앞에 오는 자리수가 됨
        String ans = "";
        while (N > 0) {
            int digit = N % B;
            if (digit < 10) ans += digit;
            else ans += (char) (digit - 10 + 'A');
            N /= B;
        }

        for (int i = ans.length() - 1; i >= 0; i--) {
            bw.write(ans.charAt(i));
        }
        bw.flush();
    }
}
