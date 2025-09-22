package test.test03.test0305;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main2675 { //똑같은 문자 추력

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken()); //반복횟수
			String st1 = st.nextToken(); //문자열 입력
			
			for(int j = 0; j <st1.length(); j++) {
				char ch = st1.charAt(j); //문자열 첫번째부터 문자열 끝번째까지 ch에 저장
				for(int k = 1; k <= R; k++) {
					System.out.print(ch);
				}
			}
			System.out.println("");
		}
		br.close();

	}

}
