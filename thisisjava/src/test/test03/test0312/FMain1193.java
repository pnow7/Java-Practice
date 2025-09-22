package test.test03.test0312;

import java.io.*;
//등차수열
public class FMain1193 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int line = 0;
		int sum = 0;
		
		while(sum < n) { //라인찾기 
			line++;
			sum += line; //0부터 n까지 더하기
		}
		
		int indexLine = n - (sum - line);
		
		int son, mom;
		
		if(line % 2 == 0) {
			son = indexLine;
			mom = line - indexLine + 1;
		}
		else {
			son = line - indexLine+1;
			mom = indexLine;
		}
		
		System.out.println(son + "/" + mom);
		br.close();
	}
}