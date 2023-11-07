import java.util.*;
public class Main {
	public static void main(String[] args) {
		/*코딩하는 곳*/
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if(A<B){
			System.out.println("<");
		} else if(A==B) {
			System.out.println("==");
		}
		
	}
}