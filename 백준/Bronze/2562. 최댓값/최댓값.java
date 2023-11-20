import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];		// 입력 9개 받는 array
		int max = arr[0];			// max 값을 담을 변수
		int index = 0;				// max 값의 index를 담을 변수
		
		for(int i = 0 ; i < arr.length ; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;			// 입력한 숫자를 배열에 담기
			
			if(max < arr[i]) {		// arr[0~8]의 값이 arr[0]보다 크면
				max = arr[i];		// arr[0]의 값을 큰 값으로 대체
				index = i + 1;		// index는 i + 1
			};
		};
		
		br.close();						// 입력 종료
		bw.write(max + "\n" + index);	// 결과 출력
		bw.flush();						// 출력 비우고
		bw.close();						// 출력 종료
	}
}