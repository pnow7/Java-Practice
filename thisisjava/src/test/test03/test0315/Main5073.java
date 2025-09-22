package test.test03.test0315;

import java.io.*;
import java.util.*;
public class Main5073 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			else if(a >= b + c || b >= a + c || c >= a + b){
				System.out.println("Invalid");
			}
			
			else if(a == b && a == c) {
				System.out.println("Equilateral");
			}
			else if((a == b && c != a) || (a == c && b != a) || (b == c && a != b)) {
				System.out.println("Isosceles");
			}
			else if(a != b && a != c && b != c) {
				System.out.println("Scalene");
			}
					
			

		}
			
		
		br.close();
		

	}

}
