package test.test03.test0300;

import java.util.Scanner;
public class Main15___ { //작은숫자부터 큰숫자로 수 정렬하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			if(num[0]>num[i]) {
				num[0] = num[i];
				num[i] = num[0];
			}
		}
		for(int j = 0; j < N; j++) {
			System.out.println(num[j]);
		}

	}

}
