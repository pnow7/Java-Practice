package test.test03.test0303;

import java.io.BufferedReader;
import java.io.BufferedWriter; //
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; //
import java.io.IOException;
import java.util.StringTokenizer;
public class Main10810 { //10810 공넣기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //

		int N = Integer.parseInt(st.nextToken()); //바구니 N개 
		int[] basket = new int[N];
		int M = Integer.parseInt(st.nextToken()); //4번시행 
		
		for(int test_case = 0; test_case < M; test_case++) {
			st = new StringTokenizer(br.readLine()); //공백 구분(앞에 StringTokenizer 없음)
			
			int i = Integer.parseInt(st.nextToken()); //i번부터
			int j = Integer.parseInt(st.nextToken()); //j번 바구니까지
			int k = Integer.parseInt(st.nextToken()); //k번호 공을 넣음
			
			for(int test_case1 = i; test_case1 <= j; test_case1++) {
				basket[test_case1-1] = k; //i번 부터 j번까지 배열 basket에 k가 저장
			}
		} //공이 없을때 0 출력 그냥 없으면 0인가봄?
		for(int test_case2 = 0; test_case2 < N; test_case2++) {
			bw.write(basket[test_case2]+" "); //저장된 번호 배열 0번부터 N번까지 출력
		}
		br.close();
		bw.flush();
		bw.close();
		
	}

}
