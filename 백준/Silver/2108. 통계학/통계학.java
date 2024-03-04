import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort((o1, o2) -> o1 - o2);

        sb.append(avg(list, N)).append("\n");
        sb.append(median(list, N)).append("\n");
        sb.append(mode(list, N)).append("\n");
        sb.append(range(list, N));

        System.out.println(sb);

    }

    public static int avg(List<Integer> list, int N) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return (int) Math.round((double) sum / N);
    }

    public static int median(List<Integer> list, int N) {
        return list.get((N - 1) / 2);
    }

    public static int mode(List<Integer> list, int N) {
        int count = 0;
        int max = Integer.MIN_VALUE;

        int mod = list.get(0);
        boolean check = false;

        for(int i = 0; i < N - 1; i++) {
            if(list.get(i).equals(list.get(i + 1))) {
                count++;
            }else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = list.get(i);
                check = true;
            }else if(max == count && check) {
                mod = list.get(i);
                check = false;
            }
        }
        return mod;
    }

    public static int range(List<Integer> list, int N) {
        return Math.abs(list.get(N - 1) - list.get(0));
    }

}
