import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str;
		
		while(true) {
			str = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(str.nextToken());
			int B = Integer.parseInt(str.nextToken());
			
			if(A + B == 0) {
				break;
			}
			
			bw.write( (A + B) + " \n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}