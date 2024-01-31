import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String bookName = br.readLine();
            if (map.containsKey(bookName)) {
                map.replace(bookName, map.get(bookName) + 1);
            } else {
                map.put(bookName, 1);
            }
        }

        int max = 0;
        for (String bookName : map.keySet()) {
            max = Math.max(max, map.get(bookName));
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (String bookName : list) {
            if (map.get(bookName) == max) {
                bw.write(bookName);
                break;
            }
        }
        bw.flush();
    }
}
