class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // a,b,c는 1이상 6이하의 정수
        if(a+b+c > 19 || (a <= 0 || b <= 0 || c <= 0)) {
        	return answer;
        };
        
    	//모두 다를 때
    	if(a != b &&  a != c && b != c) {
    		answer += a+b+c;
		// 모두 동일할 때
    	} else if(a==c && a==b) {
    		answer += (a+b+c)
    				*((a*a)+(b*b)+(c*c))
    				*((a*a*a)+(a*a*a)+(c*c*c));
		// 두개가 동일할 때
    	} else {
    		answer += (a+b+c)
    				*((a*a)+(b*b)+(c*c)); 
    	};
        return answer;
    }
}