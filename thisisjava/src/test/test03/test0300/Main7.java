package test.test03.test0300;

import java.util.Scanner;
public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		int result;
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			num[i] = sc.nextInt();

		}
		result = sc.nextInt();
		for(int j = 0; j<N; j++) {
			if(result == num[j]) {
				sum = sum + 1;
			}
		}
		System.out.println(sum);


	}

}
