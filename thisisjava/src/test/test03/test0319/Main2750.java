package test.test03.test0319;

import java.io.*;
public class Main2750 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int x = 0;
		
		
		for(int i = 0; i < N; i ++) {
			num[i] = Integer.parseInt(br.readLine());	
		}

		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(num[i] > num[j]) {
					x = num[j];
					num[j] = num[i];
					num[i] = x;
				}
			}
		}
		
		for(int i = 0; i < N; i ++) {
			System.out.println(num[i]);
		}
		br.close();
	}

}
