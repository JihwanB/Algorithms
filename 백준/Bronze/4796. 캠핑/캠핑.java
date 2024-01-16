import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L;
        int P;
        int V;
        int ans;

        int i = 1;
        while (sc.hasNextLine()) {
            L = sc.nextInt();
            P = sc.nextInt();
            V = sc.nextInt();
            if (L == 0 && P == 0 && V == 0) {
                break;
            }
            if (L <= V % P) {
                ans = ((V / P) * L) + L;
            } else {
                ans = ((V / P) * L) + (V % P);
            }
            bw.write("Case " + i + ": " + ans + "\n");
            i++;
        }
        bw.flush();
        bw.close();
    }
}