package study.algorithm.search;
/*
-다리놓기

3
2 2
1 5
13 29

1
5
67863915

*/
import java.io.*;
import java.util.*;
import java.math.*;

public class BigIntegerFactorial {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		//Long보다 값이 커질대 BigInteger써야한다
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			BigInteger  result = factorial(M)
								  .divide(factorial(M-N).multiply(factorial(N)));
			sb.append(result).append("\n");
		}
		
		bw.write(sb+"");
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static BigInteger factorial(int num) {
		BigInteger result = BigInteger.ONE;
		for(int i = 2; i <= num; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
//	public static BigInteger factorial(int num) {
//		if(num == 0 || num == 1) {
//			return BigInteger.ONE;
//		}
//		return new BigInteger(""+num).multiply(factorial(num-1));
//	}

}
