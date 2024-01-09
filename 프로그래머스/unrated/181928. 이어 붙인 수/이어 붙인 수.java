class Solution {
    public int solution(int[] num_list) {
        String temp = "";
        String temp2 = "";
        for(int i = 0 ; i < num_list.length ; i++) {
        	if(num_list[i] % 2 != 0) {
        		temp += num_list[i] + "";
        	} else {
        		temp2 += num_list[i] + "";
        	}
        };
        return Integer.parseInt(temp) + Integer.parseInt(temp2);
    }
}