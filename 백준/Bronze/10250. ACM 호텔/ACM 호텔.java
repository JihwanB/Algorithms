import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static String allocateRoom(int[][] hotel, int height, int width, int number) {

        int h = 0;
        int w = 1;
        boolean columnComplete = false;

        while (number-- > 0) {
            h++;

            if (h == height) {
                h = 1;
                columnComplete = true;
            }

            if (columnComplete) {
                w++;
                columnComplete = false;
            }
        }

        String floor = Integer.toString(h);
        String room = null;

        if (w < 10) {
            room = Integer.toString(0).concat(Integer.toString(w));
        } else {
            room = Integer.toString(w);
        }

        return floor.concat(room);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int H = 0, W = 0, N = 0;

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            int[][] hotel = new int[H + 1][W + 1];
            String roomNum = allocateRoom(hotel, H + 1, W + 1, N);
            System.out.println(roomNum);
        }
    }
}
