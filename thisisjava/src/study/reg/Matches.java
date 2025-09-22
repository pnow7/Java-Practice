package study.reg;
//정규표현식   
import java.util.regex.Pattern;
public class Matches {

	public static void main(String[] args) {
		System.out.println(PatternCheck("aabbB")); // true
        System.out.println(PatternCheck("Aabbb")); // true
        System.out.println(PatternCheck("qwerAqeebqwer")); // true

    }
	
    public static boolean PatternCheck(String str) {
        // 다 소문자로 변환
        String string =	str.toLowerCase();
        // 패턴 정의 (a로 시작해 b로 끝나는 길이 5의 문자열 or b로 시작해 a로 끝나는 길이 5의 문자열 체크. 대소문자 상관X)
        String pattern = ".*a...b.*";
        String pattern2 = ".*b...a.*";
        // boolean 정의
        boolean first = Pattern.matches(pattern, string);
        boolean second = Pattern.matches(pattern2, string);
        // if문, boolean true면 true 반환
        if(first == true||second == true) return true;
        else return false;
    }

}
