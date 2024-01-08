import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0 ; i < a.length() ; i++) {
        	char b;
        	if(Character.isUpperCase(a.charAt(i))) {
        		b = Character.toLowerCase(a.charAt(i));
        	} else {
        		b = Character.toUpperCase(a.charAt(i));
        	}
        	System.out.print(b);
        }
    }
}