package test.test03.test0317;

import java.io.*;
import java.util.*;
public class Main19532 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] x = new int[6];
		
		int x1 = 0;
		int y1 = 0;
		
		for(int i = 0; i < x.length; i++) {
			x[i] = Integer.parseInt(st.nextToken());
		}

		x1 = (x[2] * x[4] - x[1] * x[5]) / (x[0] * x[4] - x[1] * x[3]);
		y1 = (x[0] * x[5] - x[2] * x[3]) / (x[0] * x[4] - x[1] * x[3]);
		
		
		System.out.println(x1 + " "+y1);
		br.close();
	}

}
