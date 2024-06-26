import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {

			HashMap<String, Integer> map = new HashMap<>();

			int N = Integer.parseInt(br.readLine());
			for (int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String clothes = st.nextToken();
				String category = st.nextToken();
				map.put(category, map.getOrDefault(category, 0) + 1);
			}

			int result = 1;
			for (int value : map.values()) {
				result *= (value + 1);
			}

			sb.append(result - 1).append("\n");

		}

		System.out.println(sb);
	}

}
