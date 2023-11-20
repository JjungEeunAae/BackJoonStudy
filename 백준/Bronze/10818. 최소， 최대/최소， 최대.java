import java.util.*;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = 0;
		int max = 0;
		int data = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			data = arr[i];
			//min,max
			if(i == 0) {
				max = data;
				min = data;
			}
			//max
			if(max<data) {
				max = data;
			}
			//min
			if(min>data) {
				min = data;
			}
		}
		System.out.printf("%s %s",min,max);

	}
}