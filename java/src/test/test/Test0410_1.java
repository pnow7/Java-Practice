package test.test;

import java.io.*;

class GameMachine {
    private String gameId;
    private String storeName;
    private int totalPoint;
    private int success;
    private int fail;
    private int remainTry;
    private int totalSales;
    private boolean isCharged;

    public GameMachine(String gameId, String storeName) {
        this.gameId = gameId;
        this.storeName = storeName;
        this.totalPoint = 0;
        this.success = 0;
        this.fail = 0;
        this.remainTry = 0;
        this.totalSales = 0;
        this.isCharged = false;
    }

    public void charge(BufferedReader br) throws IOException {
        if (isCharged) {
            System.out.println("이미 충전되어 추가 충전이 불가합니다.");
            return;
        }

        System.out.println("충전할 금액을 입력하세요 (1000원 단위)");
        int sum = Integer.parseInt(br.readLine());

        if (sum % 1000 != 0) {
            System.out.println("1000원 단위로 입력하세요.");
            return;
        }

        remainTry = sum / 500;
        totalSales += sum;
        isCharged = true;

        System.out.println("충전 완료 - 현재금액: " + sum + " / 시도횟수: " + remainTry);
    }

    public void startGame() {
        if (remainTry == 0) {
            System.out.println("잔여 시도 없음. 충전 후 게임을 시작하세요.");
            return;
        }

        success = 0;
        fail = 0;
        totalPoint = 0;

        while (remainTry-- > 0) {
            int roulette = (int)(Math.random() * 6 + 1);
            if (roulette >= 1 && roulette <= 4) {
                System.out.println("룰렛 성공! 점수: " + roulette);
                totalPoint += roulette;
                success++;
            } else {
                System.out.println("룰렛 실패!");
                fail++;
            }
        }

        System.out.println("게임 종료!");
        System.out.println("성공 횟수: " + success + ", 실패 횟수: " + fail + ", 총합 점수: " + totalPoint);
        isCharged = false; // 게임 끝나면 다시 충전 가능
    }

    public boolean closeDay() {
        if (remainTry > 0) {
            System.out.println("충전된 시도가 남아있어 마감할 수 없습니다. 잔여 시도: " + remainTry);
            return false;
        }

        if (totalSales == 0) {
            System.out.println("매출이 없습니다. 마감할 수 없습니다.");
            return false;
        }

        System.out.println("오늘의 총 매출: " + totalSales);
        return true;
    }
}

public class Test0410_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		GameMachine test = new GameMachine("guswo", "human");
		
		while(true) {
			System.out.println("1.충전 | 2.게임시작 | 3.마감");
			int choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1:
				test.charge(br);
				break;
			case 2:
				test.startGame();
				break;
			case 3:
				if(test.closeDay()) return;
				break;
			default:
				System.out.println("1, 2, 3번 중 하나를 골라주세요");
			}
		}

	}

}
