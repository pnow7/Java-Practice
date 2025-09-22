package study.algorithm.isPrime;

public class IsPrime1 {

	public static void main(String[] args) {
		//소수판별
		System.out.println(isPrime(2));
		
	}
	
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
