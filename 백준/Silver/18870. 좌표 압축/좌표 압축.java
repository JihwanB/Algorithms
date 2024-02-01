import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortedNumbers = new ArrayList<>(new TreeSet<>(numbers));

        for (Integer number : numbers) {
            int i = Collections.binarySearch(sortedNumbers, number);
            bw.write(i + " ");
        }
        bw.flush();
    }
}
