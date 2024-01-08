class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(a+""+b) ;
        int num2 = Integer.parseInt(b+""+a);
        int answer = 0;
        if(num1 > num2) {
        	answer = num1;
            if(answer == num2) {
                answer = num1;
            }
        } else {
        	answer = num2;
        }
        return answer;
    }
}