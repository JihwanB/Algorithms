import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yen500 = 0;
        int yen100 = 0;
        int yen50 = 0;
        int yen10 = 0;
        int yen5 = 0;
        int yen1 = 0;

        Scanner sc = new Scanner(System.in);
        int needToPay = sc.nextInt();
        int change = 1000 - needToPay;

        yen500 = change / 500;
        yen100 = (change % 500) / 100;
        yen50 = (change % 100) / 50;
        yen10 = (change % 50) / 10;
        yen5 = (change % 10) / 5;
        yen1 = change % 5;

        System.out.println(yen500 + yen100 + yen50 + yen10 + yen5 + yen1);
    }
}
