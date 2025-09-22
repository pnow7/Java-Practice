package object_oriented_practice.ch06_star.test;

public class Account {
	//19
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} 
		else if(balance < MIN_BALANCE) {
			this.balance = Math.abs(balance*10);
		} 
		else {
			this.balance = MAX_BALANCE;
		}
	}

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}
}
