package test.test03.test0312;

import java.util.*;
public class Main5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double z = a/b;
			double z1 = a%b;
			if(Double.isInfinite(z) || Double.isNaN(z1)) {
				break;
			}
			else {
				if(b%a == 0 && a != b) {
					System.out.println("factor");
				}
				else if(a%b == 0 && a != b) {
					System.out.println("multiple");
				}
				else {
					System.out.println("neither");
				}
			}
			
		}
	
	}

}
