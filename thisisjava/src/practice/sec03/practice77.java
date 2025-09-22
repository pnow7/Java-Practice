package practice.sec03;

import java.util.Scanner;
public class practice77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = (a+b+c)/3;
		System.out.println("국어 : "+a+" 영어 : "+b+" 수학 : "+c+" 평균 : "+result);
	}

}
