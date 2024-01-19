import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] lightBulbs = new int[N];

        for (int i = 0; i < N; i++) {
            lightBulbs[i] = sc.nextInt();
        }

        while (M-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int bIndex = b - 1;
            int cIndex = c - 1;

            switch (a) {
                case 1:
                    lightBulbs[b - 1] = c;
                    break;
                case 2:
                    for (int j = bIndex; j <= cIndex; j++) {
                        lightBulbs[j] = (lightBulbs[j] + 1) % 2;
                    }
                    break;
                case 3:
                    for (int j = bIndex; j <= cIndex; j++) {
                        lightBulbs[j] = 0;
                    }
                    break;
                case 4:
                    for (int j = bIndex; j <= cIndex; j++) {
                        lightBulbs[j] = 1;
                    }
                    break;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (int lightBulb : lightBulbs) {
            list.add(String.valueOf(lightBulb));
        }
        String result = String.join(" ", list);
        System.out.println(result);
    }
}