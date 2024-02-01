import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] strArr = new String[t];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.next();
        }
        
        for (int i = 0; i < strArr.length; i++) {

            int consecutiveCount = 0;
            int score = 0;

            for (int j = 0; j < strArr[i].length(); j++) {

                if (strArr[i].charAt(j) == 'O') {
                    consecutiveCount++;
                } else {
                    consecutiveCount = 0;
                }
                score += consecutiveCount;

            }
            System.out.println(score);
        }

    }
}
