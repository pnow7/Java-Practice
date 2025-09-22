package test.test03.test0302;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2439 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N-i; j++) {
				System.out.print(" ");
			}
			for(int k = N-i; k < N; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		br.close();
	}
}
