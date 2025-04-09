import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        dfs(1);
        System.out.println(cnt);
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

}
