import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = n-i ; j >= 1 ; j--) {
				bw.write(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}