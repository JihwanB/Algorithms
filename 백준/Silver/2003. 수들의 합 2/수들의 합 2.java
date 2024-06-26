import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		int[] acc = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			acc[i] = arr[i] + acc[i - 1];
		}

		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				if (acc[j] - acc[i - 1] == M) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

}
