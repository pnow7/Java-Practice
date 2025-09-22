package test.test03.test0315;

import java.io.*;
import java.util.*;
public class Main1085 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] result = new int[4];
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		result[0] = x;
		result[1] = y;
		result[2] = h - y;
		result[3] = w - x;
		
		int min = result[0];
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] < min) {
				min = result[i];
			}
		}
		
		System.out.println(min);
		br.close();
	}

}
