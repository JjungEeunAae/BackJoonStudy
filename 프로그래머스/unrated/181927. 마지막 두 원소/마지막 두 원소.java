class Solution {
    public int[] solution(int[] num_list) {
        int num = num_list.length;
        int[] answer = new int[num + 1];
        
        for(int i = 0 ; i < num ; i++) {
        	answer[i] = num_list[i];
        };
        
    	if(answer[num-1] > answer[num-2]) {
    		answer[num] = answer[num-1] - answer[num-2];
    	} else {
    		answer[num] = (answer[num-1] * 2);
    	};
        
        return answer;
    }
}