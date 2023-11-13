import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //영수증에 적힌 총 금액
		int n = sc.nextInt(); //영수증에 적힌 구매한 물건의 종류의 수
		int sum = 0;
		
		for(int i = 0; i < n ; i++) {
			int a = sc.nextInt(); //금액
			int b = sc.nextInt(); //개수
			
			sum += a*b;
		}
		
		System.out.println(x == sum ? "Yes" : "No");
		
	}
}
