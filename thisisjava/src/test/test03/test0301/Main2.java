package test.test03.test0301;

import java.util.Scanner;

public class Main2 { //25304 영수증

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int money = sc.nextInt();
			int ea = sc.nextInt();
			sum = sum + (money * ea);
		}
		
		if(total == sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}


	}

}