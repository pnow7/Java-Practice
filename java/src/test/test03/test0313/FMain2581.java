package test.test03.test0313;

import java.io.*;

public class FMain2581 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N= Integer.parseInt(br.readLine());
		
		int sum = 0;
		int count = 0;
		int result = 0;
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) {
				count++;
				sum += i;
			}
		}
		if(count == 0) {
			System.out.println("-1");
		}
		else {
			for(int j = M; j <= N; j++) {
				if(isPrime(j)) {
					result = j;
					break;
				}
			}
			System.out.println(sum);
			System.out.println(result);
		}
		br.close();
	}
	
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}


