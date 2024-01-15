import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = start_num ; i <= end_num ; i++) {
			arr.add(i);
		};
		
		answer = new int[arr.size()];
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = arr.get(i);
		};
		
		return answer;
    }
}