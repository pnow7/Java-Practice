package test.test05.test0521;

/*

자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다.

[입력]
3 1

[출력]
1
2
3

[입력]
4 2

[출력]
1 2
1 3
1 4
2 3
2 4
3 4

[입력]
4 4

[출력]
1 2 3 4
*/

import java.io.*;
import java.util.*;

public class FMain15650 {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		dfs(1, 0);
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int at, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i+1, depth+1);
		}
	}
}

/*

깊이를 의미하는 depth 변수뿐만 아니라 at 변수를 추가

at 변수의 의미는 현재 위치, 즉 어디서부터 시작하는지를 의미하는 변수다. 

예로들어 반복문에서 재귀를 해 줄 때, 
at = 1 부터 시작하면 다음 재귀는 오름차순으로 탐색하기 위해 at 을 1 증가시킨 2를 인자로 넘겨주면서 
다음 재귀의 반복문이 2부터 시작하도록 하는 변수를 의미한다.
 
 
현재 arr 배열에 i가 담김과 동시에 
다음 재귀에서는 i값보다 1이 큰 수부터 탐색하도록 함과 동시에 
depth 또한 1 증가시키면서 재귀호출을 해주면 

다음 재귀에서는 at 은 이전 재귀보다 1이 큰 상태가 되고, 
반복문에서 결과적으로 이전 값보다 큰 수부터 탐색하게 된다.

이전 문제와 달리 중복방문인지를 고려할 필요가 없으므로 
boolean 배열로 중복 여부를 체크할 필요 또한 없다. 

차피 재귀 과정에서 만약 모든 배열에 채우지 못하는 경우에는 depth == M 이 될 수 없게되고, 
반복문이 먼저 끝나기 때문에 자동으로 걸러지게 된다.
*/