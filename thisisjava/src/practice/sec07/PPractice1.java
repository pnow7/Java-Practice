package practice.sec07;

import java.util.Scanner;
public class PPractice1 {
//오름차순
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int x = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
	
		for(int j = 0; j < num.length; j++) {
			for(int k = j; k < num.length; k++) {
				if(num[j] > num[k]) {
					x = num[j];  
					num[j] = num[k];
					num[k] = x;
				}
			}
		}
		
		for(int m = 0; m < num.length; m++) {
			System.out.print(num[m]+" ");
		}
		sc.close();
		
	}

}
