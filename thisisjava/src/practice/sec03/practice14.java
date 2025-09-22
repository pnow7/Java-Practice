package practice.sec03;

import java.util.Scanner;
public class practice14 {

	public static void main(String[] args) {
		System.out.println("정보를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String Email = sc.nextLine();
		String num = sc.nextLine();
		System.out.println("명함");
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + Email);
		System.out.println("핸드폰 번호 : " + num);
	}

}
