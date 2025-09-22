package test.test03.test0303;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main5597 { //과제 안 내신 분

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] student = new int[30];
		
		for(int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			student[num-1] = 1;   //입력한 3의 값이 student[2] 로 들어가야한다
		}
		for(int j = 0; j < 30; j++) {  //student 배열을 0번 부터 29번까지 검사하여 0인 값을 출력
			if(student[j] == 0) { //숫자 0이 나오는 배열 찾기
				bw.write((j+1)+"\n");
			} 
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
