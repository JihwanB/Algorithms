import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        A = T / 300;
        B = (T % 300) / 60;
        C = (T % 60) / 10;
        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            System.out.print(A + " ");
            System.out.print(B + " ");
            System.out.print(C);
        }
    }
}
