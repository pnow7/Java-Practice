package test.test03.test0313;

import java.io.*;
public class Main9506 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			int ea = 0;
			for(int i = 1; i < n; i++) {
				if(n%i == 0) {
					sum = sum + i; // 약수들의 총합
					ea++;
				}
			}
			
			int num[] = new int[ea];
			
			int count = 0;
			if(n == sum) {
				for(int i = 0; i < num.length; i++) {
					for(int j = 1+count; j < n; j++) {
						if(n%j == 0) {
							num[i] = j;
							count = j;
							break;
						}
					}
				}
				System.out.print(n + " = ");
				for(int k = 0; k < num.length; k++) {
					if(k == num.length-1) {
						System.out.println(num[k]);
						break;
					}
					else {
						System.out.print(num[k] + " + ");	
					}
				}
					
			}
			else if(n == -1) {
				break;
			}	
			else {
				System.out.println(n + " is NOT perfect.");
			}
		
		}
		br.close();

	}

}
