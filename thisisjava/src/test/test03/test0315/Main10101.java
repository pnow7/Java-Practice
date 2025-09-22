package test.test03.test0315;

import java.io.*;
public class Main10101 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		}
		else if((a+b+c == 180) && (a == b || a == c || b == c)) {
			System.out.println("Isosceles");
		}
		else if((a+b+c == 180) && (a != b && a != c)) {
			System.out.println("Scalene");
		}
		else if(a+b+c != 180) {
			System.out.println("Error");
		}
		br.close();
	}

}
