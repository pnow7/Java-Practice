package test.test03.test0300;

import java.util.Scanner;
public class Main14_1__ { //공백없이 입력하여 숫자합

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //N값 입력 ex)5
		String Snum = sc.next(); //그냥 문자열 입력 54321
		char[] Cnum = Snum.toCharArray(); //54321을 Cnum배열에 저장 
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum = sum + Cnum[i]-48; // char형이라 아스키코드 -48 하거나 문자'0'을 뺀다
		}
		System.out.println(sum);

	}

}
