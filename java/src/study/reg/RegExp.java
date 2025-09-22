package study.reg;

//단순한 문자열 비교 → equals(), contains()를 쓰는 게 더 효율적
//복잡한 데이터 처리 → 정규식보다 String.split(), StringTokenizer가 더 좋을 수 있음
//가독성이 중요한 경우 → 정규 표현식이 너무 길어지면 코드 가독성이 떨어질 수 있음

//"필요할 때 매우 유용하지만, 무조건 남발하지는 않는다!"
//→ 문자열 패턴 매칭이 필요한 경우엔 강력하지만, 단순한 문자열 처리에는 다른 방법이 더 효율적일 수도 있음.

import java.util.regex.*;
public class RegExp {

	public static void main(String[] args) {
		//matches(문자열 패턴 검증)
		//이메일 주소, 전화번호, 비밀번호 형식 확인
		//특정 문자 조합을 포함하는지 검사
		String email = "test@example.com";
		boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
		System.out.println(isValid); // true
		
		//replaceAll(문자열 대체)
		//특정 문자나 단어를 다른 문자로 변경
		//공백, 특수 문자 제거
		String text = "Hello,  World!  ";
		String cleaned = text.replaceAll("\\s+", " ");// 공백 여러 개를 하나로 변경
		String cleaned1 = text.replaceAll("\\s+", "");// 공백 제거
		System.out.println(cleaned); // "Hello, World!"
		System.out.println(cleaned1); // "Hello, World!"
		
		//Pattern&Matcher(문자열 추출)
		//특정 패턴을 포함한 문자열 찾기
		//HTML 태그, 특정 형식을 데이터 추출
		String text1 = "User ID: 12345, Name: John";
		Pattern pattern = Pattern.compile("\\d+"); // 숫자 찾기
		Matcher matcher = pattern.matcher(text1);

		while (matcher.find()) {
		    System.out.println(matcher.group()); // 12345 출력
		}
		
		//로그 분석, 데이터 필터링
		//특정 키워드 포함 로그만 추출
		//파일명, 경로 필터링
		String log = "ERROR 2024-03-29: Something went wrong!";
		if (log.matches(".*ERROR.*")) {
		    System.out.println("에러 로그 발견!");
		}
	}

}
