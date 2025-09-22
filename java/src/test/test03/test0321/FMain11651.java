package test.test03.test0321;
//좌표정렬2
//2차원 평면 위의 점 N개가 주어진다. 
//좌표를 y좌표가 증가하는 순으로, 
//y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//부분 오름차순

import java.io.*;
import java.util.*;
public class FMain11651 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] number = new int[N][2];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			number[i][0] = Integer.parseInt(st.nextToken());
			number[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(number, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0]; //오름차순
				//(return 값이 음수이면 e2[0]이 더 큰값 e1[0]이 더 앞에있다)
			}
			else {
				return e1[1] - e2[1]; 
				//오름차순
			}

		});
		//y좌표가 같으면 x좌표 오름차순
		//첫번째 값(e1) - 두번째 값(e2) -> 오름차순
		//두번째 값(e2) - 첫번째 값(e1) -> 내림차순
		
		for(int i = 0; i < N; i++) {
			bw.write(number[i][0]+ " " + number[i][1] + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
