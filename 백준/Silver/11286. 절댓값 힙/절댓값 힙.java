import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
			if (Math.abs(o1) == Math.abs(o2)) {
				return o1 - o2;
			}
			return Math.abs(o1) - Math.abs(o2);
		});

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {

			int x = Integer.parseInt(br.readLine());

			if (x == 0) {
				if (priorityQueue.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(priorityQueue.poll()).append("\n");
				}
			} else {
				priorityQueue.add(x);
			}

		}

		System.out.println(sb);

	}

}
