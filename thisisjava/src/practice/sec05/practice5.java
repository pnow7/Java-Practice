package practice.sec05;

public class practice5 {

	public static void main(String[] args) {
		
		int mulx = 0;
		int muly = 0;
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				mulx = 4*x;
				muly = 6*y;
				if(mulx + muly == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
