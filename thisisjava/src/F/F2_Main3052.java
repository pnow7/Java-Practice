package F;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class F2_Main3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[42]; // num배열 0번부터 41번까지 0으로 저장
		
		for(int i = 0; i <10; i++) {
			num[Integer.parseInt(br.readLine())%42] = 1;  
		}
		//num배열에 나머지값의 번호들은 1로 저장
		//같은 나머지 값은 같은 배열이라 어쩌피 1로 저장
		
		int sum = 0;
		for(int i = 0; i < 42; i++) { 
			if(num[i] == 1) {
				sum++;
			}
		}
		bw.write(sum+"");
		br.close();
		bw.flush();
		bw.close();
	}

}
