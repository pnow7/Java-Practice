package F;

import java.io.*;
import java.util.*;

public class FMain_10815 {
	static int N,M;
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
		int left = 0;
		int right = N-1;
		
		while(left <= right){
			int middle = (left + right)/2;
			int middleValue = num1[middle];
			
			if(num > middleValue) {
				left = middle + 1;
			}
			else if(num < middleValue) {
				right = middle -1;
			}
			else {
				return 1;
			}
		}
		return 0;
	}

}


/*import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int result = Arrays.binarySearch(numbers, target);
        if (result >= 0) {
            System.out.println("찾는 값의 인덱스: " + result);
        } else {
            System.out.println("값을 찾을 수 없음");
        }
    }
}*/

//public static boolean BinarySearch(int[] arr, int n, int left, int right) {
//	if(left < right) return false;
//	
//	int mid = (left+right)/2;
//	
//	if(n > arr[mid]) {
//		return BinarySearch(arr, n, mid+1, right);
//	}
//	else if(n < arr[mid]) {
//		return BinarySearch(arr, n, left, mid-1);
//	}
//	else {
//		return true;
//	}
//}