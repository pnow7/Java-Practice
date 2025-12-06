package study.review.bronze.string;

/*
- !밀비 급일

당신은 길을 가다가 이상한 쪽지를 발견했다. 
그 쪽지에는 암호가 적혀 있었는데, 똑똑한 당신은 암호가 뒤집으면 해독된다는 것을 발견했다.

[입력]
!edoc doog a tahW
noitacitsufbo
erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW
lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC
END

[출력]
What a good code!
obfustication
We intend to begin on the first of February unrestricted submarine warfare
Concealed within his fortress, the lord of Mordor sees all

*/

import java.io.*;

public class ReverseSentence {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String s = br.readLine();
			
			if (s.equals("END")) break;
			
			StringBuilder answer = new StringBuilder(s).reverse();
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
