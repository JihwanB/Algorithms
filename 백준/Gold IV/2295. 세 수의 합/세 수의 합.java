import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> U = new HashSet<>();
        for (int i = 0; i < N; i++)
            for (int j = i; j < N; j++)
                U.add(arr[i] + arr[j]);


        int max = -1;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                int target = arr[i] - arr[j];
                if(U.contains(target))
                    max = Math.max(max, arr[i]);
            }

        System.out.println(max);

    }

}
