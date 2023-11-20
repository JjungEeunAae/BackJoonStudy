import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int index = 0;
		for(int i = 0 ; i < 9 ; i++) {
			int val = Integer.parseInt(br.readLine());
			
			if(val > max) {
				max = val;
				index = i + 1;
			}
		}
		
		System.out.printf("%d\n%d", max, index);
		
		br.close();
	}
}