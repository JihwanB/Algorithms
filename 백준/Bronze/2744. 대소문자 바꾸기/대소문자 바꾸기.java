import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in_str = sc.nextLine();
        char[] char_arr = in_str.toCharArray();

        for (int i = 0; i < char_arr.length; i++) {
            if (char_arr[i] >= 65 && char_arr[i] <= 90) {
                char_arr[i] = (char) (char_arr[i] + 32);
            } else if (char_arr[i] >= 97 && char_arr[i] <= 122) {
                char_arr[i] = (char) (char_arr[i] - 32);
            }
        }

        System.out.println(char_arr);
    }
}
