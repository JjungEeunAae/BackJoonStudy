import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N];
		double score = 0;
		double max_sco = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 과목 개수만큼 반복문
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			score += arr[i];			// 과목 총 합
			if( arr[i] > max_sco ) {	// 과목 중 최고 성적 뽑기
				max_sco = arr[i];
			};
		};
		
		System.out.println( ( (score / max_sco) * 100) / N);
		
		br.close();
	}
}