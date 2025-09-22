package practice.sec05;

import java.util.Scanner;
public class practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int money1 = 0;
		int money2 = 0;
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("");
			
			System.out.print("선택> ");
			String st1 = sc.nextLine();
			int select = Integer.parseInt(st1);
			
			if(select == 1) {
				System.out.print("예금액>");
				String st2 = sc.nextLine();
				money1 = Integer.parseInt(st2);
				System.out.println("");
				sum += money1; 
			}
			else if(select == 2) {
				System.out.print("출금액>");
				String st3 = sc.nextLine();
				money2 = Integer.parseInt(st3);
				System.out.println("");
				sum -= money2;
			}
			else if(select == 3) {
				System.out.print("잔고>");
				System.out.println(sum);
				System.out.println("");
			}
			else if(select == 4){
				System.out.println("");
				System.out.println("프로그램 종료");
				System.out.println("");
				break;
			}
			else {
				System.out.println("");
				System.out.println("1~4번만 골라주세요");
				System.out.println("");
			}
		}

	}
}
