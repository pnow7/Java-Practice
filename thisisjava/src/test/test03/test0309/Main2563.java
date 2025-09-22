package test.test03.test0309;

//겹쳐진 검은 영역의 넓이를 구하는 프로그램
//100+100+100 - 겹쳐진부분 40(5*8)
import java.io.*;
import java.util.*;
public class Main2563 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 0 부터 100까지 0으로 지정
		// 색종이가 칠해진 부분은 1로 -> 중복은 허용 안함
		int[][] paper = new int[101][101]; 
		int sum = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j = x; j < x+10; j++) {
				for(int k = y; k < y+10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				sum += paper[i][j];
			}
		}
		br.close();
		System.out.print(sum);
	}

}
