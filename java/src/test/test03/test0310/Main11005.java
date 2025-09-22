package test.test03.test0310;

import java.io.*;
import java.util.*;
//A = 65;
public class Main11005 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		StringBuilder result = new StringBuilder();
		
		//계속 나눠지는 값 n/36/36
		//몫이 0이되면 될때까지 0이 되면 종료
		
		while(n > 0) {
			int remain = n % num; //나머지가 35 -> remain = 35;
			
			char ch; 
			
			if(remain >= 10) {
				ch = (char)(remain - 10 +'A');  
				//A로 만들어주는데 A는 10값을 의미하니까 
				//-10 해서 0으로 만든후 + 'A'를 해서 대문자로 바꿔줌
			}
			else {
				ch = (char)(remain +'0'); //숫자로 만들어버리기
			}
			result.append(ch);
			n = n/num;
		}
		
		System.out.print(result.reverse());
	}

}
