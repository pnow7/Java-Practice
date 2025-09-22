package test.test03.test0306;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main2444 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N-i; j++) {
				System.out.print(" ");
			}
			for(int k = N-i; k < N+i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");	
		}
		for(int i = 1; i < N; i++) {
			for(int j = N-i; j < N; j++) {
				System.out.print(" ");
			}
			for(int k = i+1; k <= 2*N-(i+1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
