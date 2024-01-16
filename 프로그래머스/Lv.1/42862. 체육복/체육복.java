import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌옷을 가져온 내가 잃어버린 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j]==lost[i]){
                    answer++;
                    lost[i] =-1;
                    reserve[j] =-1;
                    break;
                }
            }
        }
        
        // 여벌옷이 있는 앞 혹은 뒷사람으로 부터 체육복을 빌리는 경우
        // 이미 빌려준 사람은 더 이상 빌려줄 수 없기에 -1로 변경
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j]==lost[i]-1 || reserve[j]==lost[i]+1){
                    answer++;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}