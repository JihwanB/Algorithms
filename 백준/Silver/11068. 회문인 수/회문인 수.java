import java.io.*;

public class Main {
    public static int[] convertBase(int x, int B) {
        int length = 0, copyX = x;
        while (copyX > 0) {
            copyX /= B;
            length++;
        }

        int[] digit = new int[length];
        length = 0;
        while (x > 0) {
            digit[length++] = x % B;
            x /= B;
        }
        return digit;
    }

    public static boolean isPalindrome(int[] digit) {
        for (int i = 0; i < digit.length / 2; i++) {
            if (digit[i] != digit[digit.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int x = Integer.parseInt(br.readLine());
            boolean ans = false;
            for (int i = 2; i <= 64; i++) {
                int[] digit = convertBase(x, i);
                if (isPalindrome(digit)) {
                    ans = true;
                    break;
                }
            }
            bw.write(ans ? "1" : "0");
            bw.write("\n");
        }
        bw.flush();
    }
}
