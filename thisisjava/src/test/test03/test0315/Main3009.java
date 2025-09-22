package test.test03.test0315;

import java.io.*;
import java.util.*;
public class Main3009 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		

		int resultx = 0;
		int resulty = 0;
		
		if(x[0] == x[1]) {
			resultx = x[2];
		}
		else if(x[0] == x[2]) {
			resultx = x[1];
		}
		else {
			resultx = x[0];
		}
		
		if(y[0] == y[1]) {
			resulty = y[2];
		}
		else if(y[0] == y[2]) {
			resulty = y[1];
		}
		else {
			resulty = y[0];
		}
		
		System.out.print(resultx+ " " +resulty);
		br.close();

	}

}
