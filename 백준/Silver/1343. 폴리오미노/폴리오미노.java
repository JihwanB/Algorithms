import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] board = br.readLine().toCharArray();

        int length = 0;
        boolean isBBMade = false;
        for (int i = 0; i < board.length; i++) {
            // TODO: satisfy test case 3 & 4
            if (board[i] == 'X') {
                length++;
            } else if (board[i] == '.') {
                length = 0;
            }

            if (i >= 3 && length == 4 && isBBMade) {
                board[i] = 'A';
                board[i - 1] = 'A';
                board[i - 2] = 'A';
                board[i - 3] = 'A';
                length = 0;
                isBBMade = false;
            }

            if (i >= 1 && length == 2) {
                board[i] = 'B';
                board[i - 1] = 'B';
                isBBMade = true;
            }

        }

        for (int i = 0; i < board.length; i++) {

            if (board[i] == 'X') {
                sb.append(-1);
                System.out.println(sb);
                return;
            }
            
        }

        for (char c : board) {
            sb.append(c);
        }

        System.out.println(sb);

    }

}
