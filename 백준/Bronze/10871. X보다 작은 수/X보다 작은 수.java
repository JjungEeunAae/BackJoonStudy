import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//배열이 될 숫자
		int x = sc.nextInt();	//x보다 작은 숫자를 찾는 것
		
		int[] arr = new int[n];	//배열의 길이
		List<Integer> arr2 = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ; i++) {
			int num = sc.nextInt();	//입력할 숫자
			
			if(x > num) {
				arr2.add(num);
			}
		};
		
		for(Integer j : arr2) {
			System.out.print(j + " ");
		}
		
	}
}