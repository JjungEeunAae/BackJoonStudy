import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer str;

		for(int i = 1 ; i <= a ; i++) {
			str = new StringTokenizer(br.readLine()," ");
			
			int b = Integer.parseInt(str.nextToken());
			int c = Integer.parseInt(str.nextToken());
			
			bw.write("Case #" + i + ": "+ b + " + " + c + " = " + (b + c) + "\n");
		};
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}