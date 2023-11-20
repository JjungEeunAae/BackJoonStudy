import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int num = sc.nextInt();
			
			arr[i] = num;
		};
		
		int cnt = 0;
		int v = sc.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == v) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}