package object_oriented_practice.ch06_star.test.bank;

import java.util.*;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				createAccount();
			}
			else if(choice == 2) {
				accountList();
			}
			else if(choice == 3) {
				deposit();
			}
			else if(choice == 4) {
				withdraw();
			}
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}
	
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.println("계좌번호:");
		String number = sc.next();
		
		System.out.println("계좌주:");
		String name = sc.next();
		
		System.out.println("초기입금액:");
		int money = sc.nextInt();
		
		Account newAccount = new Account(number, name, money);
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			
			if(account != null) {
				System.out.println(account.getNumber() + "\t" + account.getName() + "\t" + account.getMoney());
			}
		}
		
	}
	
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		System.out.println("계좌번호:");
		String number = sc.next();
		
		System.out.println("예금액:");
		int money = sc.nextInt();
		
		Account account = findAccount(number);
		
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		
		account.setMoney(account.getMoney() + money);
		System.out.println("결과: 입금이 성공되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		
		System.out.println("계좌번호:");
		String number = sc.next();
		
		System.out.println("출금액:");
		int money = sc.nextInt();
		
		Account account = findAccount(number);
		
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
		}
		
		account.setMoney(account.getMoney()-money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	private static Account findAccount(String number) {
		Account account = null;
		
		for(int i = 0; i < accountArray.length; i++) {
			
			if(accountArray[i] != null) {
				String dbnumber = accountArray[i].getNumber();
				
				if(dbnumber.equals(number)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
