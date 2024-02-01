import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int R = 0;
        String s = "";
        for (int i = 0; i < T; i++) {
            R = sc.nextInt();
            s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.printf("%c", s.charAt(j));
                }
            }
            System.out.println();
        }


    }
}
