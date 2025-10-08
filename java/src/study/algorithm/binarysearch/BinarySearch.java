package study.algorithm.binarysearch;

public class BinarySearch {

}


/*

mid = (hi + lo) / 2 (고정)

	목표			while 조건		조정 (성공 시)			정답 저장 방식
최솟값/인덱스		lo < hi			hi = mid			루프 종료 후 lo 반환
최댓값 (2805)		lo ≤ hi			lo = mid+1			루프 내부에서 maxHeight 갱신 후 반환

*/
