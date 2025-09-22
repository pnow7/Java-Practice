package test.test03.test0327;

import java.io.*;
import java.util.*;
public class Main13241 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		Long num1 = Long.parseLong(st.nextToken());
		Long num2 = Long.parseLong(st.nextToken());
		
		bw.write(lcm(num1,num2)+"");
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static Long gcd(Long a, Long b) {
		while(b != 0) {
			Long r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	public static Long lcm(Long a, Long b) {
		return a*b / gcd(a,b); 
	}
}
