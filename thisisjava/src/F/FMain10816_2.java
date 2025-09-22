package F;
/*
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
*/

//정렬한다음 중간지점을 찾아 처음과 끝 길이를 구하여 배열에 쳐집어넣음

import java.io.*;
import java.util.*;
public class FMain10816_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(upperBound(num, target) - lowerBound(num, target)).append(" ");		
		}
		bw.write(sb+"");
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int lowerBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (hi+lo)/2;
			
			if(key <= arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	
	public static int upperBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (hi+lo)/2;
			//조심하기 <= 아님 < 이거임
			if(key < arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	
	public static int BinarySearch(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo <= hi) {
			int mid = (hi+lo)/2;
			
			if(key < arr[mid]) {
				hi = mid - 1;
			}
			else if(key > arr[mid]) {
				lo = mid + 1;
			}
			else {
				return mid;
			}
		}
		return 0;
	}
	
}	





























	