package test.test03.test0304;

//1번부터 N번 바구니
//순서를 역순으로
//역순으로 만들 범위를 정하고
//그 범위에 들어있는 바구니의 순서를 역순으로
//가장 왼쪽 바구니부터 출력
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class FMain10811 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		//br.readLine()이 아닌 StringTokenizer 선언된 후로 부턴 st.nextToken() 사용
		
		int[] basket = new int[N];
		int x = 0;

		for(int num = 0; num < N; num++) {
			basket[num] = num+1;
		}

		for(int test_case = 0; test_case < M; test_case++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			//역순으로 나열
			while(i<j) {  //while i가 j보다 크면 종료
				x = basket[i-1];
				basket[i-1] = basket[j-1];
				basket[j-1] = x;
				i++;
				j--;
			}
				
		}
		
		for(int test_case1 = 0; test_case1 < N; test_case1++) {
			bw.write(basket[test_case1]+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
