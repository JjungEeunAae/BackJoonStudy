class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int number = numer1 * denom2 + numer2 * denom1;	// 분자
		int denom  = denom1 * denom2;					// 분모
		int max = 1;
		
		for(int i = 1 ; i <= number && i <=denom ; i++) {
			if(denom%i == 0 && number%i == 0) {
				max = i;
			};
		};
		number = number/max;
		denom = denom/max;
		
		int[] arr = {number, denom};
		return arr;
    }
}