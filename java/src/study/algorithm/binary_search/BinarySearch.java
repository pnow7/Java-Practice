package study.algorithm.binary_search;

import java.io.*;

public class BinarySearch {

	private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("배열에서 값의 순서를 찾기위해 값을 입력하세요: ");
		
		int N = Integer.parseInt(br.readLine());
		int index = binarySearch(arr, 0, 9, N);
		
		System.out.println(index == -1 ? "찾는 값 순서에 없음" : "찾는 값 순서: " + (index + 1));
		br.close();
	}
	
	// 재귀 방식 (값 찾기)
	private static int binarySearch(int[] arr, int lo, int hi, int target) {
		int mid = (lo + hi) / 2;
		
		if (lo > hi) return - 1;
		
		if (arr[mid] == target) return mid;
		
		if (arr[mid] < target) {
			return binarySearch(arr, mid + 1, hi, target);
		} else  {
			return binarySearch(arr, lo, mid - 1, target);
		}
	}
}


/*

1. 최솟값 (Lower Bound) 또는 특정 인덱스 찾기
목표: 배열에서 Target 값 이상인 첫 번째 요소의 인덱스 (최솟값)를 찾을 때.

예시: 정렬된 배열 [1, 3, 3, 5]에서 3 이상인 첫 번째 요소의 인덱스(1) 찾기.

	요소							설정								이유 (최솟값/인덱스)
mid 계산							mid = (lo + hi) / 2 (하한)	하한 mid로 충분히 안정적
while 조건						while (lo < hi)				lo와 hi가 같아지면 루프 종료 (정답이 lo 또는 hi임)
성공 시 (midValue >= Target)		hi = mid						mid가 답이 될 가능성이 있으므로 mid를 포함하여 왼쪽으로 탐색 영역 축소
실패 시 (midValue < Target)		lo = mid+1					mid는 답이 될 수 없으므로 mid를 제외하고 오른쪽으로 탐색 영역 확대

------------------------------------------------------------------------------------------------------------------

2. 최댓값 (Upper Bound) 찾기: Cutting Tree 방식
목표: 특정 조건을 만족하는 값 중에서 가장 큰 값을 찾을 때.

예시: M을 만족하는 절단기 높이 H의 최댓값 (2805번)

	요소							설정								이유 (최댓값)
mid 계산						mid = (lo + hi) / 2 (하한)		하한 mid로 충분히 안정적
while 조건					while (lo <= hi)					lo와 hi가 같을 때도 한 번 더 검토하여 마지막 후보를 놓치지 않음
성공 시 (조건 True)			max = mid, lo = mid + 1			mid를 답으로 저장하고 mid를 제외하며 더 높은 곳으로 탐색
실패 시 (조건 False)					   hi = mid − 1			mid는 너무 크니 mid를 제외하며 아래로 탐색 영역 축소

------------------------------------------------------------------------------------------------------------------

mid = (hi + lo) / 2 (고정)

	목표			while 조건		조정 (성공 시)						정답 저장 방식
최솟값/인덱스		lo < hi			hi = mid, lo = mid + 1		루프 종료 후 lo 반환
최댓값(2805)		lo ≤ hi			hi = mid - 1, lo = mid+1		루프 내부에서 maxHeight 갱신 후 반환

*/
