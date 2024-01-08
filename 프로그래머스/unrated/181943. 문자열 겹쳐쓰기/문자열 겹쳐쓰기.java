class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string;
		
		// 입력한 문자길이가 출력할 문자길이보다 크면?
		if(my_string.length() > answer.length()) {
			/*
			 *  출력할 문자길이를 시작점으로 입력한 문자열에서 문자를 자르고
			 *  자른 문자를 출력할 문자열에 추가한다.
			 */
			answer += my_string.substring(answer.length());
		}
		
        return answer;
    }
}