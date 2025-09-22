package F;

import java.io.*;
import java.util.*;
public class FMain2501 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//약수의 개수 카운트
		int count = 0;
		
		//K번째 약수 저장할 변수
		int result = 0;

		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				count++;
			}
			
			if(count == K) {      
				result = i;
				break;
			}
		}
		System.out.println(result);
		//k보다 커지면 어짜피 result = 0이기 때문에 if(count == K) 실행이 안되고 0값 출력
	}

}
