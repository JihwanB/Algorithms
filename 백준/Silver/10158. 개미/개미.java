import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int W = sc.nextInt();
        int H = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int T = sc.nextInt();

        int currentX = (T + P) % (2 * W);
        if (currentX > W) {
            currentX = (2 * W) - currentX;
        }

        int currentY = (T + Q) % (2 * H);
        if (currentY > H) {
            currentY = (2 * H) - currentY;
        }

        bw.write(currentX+" "+currentY);
        bw.flush();
        bw.close();
    }
}
