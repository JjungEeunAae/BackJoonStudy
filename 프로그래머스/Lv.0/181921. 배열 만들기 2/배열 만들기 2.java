import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
		ArrayList<Integer> resultList = new ArrayList<>();
		
		for(int i = l ; i <= r ; i++) {
			String str = i + "";
			int cnt = 0;
			for(int j = 0 ; j < str.length() ; j++) {
				char tmp = str.charAt(j);
				if(tmp == '5' || tmp == '0') {
					cnt++;
				}
			};
			
			if(cnt == str.length()) {
				resultList.add(Integer.parseInt(str));
			}
		};
		
		if(resultList.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[resultList.size()];
			// 만들어진 각 방에 값 집어넣어
			for(int i = 0 ; i < resultList.size() ; i++) {
				answer[i] = resultList.get(i);
			};
		}
		return answer;
    }
}