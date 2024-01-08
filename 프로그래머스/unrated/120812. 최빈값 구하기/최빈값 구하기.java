import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int answer = 0;
        int max = 0;
        int maxNum = array[0];
        int cnt = 1;

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]) {
                cnt++;
                if(cnt > max) {
                    max = cnt;
                    maxNum = array[i];
                }
                else if(cnt == max) {
                    maxNum = -1;
                }
            }
            else{
                cnt = 1;
            }
        }
        
        answer = maxNum;
        
        return answer;
    }
}