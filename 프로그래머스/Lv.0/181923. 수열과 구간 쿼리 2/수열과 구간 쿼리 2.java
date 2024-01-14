class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
		
		for(int i = 0 ; i < queries.length ; i++) {
			int[] query = queries[i];
			int s = query[0];
			int e = query[1];
			int k = query[2];
			int min = 1000000;
			
			for(int j = s ; j <= e ; j++) {
				if(arr[j] > k) {
					if(min > arr[j]) {	// arr[3] 단계에서 min이 4가 되고, 
						min = arr[j];	// arr[4] 단계에서 4 > arr[4](3)으로 되면서
					}					// min 값이 3으로 변경되어 for문을 종료함
				}
			};
			
			if(min == 1000000) {
				answer[i] = -1;
			} else {
				answer[i] = min;
			};
		};
		
		return answer;
    }
}