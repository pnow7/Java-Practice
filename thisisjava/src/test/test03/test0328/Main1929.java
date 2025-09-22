package test.test03.test0328;

/*
소수구하기

[입력]
3 16

[출력]
3
5
7
11
13
 */
import java.io.*;
import java.util.*;
public class Main1929 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[2];
		
		for(int i = 0; i < 2; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int j = num[0]; j <= num[1]; j++) {
			if(isPrime(j)) {
				bw.write(j+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
		
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
