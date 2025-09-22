package test.test03.test0316;

import java.io.*;
import java.util.*;
public class Main24313 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		if(a*d + b <= c*d && c >= a) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		br.close();
	}

}
