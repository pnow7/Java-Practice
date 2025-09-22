package F;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//알파벳 포함안되면 -1
//알파벳이 처음 등장하는 위치를 구분해서 출력
public class FMain10809 { 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] en = new int[26];
		
		for(int i = 0; i < en.length; i++) {
			en[i] = -1; //a부터 z까지 전부 -1로 저장
		}
		
		String st = br.readLine();
		
		for(int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i); 

			if(en[ch-'a'] == -1) {
				en[ch-'a'] = i;
			}
			//b 문자가 ch에 담겨있는경우 b-'a'또는 b-97
			//소문자 a는 아스키코드로 97을 나타냄
			//b-'a' = 1이 되고
			//en[1]는 문자 b를 가르킨다
		}
		
		for(int val : en) {
			System.out.print(val + " ");
		}
	}

}
