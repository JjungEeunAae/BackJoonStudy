class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int b = n%2;
        for(int i = 0 ; i <= n ; i++) {
        	switch (b) {
				case 0: 
	        		if(i % 2 == 0) {
	        			answer += i * i;
	        		};
					break;
				default:
	        		if(i % 2 != 0) {
	        			answer += i;
	        		};
					break;
        	};
		}
        return answer;
    }
}