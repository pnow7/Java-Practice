package test.test03.test0303;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class F1_Main3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] num = new boolean[42]; //0번 부터 41번 까지 false로 저장
		
		for(int i = 0; i <10; i++) {
			num[Integer.parseInt(br.readLine())%42] = true; 
		}
		//입력한 값의 나머지들은 num 배열에 true로 저장
		//ex) 값이 2이면 num[2] = true
		
		int sum = 0;
		for(boolean value : num) { //true
			if(value) {
				sum++;
			}
		}
		bw.write(sum+"");
		br.close();
		bw.flush();
		bw.close();
	}

}
