import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		int v = Integer.parseInt(br.readLine());
		
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] == v) {
				cnt++;
			}
		}
		br.close();

		bw.write(cnt + " ");
		
		bw.flush();
		bw.close();
	}
}