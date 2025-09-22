package test.test05.test0503;
/*
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 
크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 
예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

[입력]
27

[출력]
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
*********         *********
* ** ** *         * ** ** *
*********         *********
***   ***         ***   ***
* *   * *         * *   * *
***   ***         ***   ***
*********         *********
* ** ** *         * ** ** *
*********         *********
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************

*/
import java.io.*;
public class FMain2447 {
	static int N;
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		arr = new char[N][N];
		
		star(0, 0, N, false);
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
	//x : 시작행, y : 시작열, N : 블록의 크기, blank : 공백 여부
	static void star(int x, int y, int N, boolean blank) {
		if(blank) {
			for(int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = N/3;
		int count = 0;
		
		for(int i = x; i < x + N; i += size) {
			for(int j = y; j < y + N; j += size) {
				count++;
				if(count == 5) {
					star(i, j, size, true); //중앙
				}
				else {
					star(i, j, size, false); //나머지
				}
			}
		}
	}
	
}


/*

N = 3인 경우

x=0, y=0, N=3, blank=false

-> size = 1

for 루프 순서 및 count 값:
[1] (0,0)
[2] (0,1)
[3] (0,2)
[4] (1,0)
[5] (1,1) ← blank = true 
[6] (1,2)
[7] (2,0)
[8] (2,1)
[9] (2,2)


5가 공백인 이유
2차원 배열로 했을 때 5번째가 빈 공간이기 때문
*/

