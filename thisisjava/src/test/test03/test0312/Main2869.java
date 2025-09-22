package test.test03.test0312;

import java.io.*;
import java.util.*;
public class Main2869 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			count++;
			sum += a; 
			
			if(sum >= v) {
				break;
			}
			sum -= b;
		}
		bw.write(count+"");
		br.close();
		bw.flush();
		bw.close();
	
	}

}
