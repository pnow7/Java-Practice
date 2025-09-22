package object_oriented_practice.ch06_star.test;

import java.io.*;
import java.util.*;
public class Bank {
	
	private String number;
	private String name;
	private int money;
	
	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	
	public Bank(String number, String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}
	
	//예금
	public void deposit(int amount) {
		money += money;
	}
	
	//출금
	public boolean withdraw(int amount) {
		if(money >= amount) {
			money -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	//계좌번호 찾기
	public static Bank findAccount(List<Bank> list, String number) {
		for(Bank acc : list) {
			if(acc.getNumber().equals(number)) {
				return acc;
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Bank> bankList = new ArrayList<>();
		
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			
			int choice = Integer.parseInt(br.readLine());
			System.out.println("---------------");
			
			if(choice == 1) {
				System.out.println("계좌생성");
				System.out.println("---------------");
				System.out.println("계좌번호:");
				String number = br.readLine();
				
				// 중복 검사
                if (findAccount(bankList, number) != null) {
                    System.out.println("이미 존재하는 계좌번호입니다.");
                    continue;
                }
				
				System.out.println("계좌주:");
				String name = br.readLine();
	
				System.out.println("조기입금액:");
				int money = Integer.parseInt(br.readLine());
				
				Bank newAccount = new Bank(number, name, money);
				bankList.add(newAccount);
				
				System.out.println("계좌가 생성되었습니다.");
			}
			else if(choice == 2) {
				System.out.println("계좌목록");
				System.out.println("---------------");
				for(Bank acc : bankList) {
					System.out.println(acc.getNumber() + "\t" + acc.getName() + "\t" + acc.getMoney());
				}
			}
			else if(choice == 3) {
				System.out.println("예금");
				System.out.println("---------------");
				System.out.println("계좌번호:");
				String number = br.readLine();
				
				Bank acc = findAccount(bankList, number);
				if(acc != null) {
					System.out.println("예금액:");
					int money = Integer.parseInt(br.readLine());
					acc.deposit(money);
					System.out.println("입금이 완료되었습니다.");
				} else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
			}
			else if(choice == 4) {
				System.out.println("출금");
				System.out.println("---------------");
				System.out.println("계좌번호:");
				String number = br.readLine();
				
				Bank acc = findAccount(bankList, number);
				if(acc != null) {
					System.out.println("출금액:");
					int money = Integer.parseInt(br.readLine());
					if(acc.withdraw(money)) {
						System.out.println("출금이 완료되었습니다.");
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
			}
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}

}
