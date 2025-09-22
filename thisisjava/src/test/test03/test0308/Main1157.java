package test.test03.test0308;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alp = new int[26]; //알파벳 개수 : 26개 0번부터 25번까지 0으로 저장 
		String s = br.readLine(); //입력
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) { // 대문자범위이면
				alp[s.charAt(i)-'A']++; //뽑아낸 문자가 A이면 A를 빼주면 alp[0]에 +1을 한다
			}
			else {
				alp[s.charAt(i)-'a']++; //소문자이면 
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < alp.length; i++) {
			if(alp[i] > max) {
				max = alp[i];
				ch = (char)(i + 65); //대문자로 출력해야 하니까
			}
			else if(alp[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		br.close();

	}

}
