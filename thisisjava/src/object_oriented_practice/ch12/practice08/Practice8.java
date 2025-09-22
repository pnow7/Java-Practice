package object_oriented_practice.ch12.practice08;

public class Practice8 {
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int[] scores = new int[1000];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long end = System.nanoTime();
		System.out.println("계산하기 까지 걸리 시간 : " + (end - start) + " 나노초 소요");
	}
}

// long start = System.nanoTime();
// long end = System.nanoTime();
// (start - end) = 소요된 나노초
