import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int v, e;
    static int[][] graph;
    static boolean[] visited;
    static BufferedReader br;
    static StringTokenizer st;
    static int cnt;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        v = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());

        graph = new int[v + 1][v + 1];
        visited = new boolean[v + 1];

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            graph[src][dst] = 1;
            graph[dst][src] = 1;
        }

        dfsStack(1);
        System.out.println(cnt - 1);
    }

    static void dfsStack(int node) {
        Stack<Integer> s = new Stack<>();
        s.push(node);
        visited[node] = true;
        while (!s.empty()) {
            int cur = s.pop();
            cnt++;
            for (int i = 1; i <= v; i++) {
                if (graph[cur][i] == 1 && !visited[i]) {
                    s.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void dfs(int node) {
        visited[node] = true;
        for (int i = 1; i <= v; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                cnt++;
                dfs(i);
            }
        }
    }

    static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node] = true;
        while (!q.isEmpty()) {
            int cur = q.poll();
            cnt++;
            for (int i = 1; i <= v; i++) {
                if (graph[cur][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
