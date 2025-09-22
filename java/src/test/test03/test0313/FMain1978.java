package test.test03.test0313;

import java.io.*;
import java.util.*;
public class FMain1978 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < 2) { //1 이하 소수 X
				continue;
			}
			
			boolean chk = true;
			
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num%j == 0) {
					chk = false;
					break;
				}
			}
			
			if(chk == true) {
				count++;
			}
			
		}
		br.close();
		System.out.println(count);
		
	}

}
