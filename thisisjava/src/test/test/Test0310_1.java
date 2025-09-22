package test.test;

import java.util.Scanner;

class Batter {
	private String name;
	private int hits;
	private int atBats;
	
	public Batter(String name) {
		this.name = name;
		this.hits = 0;
		this.atBats = 0;
	}
	
	public void recordAtBats(boolean isHit) {
		atBats++;
		if(isHit) {
			hits++;
		}
	}
	
	public double getAverage() {
		return atBats == 0 ? 0.0 : (double) hits / atBats;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHits() {
		return hits;
	}
	
	public int getAtBats() {
		return atBats;
	}
}

class Game {
	private Batter[] batters = new Batter[9];
	private Scanner sc = new Scanner(System.in);
	private int currentBatterIndex = 0;
	
	public void setupBatters() {
		System.out.println("타자 9명 등록 해주세요");
		
		for(int i = 0; i < batters.length; i++) {
			System.out.println((i+1) + "번째 타자 이름 : ");
			String name = sc.nextLine();
			batters[i] = new Batter(name);
		}
	}
	
	public void play() {
		setupBatters();
		
		for(int inning = 1; inning <= 3; inning ++) {
			System.out.println("\n[" + inning + "회 시작]");
			int outs = 0;
			
			while(outs < 3) {
				Batter batter = batters[currentBatterIndex % 9];
				System.out.println((currentBatterIndex % 9 + 1) + "번 타자 " + batter.getName() + "숫자 입력 (1 ~ 10): ");
				int useGuess = Integer.parseInt(sc.nextLine());
				int randomPitch = (int)(Math.random() * 10 + 1);
				
				if(useGuess == randomPitch) {
					batter.recordAtBats(true);
					System.out.println("안타!");
				} else {
					batter.recordAtBats(false);
					outs++;
					System.out.println("아웃 ! (총 아웃 : " + outs + ")");
				}
				
				currentBatterIndex++;
			}
			
			Results();
		}
		
	}
	
	public void Results() {
		System.out.println("\n===경기결과===");
		
		for(int i = 0; i < batters.length; i++) {
			Batter batter = batters[i];
			System.out.printf("타순 %d번 | 타자 이름 : %s | 타율 : %.3f | (%d안타 / %d타석)\n", 
					i + 1, 
					batter.getName(), 
					batter.getAverage(), 
					batter.getHits(), 
					batter.getAtBats()
			);
		}
	}
}


public class Test0310_1 {
	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}
}
