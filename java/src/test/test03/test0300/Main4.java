package test.test03.test0300;

import java.util.Scanner;
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int i;
		int j = 0;
		
		for(i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(num[0] < num[i]) {
				num[0] = num[i];
				j = i;
			}
		}
		sc.close();
		
		System.out.println(num[0]);
		System.out.println(j+1);
	}
}
