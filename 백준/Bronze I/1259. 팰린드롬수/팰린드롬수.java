import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder backward = new StringBuilder();
            String forward = br.readLine();

            if (forward.equals("0")) {
                break;
            }

            for (int i = forward.length() - 1; i >= 0; i--) {
                backward.append(forward.charAt(i));
            }

            if (forward.contentEquals(backward)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }


    }

}
