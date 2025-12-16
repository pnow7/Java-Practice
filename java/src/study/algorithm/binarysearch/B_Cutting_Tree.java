package study.algorithm.binarysearch;

/*
- 나무 자르기

상근이는 나무 M미터가 필요하다.

상근이는 절단기에 높이 H를 지정해야 한다. 
높이를 지정하면 톱날이 땅으로부터 H미터 위로 올라간다. 
그 다음, 한 줄에 연속해있는 나무를 모두 절단해버린다. 
따라서, 높이가 H보다 큰 나무는 H 위의 부분이 잘릴 것이고, 
낮은 나무는 잘리지 않을 것이다.

예를 들어, 한 줄에 연속해있는 나무의 높이가 20, 15, 10, 17이라고 하자. 
상근이가 높이를 15로 지정했다면, 나무를 자른 뒤의 높이는 15, 15, 10, 15가 될 것이고, 
상근이는 길이가 5인 나무와 2인 나무를 들고 집에 갈 것이다. (총 7미터를 집에 들고 간다) 
절단기에 설정할 수 있는 높이는 양의 정수 또는 0이다.

나무를 필요한 만큼만 집으로 가져가려고 한다. 
이때, 적어도 M미터의 나무를 집에 가져가기 위해서 
절단기에 설정할 수 있는 높이의 최댓값을 구하는 프로그램을 작성하시오.

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

public class B_Cutting_Tree {

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
    
	// 값 찾기
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

Step	lo	hi	mid		treeSum 계산			treeSum			M=7과 비교			동작				maxHeight
0		0	20	-	초기 상태													0
1		0	20	10	(0) + 5 + 7 + 10			22			22≥7 (충분)		maxHeight=10, lo=11		10
2		11	20	15	(0) + 0 + 2 + 5			7			7≥7 (충분)		maxHeight=15, lo=16		15
3		16	20	18	(0) + (0) + (0) + 2		2			2<7 (부족)			hi=17				15
4		16	17	16	(0) + (0) + 1 + 4		5			5<7 (부족)			hi=15				15
5		16	15	-	-	-	-	루프 종료! (lo>hi)	15

*/