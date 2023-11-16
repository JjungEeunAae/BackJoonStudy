import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// Stream 이란 출발지와 도착지를 이어주는 다리다.
		
		// 입력 값을 String에서 int로 변환.
		int a = Integer.parseInt(br.readLine());
		
		// 문자열 분리 담당
		StringTokenizer str;

		for(int i = 1 ; i <= a ; i++) {
			str = new StringTokenizer(br.readLine(), " ");
			
			int b = Integer.parseInt(str.nextToken());
			int c = Integer.parseInt(str.nextToken());
			
			bw.write("Case #" + i + ": " + (b + c) + "\n");
		}
		
		// 입력 종료
		br.close();
		
		// 출력 비우고
		bw.flush();
		// 출력 종료
		bw.close();
	}
}