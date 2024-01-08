import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = Math.round(array.length / 2);
        Arrays.sort(array);
        int result = array[answer];
        return result;
    }
}