import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] counts = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        char[] ans = Integer.toString(a * b * c).toCharArray();

        for (int i = 0; i < ans.length; i++) {
            switch (ans[i]) {
                case '0':
                    counts[0]++;
                    break;
                case '1':
                    counts[1]++;
                    break;
                case '2':
                    counts[2]++;
                    break;
                case '3':
                    counts[3]++;
                    break;
                case '4':
                    counts[4]++;
                    break;
                case '5':
                    counts[5]++;
                    break;
                case '6':
                    counts[6]++;
                    break;
                case '7':
                    counts[7]++;
                    break;
                case '8':
                    counts[8]++;
                    break;
                case '9':
                    counts[9]++;
                    break;
            }
        }

        for (int i : counts) {
            System.out.println(i);
        }

    }
}
