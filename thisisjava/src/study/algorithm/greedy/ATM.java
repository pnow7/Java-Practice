package study.algorithm.greedy;

/*

[입력]
5
3 1 4 3 2

[출력]
32

*/

import java.io.*;
import java.util.*;

public class ATM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		int[] S = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int times = Integer.parseInt(st.nextToken());
			list.add(times);
		}
		
		Collections.sort(list);
		
		S[0] = list.get(0);
		for (int i = 1; i < N; i++) {
			S[i] = S[i - 1] + list.get(i);
		}
		
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			result += S[i];
		}
		
		System.out.println(result);
		br.close();
	}
	
}
