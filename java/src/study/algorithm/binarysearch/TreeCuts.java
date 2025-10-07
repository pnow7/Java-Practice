package study.algorithm.binarysearch;

/*

[입력]
4 7
20 15 10 17

5 20
4 42 40 26 46

[출력]
15

36

*/

import java.io.*;
import java.util.*;
public class TreeCuts {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(binarySearch(arr, M));
		br.close();
		
	}
	
	static int binarySearch(int[] arr, int M) {
		int lo = 0;
		int hi = arr[arr.length - 1];
		int maxHeight = 0;
		
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			
			long heightCheck = 0;
			for (int tree : arr) {
				heightCheck += Math.max(0, (long) tree - mid);	
			}
			
			if (heightCheck >= M) {
				maxHeight = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		
		return maxHeight;
	}
	
}

/*

Step	lo	hi	mid	treeSum 계산				treeSum		M=7과 비교			동작				maxHeight
0		0	20	-	초기 상태					0
1		0	20	10	(0) + 5 + 7 + 10		22			22≥7 (충분)	maxHeight=10, lo=11		10
2		11	20	15	(0) + 0 + 2 + 5			7			7≥7 (충분)	maxHeight=15, lo=16		15
3		16	20	18	(0) + (0) + (0) + 2		2			2<7 (부족)	hi=17					15
4		16	17	16	(0) + (0) + 1 + 4		5			5<7 (부족)	hi=15					15
5		16	15	-	-	-	-	루프 종료! (lo>hi)	15

*/