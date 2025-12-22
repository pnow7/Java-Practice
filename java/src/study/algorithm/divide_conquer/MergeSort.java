package study.algorithm.divide_conquer;

/*
- 알고리즘 수업 - 병합 정렬 1 

오늘도 서준이는 병합 정렬 수업 조교를 하고 있다. 
아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

N개의 서로 다른 양의 정수가 저장된 배열 A가 있다. 
병합 정렬로 배열 A를 오름차순 정렬할 경우 배열 A에 K 번째 저장되는 수를 구해서 우리 서준이를 도와주자.

크기가 N인 배열에 대한 병합 정렬 의사 코드는 다음과 같다.
(K번째 저장되는 값을 찾는 문제)

[입력]
5 7
4 5 1 3 2

[출력]
3

*/

import java.io.*;
import java.util.*;

public class MergeSort {
	
	static int[] tmp; 
	static int result = -1;
	static int count;
	static int K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		tmp = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, N-1);
		System.out.println(result);
		
	}
	
	// 이미 K번째 저장된 값을 찾았다면, 더 이상 정렬할 필요가 없음
	public static void mergeSort(int[] arr, int left, int right) {
		if (count >= K) return;
		
		if (left < right) {
			int mid = (left + right) / 2; 
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right); 
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = 0;
		
		// 정렬된 두 부분 배열을 tmp에 병합
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				tmp[k++] = arr[i++];
			} else {
				tmp[k++] = arr[j++];
			}
		}
		
		// 남은 왼쪽 배열 복사
		while (i <= mid) {
			tmp[k++] = arr[i++];
		}
		
		// 오른쪽 배열 복사
		while (j <= right) {
			tmp[k++] = arr[j++];
		}

		// tmp에서 arr로 결과 저장
		// K번째 저장 값 체크 
		k = 0;
		i = left;
		
		while (i <= right) {
			count++;
			
			// K번째 저장되는 값 기록
			if (count == K) {
				result = tmp[k]; 
			}
			
			// tmp 배열의 값을 arr 배열의 원래 위치에 저장
			arr[i++] = tmp[k++]; 
		}
	}
	
}