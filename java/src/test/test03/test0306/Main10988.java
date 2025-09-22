package test.test03.test0306;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main10988 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		String B = new StringBuilder(A).reverse().toString();
		
		if(A.equals(B)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}

	}

}
