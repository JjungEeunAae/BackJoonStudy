class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = a+""+b;
        
        if(Integer.parseInt(aa) > 2*a*b || Integer.parseInt(aa) == 2*a*b) {
        	answer = Integer.parseInt(aa); 
        } else {
        	answer = 2*a*b;
        }
        return answer;
    }
}