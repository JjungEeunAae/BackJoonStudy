import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		// [1, 2, 3, 4, 5] 배열 만들어주기
		for(int i = 0 ; i < N ; i++) {
			arr[i] = i + 1;
		};
		
		for(int j = 0 ; j < M ; j++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			// 배열 0부터 시작
			int I = Integer.parseInt(st.nextToken()) - 1;
			int J = Integer.parseInt(st.nextToken()) - 1;
			
			// I ~ J까지 반복문을 돌리고 nn에 j를 넣고 1씩 감소
			for(int k = I ; k <= J ; k++) {
				int nn = J--;
				int tmp = arr[k];
				
				arr[k] = arr[nn];
				arr[nn] = tmp;
			}
		}
		br.close();
		
		// 완성된 배열 출력하기
		for(Integer array : arr) {
			bw.write(array + " ");
		}
		bw.flush();
		bw.close();
	}
}