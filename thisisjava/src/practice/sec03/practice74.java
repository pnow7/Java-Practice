package practice.sec03;

import java.util.Scanner;
public class practice74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = a/100;
		int cm = a%100;
		System.out.println(a+"cm는 " + m + "m " + cm + "cm입니다");

	}

}
