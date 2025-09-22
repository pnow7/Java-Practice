package practice.sec07;

public class Practice2 {

	public static void main(String[] args) {
		int[] scoreboard = new int[9];
		
		int[] tmp = {0,0,0,0,1,3,2,3,1};
		int[] tol = {0,2,2,0,4,1,0,0,0};
		
		int sum_tmp = 0;
		int sum_tol = 0;
		
		for(int i = 0; i < scoreboard.length; i++) {
			sum_tmp += tmp[i];
			sum_tol += tol[i];
		}
		System.out.println("템페파이 : "+sum_tmp);
		System.out.println("토론토 : "+sum_tol);
	}

}
