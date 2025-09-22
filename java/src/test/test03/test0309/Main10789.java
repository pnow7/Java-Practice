package test.test03.test0309;

import java.io.*;

public class Main10789 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = new String[5];
		char[][] c1 = new char[5][15];
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			s[i] = br.readLine(); //ABCDE
			max = Math.max(max, s[i].length()); //Math.max(a,b) 두수 비교
			for(int j = 0; j < s[i].length(); j++) {
				c1[i][j] = s[i].charAt(j); //s1[][] = A, B, C ,D, E 저장
			}
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(c1[j][i] != 0) { //문자가 있으면 출력, 0은 null을 의미함
					System.out.print(c1[j][i]);
				}
			}
		}
		br.close();

	}

}
