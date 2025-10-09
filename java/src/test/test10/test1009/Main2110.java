package test.test10.test1009;

/*

[입력]
5 3
1
2
8
4
9

[출력]
3

*/

import java.io.*;
import java.util.*;
public class Main2110 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		System.out.println(binarySearch(arr, C));
		br.close();
	}
	
	static int binarySearch(int[] arr, int C) {
		int lo = 1;
		int hi = arr[arr.length - 1] - arr[0];
		int maxLen = 0;
		
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			int installCount = 1;
			int lastInstalledPosition = arr[0];
			
			for (int i = 1;i < arr.length; i++) {
				if (arr[i] - lastInstalledPosition >= mid) {
					installCount++;
					lastInstalledPosition = arr[i];
				}
			}
			
			if (installCount >= C) {
				maxLen = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		
		return maxLen;
	}
	
}
