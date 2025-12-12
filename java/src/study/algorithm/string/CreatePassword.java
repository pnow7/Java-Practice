package study.algorithm.string;

/*
- 비밀번호 발음하기

높은 품질을 가진 비밀번호의 조건은 다음과 같다.

모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.

마지막 테스트 케이스는 end이며, 패스워드는 한글자 이상 20글자 이하의 문자열이다. 
또한 패스워드는 대문자를 포함하지 않는다.

[입력]
a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
end

[출력]
<a> is acceptable.
<tv> is not acceptable.
<ptoui> is not acceptable.
<bontres> is not acceptable.
<zoggax> is not acceptable.
<wiinq> is not acceptable.
<eep> is acceptable.
<houctuh> is acceptable.

*/

import java.io.*;

public class CreatePassword {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String pwd = br.readLine();

			if (pwd.equals("end")) {
				break;
			}
			
			boolean availablePwd = checkPwd(pwd);
			
			sb.append("<").append(pwd).append("> is ");
            if (availablePwd) {
                sb.append("acceptable.").append("\n");
            } else {
                sb.append("not acceptable.").append("\n");
            }
		}
		
		System.out.print(sb.toString());
		br.close();
	}
	
	// 모음 판별
	private static boolean isParent(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		
		return false; 
	}
	
	// 비밀번호 판단
	private static boolean checkPwd(String pwd) {
		boolean hasParent = false;
		int parentCount = 0;
		int childCount = 0;
		
		char prevCh = 0;
		
		for (int i = 0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			
			if (isParent(ch)) {
				hasParent = true;
			}
			
			if (isParent(ch)) {
				parentCount++;
				childCount = 0;
			} else {
				parentCount = 0;
				childCount++;
			}
		
			if (parentCount >= 3 || childCount >= 3) {
				return false;
			}
			
			if (prevCh != 0) {
				if (ch == prevCh) {
					if (!(ch == 'e' || ch == 'o')) {
						return false;
					}
				}
			}
			
			prevCh = ch;
		}
		
		if (!hasParent) return false; 
		
		return true;
	}

}