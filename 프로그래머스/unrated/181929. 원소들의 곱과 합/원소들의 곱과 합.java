class Solution {
    public int solution(int[] num_list) {
                int answer = 0;
        int temp = 1;
        int temp_2 = 0;
        for(int i = 1 ; i <= num_list.length ; i++) {
        	temp *= num_list[i-1];
        	temp_2 += num_list[i-1];
        	
        }
        
        int temp_3 = temp_2*temp_2;
        
        answer = (temp < temp_3) ? 1 : 0;
        return answer;
    }
}