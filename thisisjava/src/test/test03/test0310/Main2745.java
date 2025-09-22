package test.test03.test0310;

import java.io.*;
import java.util.*;
//10진법 변환
//아스키코드 A = 65, Z = 90, a = 97
//36으로 곱해줌
//ZZZZZ 36진법
//Z = 35
//35*36^4 + 35*36^3 .... + 35*36^0

public class Main2745 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken(); //값
		int num = Integer.parseInt(st.nextToken()); //진수값
		int total = 0;
		
		for(int i = 0; i < n.length(); i++) { //0~5 01234  
			char ch = n.charAt(i);
			int result;
			
			//대문자가 있으면 0 = 48 1 = 49 2 = 50//
			if(ch >= 'A' && ch <= 'Z') {
				result = ch-'A'+10;  // A이면 result = 10
			}
			else { //숫자라면
				result = ch-'0';
			}
			total += result*Math.pow(num, n.length()-(i+1));
		}
		
		System.out.print(total);

	}

}
