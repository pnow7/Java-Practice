package study.algorithm.greedy;

public class CoinChange {
	
	 public static void main(String[] args) {
        int[] coinValues = {500, 100, 50, 10}; 					// 동전 종류
        int change = 1260; 										// 거스름돈
        int coinCount = 0; 										// 동전 개수

        for (int coin : coinValues) {
        		int count = change / coin;							// 현재 동전으로 거슬러 줄 수 있는 최대 개수 계산

        		coinCount += count;
            change %= coin;										// 남은 거스름돈 계산

            System.out.println(coin + "원짜리 " + count + "개");
        }
        
        System.out.println("총 동전 개수: " + coinCount + "개");
    }
	 
}
