import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List <Integer> arr = new ArrayList<Integer>();
		
		while (true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a+b == 0) {
				break;
			}
			arr.add(a+b);
		};
		
		for(Integer j : arr) {
			System.out.println(j);
		};
	}
}
