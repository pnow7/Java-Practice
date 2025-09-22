package test.test03.test0306;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FMain2908 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		//StringBuilder().reverse().toString() 
		//StringBuilder()에 st.nextToken();
		
		if(A > B) {
			System.out.println(A);
		}
		else {
			System.out.println(B);
		}
		br.close();
		
	}

}
