import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String doc = br.readLine();
        String word = br.readLine();

        int count = 0;
        int startIndex = 0;

        while (true) {
            int wordPosition = doc.indexOf(word, startIndex);
            if (wordPosition < 0) {
                break;
            }
            count++;
            startIndex = wordPosition + word.length();
        }
        bw.write(Integer.toString(count));
        br.close();
        bw.flush();
        bw.close();
    }
}