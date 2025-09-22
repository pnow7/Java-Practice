package test.test03.test0300;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main14__ { ////공백없이 입력하여 숫자합

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //5입력하고 개행
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += br.read()-'0'; //아스키코드
		}

		System.out.println(sum);

	}

}
