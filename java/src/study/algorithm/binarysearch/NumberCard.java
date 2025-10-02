package study.algorithm.binarysearch;

/* 숫자카드

5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

*/

import java.io.*;
import java.util.*;

public class NumberCard {

	static int N, M;
	static int[] num1;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		num1 = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			num1[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num1);
		
		M = Integer.parseInt(br.readLine());
		
		int num2;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			num2 = Integer.parseInt(st.nextToken());
			bw.write(BinarySearch(num2) + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int BinarySearch(int num) {
		int low = 0;
		int high = N - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			int middleValue = num1[mid];
			
			if(middleValue > num) {
				high = mid - 1;
			}
			else if(middleValue < num) {
				low = mid + 1;
			}
			else {
				return 1;
			}
		}

		return 0;
	}

}

//	public static int BinarySearch1(int[] arr, int key) {
//		int lo = 0; 
//		int hi = arr.length-1;
//		
//		//이진탐색에서는 lo <= hi
//		while(lo <= hi) {
//			int mid = (lo + hi) / 2;
//			
//			if(arr[mid] > key) {
//				hi = mid - 1;
//			}
//			else if(arr[mid] < key) {
//				lo = mid + 1;
//			}
//			else {
//				return mid;
//			}
//		}
//		return 0;
//	}

