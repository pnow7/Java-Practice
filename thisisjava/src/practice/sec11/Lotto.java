package practice.sec11;

public class Lotto {

	public static void main(String[] args) {
		int num;
		int count = 0;
		
		while(true) {
			int[] chk = new int[46]; 
			count = 0;
			for(int i = 0; i < 6; i++) {
				num = (int)(Math.random()*45+1);
				chk[num]++;
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
				for(int i = 0; i < chk.length; i++) {
					if(chk[i] == 1) {
						System.out.print((i)+ " ");
					}
				}
				break;
			}

		}
		
	}

}
