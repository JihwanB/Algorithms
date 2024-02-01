import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        char[] word = sc.next().toCharArray();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < word.length; i++) {
            if (arr[word[i] - 'a'] == -1)
                arr[word[i] - 'a'] = i;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
