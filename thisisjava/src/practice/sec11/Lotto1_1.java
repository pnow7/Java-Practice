package practice.sec11;

public class Lotto1_1 {

	public static void main(String[] args) {
		int num;
		int count = 0;
		int[] result = new int[6];
		while(true) {
			int[] chk = new int[46]; 
			count = 0;
			for(int i = 0; i < 6; i++) {
				num = (int)(Math.random()*45+1);
				chk[num]++;
				result[i] = num;
			}
			
			for(int i = 0; i < chk.length; i++) {
				if(chk[i] == 1) {
					count++;
				}
				else if(chk[i] >= 2) { //0 일수도 있으니까
					break;
				}
			}
			
			if(count == 6) {
				for(int i = 0; i < 6; i++) {
					System.out.print(result[i] + " ");
				}
				break;
			}

		}
		
	}

}
