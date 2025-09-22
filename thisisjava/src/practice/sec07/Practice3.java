package practice.sec07;

import java.util.Scanner;
public class Practice3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random()*3); //(Math.random())

		System.out.print("가위, 바위, 보 게임 시작 : ");
		String man = sc.nextLine();
		String[] com1 = new String[1];
		
		if(com == 0) {
			com1[0] = "가위";
		}
		else if(com == 1) {
			com1[0] = "바위";
		}
		else {
			com1[0] = "보";
		}
		
		if(man.equals(com1[0])) { //같은 경우 
			System.out.println("사용자 : "+man);
			System.out.println("컴퓨터 : "+com1[0]);
			System.out.println("결과 -> 비김");
		}
		else if(!man.equals(com1[0])) { // 다른 경우
			if(man.equals("가위")) { //내가 가위
				if(com1[0].equals("바위")){
					System.out.println("사용자 : "+man);
					System.out.println("컴퓨터 : "+com1[0]);
					System.out.println("결과 -> 컴퓨터가 이김");
				}
				else {
					System.out.println("사용자 : "+man);
					System.out.println("컴퓨터 : "+com1[0]);
					System.out.println("결과 - > 사용자가 이김");
				}
			}
			else if(man.equals("바위")) { //내가 바위
				if(com1[0].equals("가위")){
					System.out.println("사용자 : "+man);
					System.out.println("컴퓨터 : "+com1[0]);
					System.out.println("결과 -> 사용자가 이김");
				}
				else {
					System.out.println("사용자 : "+man);
					System.out.println("컴퓨터 : "+com1[0]);
					System.out.println("결과 -> 컴퓨터가 이김");
				}
			}
			else { //내가 보
				if(com1[0].equals("가위")){
					System.out.println("사용자 : "+man);
					System.out.println("컴퓨터 : "+com1[0]);
					System.out.println("결과 -> 컴퓨터가 이김");
				}
				else {
					System.out.println("사용자 : "+man);
					System.out.println("컴퓨터 : "+com1[0]);
					System.out.println("결과 -> 사용자가 이김");
				}
			}
		}
		sc.close();
	}
}
