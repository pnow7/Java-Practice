package study.algorithm.binarysearch;

/*
- 공유기 설치

도현이의 집 N개가 수직선 위에 있다. 각각의 집의 좌표는 x1, ..., xN이고, 
집 여러개가 같은 좌표를 가지는 일은 없다.

도현이는 언제 어디서나 와이파이를 즐기기 위해서 집에 공유기 C개를 설치하려고 한다. 
최대한 많은 곳에서 와이파이를 사용하려고 하기 때문에, 한 집에는 공유기를 하나만 설치할 수 있고, 
가장 인접한 두 공유기 사이의 거리를 가능한 크게 하여 설치하려고 한다.

C개의 공유기를 N개의 집에 적당히 설치해서, 
가장 인접한 두 공유기 사이의 거리를 최대로 하는 프로그램을 작성하시오.

첫째 줄에 가장 인접한 두 공유기 사이의 최대 거리를 출력한다.

[입력]
5 3
1
2
8
4
9

[출력]
3

공유기를 1, 4, 8 또는 1, 4, 9에 설치하면 
가장 인접한 두 공유기 사이의 거리는 3이고, 
이 거리보다 크게 공유기를 3개 설치할 수 없다.
*/

import java.io.*;
import java.util.*;

public class B_Install_IpTime {
	
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
	
    // 값 찾기
	static int binarySearch(int[] arr, int C) {
		int lo = 1;
		int hi = arr[arr.length - 1] - arr[0];
		int maxLen = 0;
		
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			int installCount = 1;
			int lastInstalledPosition = arr[0];
			
			for (int i = 0;i < arr.length; i++) {
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
