package object_oriented_practice.ch12.practice17;

import java.util.regex.Pattern;

/*
 * 정규표현식을 사용하여
 * 첫 번째는 알파벳으로 시작하고
 * 두 번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 ID값인지 검사
 * 알파벳은 모두 대소문자를 모두 허용
 */
public class PatternMatcherExample {

	public static void main(String[] args) {
		String id = "Angel1004555";
		String regExp = "[a-zA-Z][a-za-z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}

	}

}
