package test.test06.test0606;

import java.io.*;

public class Main24416 {
	
	static int count = 0;
	static int count1 = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		fib(n);
		fibonacci(n);
		
		System.out.print(count + " " + count1);
		
		br.close();
	}
	
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			count++;
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2); 
		}
	}
	
	public static int fibonacci(int n) {	
		int[] f = new int[n + 1];
		f[1] = 1;
		f[2] = 1;
		
		for(int i = 3; i <= n; i++) {
			count1++;
			f[i] = f[i - 1] + f[i -2];
		}
		
		return f[n];
	}
}
