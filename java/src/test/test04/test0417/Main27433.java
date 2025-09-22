package test.test04.test0417;

import java.io.*;
import java.math.BigInteger;
public class Main27433 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));
		br.close();
	}
	
	public static BigInteger factorial(int num) {
		if(num == 0 || num == 1) return BigInteger.ONE;

		return new BigInteger(""+num).multiply(factorial(num-1));
	

	}
}
