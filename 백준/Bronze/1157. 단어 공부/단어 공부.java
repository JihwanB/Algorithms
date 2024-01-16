import java.util.Scanner;

public class Main {
    public static int[] getCount(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();

        int[] count = getCount(str);

        int max_pos = 0;
        int redundant = -1;

        for (int i = 1; i < count.length; i++) {
            if (count[max_pos] < count[i]) {
                max_pos = i;
            } else if (count[max_pos] == count[i]) {
                max_pos = i;
                redundant = i;
            }
        }
        if (max_pos == redundant) {
            System.out.println('?');
        } else {
            char ans = (char) ((char) max_pos + 'A');
            System.out.println(ans);
        }
    }
}