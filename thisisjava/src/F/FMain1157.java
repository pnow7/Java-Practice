package F;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class FMain1157 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alp = new int[26]; //0부터 25까지 0으로 초기화
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			//대문자 범위이면 
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				alp[s.charAt(i)-65]++; //(숫자형으로 바꿔주는 방법) A가 아스키코드로 65, A-65=0이므로 0번째 인덱스 에서 +1
			}
			//소문자 범위이면
			else {
				alp[s.charAt(i)-97]++;
			}
			
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < alp.length; i++) {
			if(alp[i] > max) { //alp[0] > -1 보다 항상큼 //max값은 alp[0]에 저장된값으로 변경
				max = alp[i];
				ch = (char)(i+65); //대문자 출력이니까 65더해주기
			}
			else if(alp[i] == max) { //같으면 ?를 ch에 저장
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
