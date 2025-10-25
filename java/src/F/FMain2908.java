package F;

import java.io.*;
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
		} else {
			System.out.println(B);
		}

		br.close();
	}

}
