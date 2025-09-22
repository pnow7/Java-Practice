package test.test03.test0327;

/*
최소공배수

[입력]
3
1 45000
6 10
13 17

[출력]
45000
30
221*/
import java.io.*;
import java.util.*;
public class FMain1934 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; 
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int num1, num2;
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			
			sb.append(num1*num2/gcd(num1, num2)+"\n");
			
		}
		bw.write(sb+"");
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	//최대공약수 greatest common divisor(gcd)
	//gcd(a,b) = gcd(b,r)
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	
	//최소공배수 least common multiple(lcm)
	public static int lcm(int a, int b) {
		return a * b / gcd(a,b);
	}

}
