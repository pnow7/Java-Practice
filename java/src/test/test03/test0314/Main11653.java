package test.test03.test0314;

import java.io.*;
public class Main11653 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //입력값
		
		int result = 0; //몫
		int count = 2;
		
		while(true) {
			if(N == 1) {
				break;
			}
			
			if(N%count == 0) { //2로 나누어 떨어지면 //N값이 바껴야함
				N = N/count;
				System.out.println(count);
				
			}
			else {
				count++;
			}
			

		}
		br.close();
	}

}
