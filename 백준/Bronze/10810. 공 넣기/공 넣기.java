import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());	// 바구니(번호)
		int M = Integer.parseInt(st.nextToken());	// 행(줄)
		
		int[] arr = new int[N];						// 숫자 넣을 배열
		
		
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int I = Integer.parseInt(st.nextToken());	// I번 바구니에서
			int J = Integer.parseInt(st.nextToken());	// J번 바구니까지
			int K = Integer.parseInt(st.nextToken());	// K번호를 넣는다.
			
			// 지정된 배열에 K(번호) 넣기
			for(int j = I - 1 ; j < J ; j++) {
				arr[j] = K;
			}
		};
		
		// 각 방에 저장된 번호를 출력하는 반복문
		for(Integer array : arr) {
			bw.write(array + " ");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}