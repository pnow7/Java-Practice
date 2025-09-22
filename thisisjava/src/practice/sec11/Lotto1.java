package practice.sec11;

public class Lotto1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int count = 0;
		
		while(count < 6) {
			int chk = 0; 
			
			int num = (int)(Math.random()*45+1);

			for(int i = 0; i < count; i++) { //중복체크
				if(lotto[i] == num) {    //count = 0일때 시행 X, count = 1일때 i = 0 부터 전에 나왔던 숫자 검사
					chk++;
					break;
				}
				
			}

			if(chk == 0) { //중복이 아니면
				lotto[count] = num;
				count++;
			}
			
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
