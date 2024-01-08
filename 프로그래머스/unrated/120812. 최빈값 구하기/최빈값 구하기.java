class Solution {
    public int solution(int[] array) {
        int answer = array[0];          // 배열 중 제일 첫번째 값을 maxNum으로 초기설정
        int max = 0;                    // 값을 담기 위한 변수 초기화
        int frequent[] = new int[1000]; // array 길이 초기설정
        
        for(int i = 0; i < array.length ; i++) {
            frequent[array[i]]++;
            
            if(max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        };
        
        int MultipleOrNot = 0;  // 여러개인지 확인하기 위한 변수 선언
        for(int i = 0 ; i < 1000 ; i++) {
            if(max == frequent[i]) {
                MultipleOrNot++;
            }
            if(MultipleOrNot > 1) {
                answer = -1;
            }
        };
        
        return answer;
    }
}