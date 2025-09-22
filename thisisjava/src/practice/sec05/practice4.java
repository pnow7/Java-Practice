package practice.sec05;

import java.util.Scanner;
public class practice4 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		while(sum != 5) {
			int a = (int)((Math.random()*6)+1);
			int b = (int)((Math.random()*6)+1);
			sum = a+b;
			System.out.println("("+a+","+b+")");
		}
		
	}

}
