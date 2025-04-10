import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] earth;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static List<Ice> iceList;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        earth = new int[n][m];
        visited = new boolean[n][m];
        iceList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                earth[i][j] = Integer.parseInt(st.nextToken());
                if (earth[i][j] > 0) {
                    iceList.add(new Ice(i, j, earth[i][j]));
                }
                visited[i][j] = true;
            }
        }

        for (int year = 1; !iceList.isEmpty(); year++) {
            for (Ice ice : iceList) {
                for (int j = 0; j < 4; j++) {
                    int nextRow = ice.row + dr[j];
                    int nextCol = ice.col + dc[j];
                    if (earth[nextRow][nextCol] == 0) {
                        ice.height--;
                    }
                }
            }

            for (int i = 0; i < iceList.size(); i++) {
                Ice ice = iceList.get(i);
                if (ice.height <= 0) {
                    earth[ice.row][ice.col] = 0;
                    iceList.set(i, iceList.get(iceList.size() - 1));
                    iceList.remove(iceList.size() - 1);
                    i--;
                }
                else {
                    visited[ice.row][ice.col] = false;
                }
            }

            if (iceList.size() > 0
                && dfs(iceList.get(0).row, iceList.get(0).col) != iceList.size()) {
                System.out.println(year);
                System.exit(0);
            }
        }
        System.out.println(0);
    }

    static int dfs(int row, int col) {
        visited[row][col] = true;
        int cnt = 1;
        for (int i = 0; i < 4; i++) {
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];
            if (visited[nextRow][nextCol]) {
                continue;
            }
            cnt += dfs(nextRow, nextCol);
        }
        return cnt;
    }

}

class Ice {

    int row;
    int col;
    int height;

    public Ice(int row, int col, int height) {
        this.row = row;
        this.col = col;
        this.height = height;
    }
}
