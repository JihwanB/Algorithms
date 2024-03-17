import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] nums = new int[]{a, b, c};
        Arrays.sort(nums);

        int sameCnt = 1;
        int index = 0;
        int max = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                sameCnt++;
                index = i + 1;
            }
        }

        int prize = 0;
        if (sameCnt == 3) {
            prize += 10000 + (nums[index] * 1000);
        } else if (sameCnt == 2) {
            prize += 1000 + (nums[index] * 100);
        } else {
            prize += (nums[nums.length - 1] * 100);
        }

        System.out.println(prize);

    }

}
