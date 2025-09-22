package test.test;

import java.util.*;

class BatterBatter {
	//타자 이름
	private String name;
	
	//안타
	private int hits;
	
	//타석
	private int sits;
	
	public BatterBatter(String name) {
		this.name = name;
		this.hits = 0;
		this.sits = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHits() {
		return hits;
	}
	
	public int getSits() {
		return sits;
	}
	
	
	public double getAverage() {
		return hits == 0 ? 0.0 : (double) hits / sits;
	}
	
	public void recordSits(boolean hit) {
		sits++;
		if(hit) {
			hits++;
		}
	}
}

class GameGame {
	
	private BatterBatter[] batters = new BatterBatter[9];
	private Scanner sc = new Scanner(System.in);
	private int batterIndex = 0;
	
	public void setBatter() {
		System.out.println("타자 9명을 등록해주세요");
		
		for(int i = 0; i < batters.length; i++) {
			System.out.println((i+1) + "번째 타자 이름 : ");
			String name = sc.nextLine();
			batters[i] = new BatterBatter(name);
		}
	}
	
	public void play() {
		setBatter();
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("\n" + i + "회 시작");
			int outs = 0;
			
			while(outs < 3) {
				BatterBatter batter = batters[batterIndex % 9];
				System.out.println("\n" + (batterIndex%9 + 1) + "번 타자 : " + batter.getName());
				System.out.println("숫자 입력(1 ~ 3) : ");
				
				int num = Integer.parseInt(sc.nextLine());
				int randomPitches = (int)(Math.random() * 3 + 1);
				
				if(num == randomPitches) {
					batter.recordSits(true);
					System.out.println("\n안타!");
				} else {
					batter.recordSits(false);
					outs++;
					System.out.println("\n아웃! 총 아웃 : " + outs);
				}
				
				batterIndex++;
				
			}
			results();
			
		}
			
	}
	
	public void results() {
		System.out.println("=====경기결과=====");
		for(int i = 0; i < batters.length; i++) {
			BatterBatter batter = batters[i];
			System.out.printf("타순 %d번 | 타자 이름 : %s | 타율 : %.3f | (%d안타 / %d타석)\n",
					i+1,
					batter.getName(),
					batter.getAverage(),
					batter.getHits(),
					batter.getSits()
			);
		}
		
	}
	
}


public class BaseBallGame {
	
	public static void main(String[] args) {
		GameGame game = new GameGame();
		game.play();
	}
}
