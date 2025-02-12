import java.util.*;

public class Solution {
    public int solution(int n) {
        int quotient = n;
        int remainder;
        int answer = 0;
        
        if (n == 0)
            return 0;
        
        while(quotient != 0) {
            remainder = (quotient % 10);
            quotient /= 10;
            answer += remainder;
        }

        return answer;
    }
}