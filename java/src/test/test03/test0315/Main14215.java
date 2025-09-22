package test.test03.test0315;

import java.io.*;
import java.util.*;
public class Main14215 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a == b && a == c) {
			System.out.println(3*a);
		}
		else if(a >= b + c || b >= a + c || c >= a + b) {
			if(a >= b + c) {
				System.out.println(2*(b+c)-1);
			}
			else if(b >= a + c) {
				System.out.println(2*(a+c)-1);
			}
			else {
				System.out.println(2*(a+b)-1);
			}
		}
		else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
			System.out.println(a+b+c);
		}
		else if(a != b && b != c) {
			System.out.println(a+b+c);
		}
		
		
		br.close();
	}

}
