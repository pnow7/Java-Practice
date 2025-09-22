package practice.sec04;

public class practice6 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5)); 
		//and 연산 둘 다 참이여야 true, x가 7보다 크고(참) y는 5보다 작거나 같다(참) -> 참(true)
		System.out.println((x%3 == 2) || (y%2) != 1); 
		//or 연산 둘 중 하나만 참이면 참, x%3 == 1이여야 참인데 x%3 == 2라서 거짓, y%2==1이 참인데 !=라서 거짓 -> 둘다 거짓이라서 거짓(false)
	}

}
