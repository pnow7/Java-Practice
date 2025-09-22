package study.algorithm.search;
/*
다리놓기


3
2 2
1 5
13 29

1
5
67863915
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Combination1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int[] result1 = new int[T];
		//Long보다 값이 커질대 BigInteger써야한다
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			BigInteger  result = factorial(M)
								  .divide(factorial(M-N).multiply(factorial(N)));
			sb.append(result).append("\n");
			
			result1[i] = BC(M,N);
		}
		
		bw.write(sb+"");
		
		for(int i : result1) {
			bw.write(i+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static BigInteger factorial(int num) {
		if(num == 0 || num == 1) {
			return BigInteger.ONE;
		}
		return new BigInteger(""+num).multiply(factorial(num-1));
	}
	
	public static int BC(int n, int k) {
		if(n == k || k == 0) {
			return 1;
		}

		return BC(n - 1, k - 1) + BC(n - 1, k);
	}

}
