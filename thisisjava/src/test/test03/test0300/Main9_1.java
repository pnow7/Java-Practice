package test.test03.test0300;

import java.util.Scanner;
public class Main9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mom = 0;
		int son = 0;
		sc.close();
		
		if(N>=5) { 
			mom = N/5; 
			son = (N-(mom*5))%5;  
		
			if(son > 3) {   
				mom = mom+2;
				System.out.println(mom);
			}
			else if(son == 0) {
				System.out.println(mom);
			}
			else {
				mom = mom+1;
				System.out.println(mom);
			}
		}
		else { 
			N = -1;
			System.out.println(N);
		}
	}
}

