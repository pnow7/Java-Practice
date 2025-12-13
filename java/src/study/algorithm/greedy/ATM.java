package study.algorithm.greedy;

/*
- ATM (11399)

은행 ATM 앞에 N명의 사람들이 줄을 서 있습니다. 
각 사람은 ATM에서 돈을 인출하는 데 걸리는 시간이 다릅니다.

사람들이 돈을 인출하기 위해 기다리는 시간과 
인출하는 시간을 모두 합한 총 대기 시간을 최소로 만드는 것입니다.

=> 결론적으로, 인출 시간이 짧은 사람부터 먼저 처리하는 것이
총 대기 시간을 최소화하는 가장 최적의 방법입니다.

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
