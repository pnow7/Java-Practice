package test.test04.test0421;
/*
오늘도 서준이는 병합 정렬 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

N개의 서로 다른 양의 정수가 저장된 배열 A가 있다. 병합 정렬로 배열 A를 오름차순 정렬할 경우 배열 A에 K 번째 저장되는 수를 구해서 우리 서준이를 도와주자.

크기가 N인 배열에 대한 병합 정렬 의사 코드는 다음과 같다.

[입력]
5 7
4 5 1 3 2

[출력]
3
 */

import java.io.*;
import java.util.*;

public class FMain24060 {
	int A[];
	static int[] tmp;
	static int result = -1;
	static int count;
	static int K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		tmp = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(A, 0, N-1);
		System.out.println(result);
		
	}
	
	//p(처음), q(중간), r(끝) 
	public static void merge_sort(int[] A, int p, int r) {
		if(count > K) return;
		if(p < r) {
			int q = (p+r)/2;
			merge_sort(A, p, q);
			merge_sort(A, q + 1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(A[i] <= A[j]) {
				tmp[t++] = A[i++];

			}
			else {
				tmp[t++] = A[j++];
			}
		}
		while(i <= q) {
			tmp[t++] = A[i++];
		}
		while(j <= r) {
			tmp[t++] = A[j++];
		}

		t = 0;
		i = p;
		
		while(i <= r) {
			count++;
			if(count == K) {
				result = tmp[t];
			}
			
			A[i++] = tmp[t++];
		}
	}
	
}
