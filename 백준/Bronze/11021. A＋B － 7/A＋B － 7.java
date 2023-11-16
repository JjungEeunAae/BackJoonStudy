import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// InputStream : 자바의 가장 기본이 되는 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter : 자바의 가장 기본이 되는 출력 스트림
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// Stream 이란 출발지와 도착지를 이어주는 다리다.
		
		// readLine() 메서드는 반환되는 타입이 String.
		// 입력한 값을 int로 변환하기 위해 Integer.parseInt()를 사용함. 
		int a = Integer.parseInt(br.readLine());

		for(int i = 1 ; i <= a ; i++) {
			
			String str = br.readLine();
			
			int b = Integer.parseInt(str.split(" ")[0]);
			
			int c = Integer.parseInt(str.split(" ")[1]);
			
			System.out.println("Case #"+(i)+": "+(b + c));
			
		}
		
	}
}