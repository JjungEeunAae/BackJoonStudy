import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] < x) {
				bw.write(arr[i] + " ");
			}
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}