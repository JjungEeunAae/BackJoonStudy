import java.util.*;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = a/10;
		//System.out.println(b);
		
		switch(b) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}