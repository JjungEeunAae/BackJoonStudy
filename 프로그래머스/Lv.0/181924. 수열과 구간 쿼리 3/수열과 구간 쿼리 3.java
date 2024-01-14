class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] arr1 = new int[queries.length];
        int[] arr2 = new int[queries.length];

        for(int i = 0 ; i < queries.length ; i++) {
        	int tmp = arr[queries[i][0]];		// 첫번째 방의 값 tmp 저장
        	arr[queries[i][0]] = arr[queries[i][1]];	// 첫번째 방에 두번째 방 값 저장
        	arr[queries[i][1]] = tmp;			// 두번째 방에 tmp에 저장해둔 값 주입
        }
        
        return arr;
    }
}