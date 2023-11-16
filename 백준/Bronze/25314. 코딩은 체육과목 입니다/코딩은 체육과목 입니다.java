import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //바이트 입력 값
		
		String a = "";
		
		if(x%4 == 0) {
			for(int i = 0 ; i < x/4 ; i++) {
				a += "long ";
			}
			
			System.out.println(a + "int");
		} else {
			System.out.println("error");
		};
	}
}