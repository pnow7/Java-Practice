package practice.sec03;

import java.util.Scanner;
public class practice15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("*****");
		}
		
		System.out.print("-------------------\n");
		
		String star = "*";
		for(int j = 1; j <= 5; j++) {
			System.out.println(star);
			star += "*";
		}
		
		System.out.print("-------------------\n");
		
		String star1 = "*";
		for(int k = 1; k <= 5; k++) {
			for(int M = 1; M <= 5-k; M++) {
				System.out.print(" ");	
			}
			for(int N = 5-k; N < 5; N++) {
				System.out.print(star1);
			}
			System.out.println("");
		}

	}

}
