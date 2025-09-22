package test.test;

import java.io.*;

public class RouletteGame {
	
	private String gameId;
	private String storeName;
	private int totalScore;
	private int success;
	private int fail;
	private int remainTry;
	private int money;
	private boolean isCharged;
	
	public RouletteGame(String gameId, String storeName) {
		this.gameId = gameId;
		this.storeName = storeName;
		this.totalScore = 0;
		this.success = 0;
		this.fail = 0;
		this.remainTry = 0;
		this.money = 0;
		this.isCharged = false;
		
	}
	
	//충전
	public void charged(BufferedReader br) throws IOException {
		if(isCharged) {
			System.out.println("이미 충전되어 있어 추가 충전이 불가 합니다.");
			return;
		}
		
		System.out.println("충전 할 금액을 입력하세요.");
		int coin = Integer.parseInt(br.readLine());
		
		if(coin % 1000 != 0) {
			System.out.println("1000원 단위로 입력하세요.");
			return;
		}
		
		remainTry = coin / 500;
		System.out.println("충전완료! \n충전금액 : " + coin + " 잔여횟수 : " + remainTry);
		isCharged = true;
		
		money += coin;
	}
	
	//게임시작
	public void gameStart() {
		
		System.out.println("충전된 횟수 : " + remainTry);
		
		if(remainTry == 0) {
			System.out.println("충전된 횟수가 없습니다. 금액을 충전해주세요");
			return;
		}
		
		while(remainTry > 0) {
			int score = (int)(Math.random()*6 + 1);
			
			if(1 <= score && score <= 4 ) {
				success++;
				totalScore += score;
				System.out.println("성공! 점수 : " + score);
			}else {
				fail++;
				System.out.println("실패! 점수 : " + score);
			}
			
			remainTry--;
		}
		System.out.println("실패 횟수 : " + fail + " 성공 횟수 : " + success + " 총 점수 : " + totalScore);
		
		success = 0;
		fail = 0;
		totalScore = 0;
		remainTry = 0;
		
	}
	
	public boolean gameEnd() throws IOException {
			
		if(remainTry > 0) {
			System.out.println("충전된 횟수가 있으므로 마감 불가!");
			return false;
		} 
		
		if(money == 0) {
			System.out.println("마감 금액이 없으므로 마감 불가!");
			 return false;
		}
		
		System.out.println("마감! 마감 금액 : " + money);
		return true;
	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		RouletteGame game = new RouletteGame("guswo", "humanPcRoom");
		
		while(true) {
			System.out.println("1. 충전, 2. 게임시작, 3. 마감");
			int choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
				case 1:
					game.charged(br);
					break;

				case 2:
					game.gameStart();
					break;

				case 3:
					if(game.gameEnd()) return;
					break;
					
				default :
					System.out.println("1, 2, 3번 중 하나를 선택해주세요!");
					
			}
			
			
		}
		
	}
}