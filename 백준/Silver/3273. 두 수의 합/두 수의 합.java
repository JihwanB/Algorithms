import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        int[] count = new int[1000001];
        int[] sorted = new int[n];

        // To do: counting sort로 정렬하고,
        // 정렬된 배열에서 투포인터로 두 값 비교해서 x가 되는 쌍의 수 count
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        for (int i = 0; i < count.length - 1; i++) {
            count[i + 1] += count[i];
        }

        for (int i = a.length - 1; i >= 0; i--) {
            count[a[i]]--;
            sorted[count[a[i]]] = a[i];
        }

        int startIndex = 0;
        int endIndex = sorted.length - 1;
        int matchCount = 0;

        while (startIndex < endIndex) {
            if (sorted[startIndex] + sorted[endIndex] == x) {
                matchCount++;
                startIndex++;
                endIndex--;
            }
            else if (sorted[startIndex] + sorted[endIndex] > x)
                endIndex--;
            else if (sorted[startIndex] + sorted[endIndex] < x)
                startIndex++;
        }

        bw.write(Integer.toString(matchCount));
        bw.flush();
    }
}
