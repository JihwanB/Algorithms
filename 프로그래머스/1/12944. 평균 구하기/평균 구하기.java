class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int count = 0;
        for (Integer num : arr) {
            answer += num;
            count += 1;
        }
        if (count == 0) {
            return 0;
        }
        answer /= count;
        return answer;
    }
}