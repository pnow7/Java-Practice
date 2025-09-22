package study.algorithm.search;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {1, 5, 6, 3, 2, 11, 0, -1, 10, 12, 8};
		//0부터 length-1(배열길이)
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] tmp = new int[arr.length];
		int i = left;
		int j = mid + 1;
		int k = left;
		
		while(i <= mid && j <= right) {
			if(arr[i] <= arr[j]) {
				tmp[k++] = arr[i++];
			}
			else {
				tmp[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			tmp[k++] = arr[i++];
		}
		
		while(j <= right) {
			tmp[k++] = arr[j++];
		}
		
		for(int index = left; index < k; index++) {
			arr[index] = tmp[index];
		}
	}
}
