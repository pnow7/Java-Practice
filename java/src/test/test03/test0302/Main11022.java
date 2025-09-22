package test.test03.test0302;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sum = A + B;
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+sum);
		}
		br.close();
		
	}

}
