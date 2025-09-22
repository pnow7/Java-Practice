package F;
 
//조합 구할때 쓰는 브루트포스
//n개 뽑을때 for문 n개 필요

import java.io.*;
import java.util.*;
public class FMain2798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		
		for(int i = 0; i < arr.length-2; i++) {
			for(int j = i + 1; j < arr.length-1; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum <= M && sum > result) {
						result = sum;
					}
					//if(sum <= M)
					//result = Math.max(result, sum); : M값을 넘지 않으면서 sum중에 가장 큰값을 result에 저장
					//Math.max(a, b) : a와 b중 큰 값 출력
				}
			}
		}
		
		System.out.println(result);
		
		br.close();

	}

}
