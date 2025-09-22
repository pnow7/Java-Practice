package practice.sec02;

public class practice3 {

	public static void main(String[] args) {
		double d = 85.4; //변수 d는 값 85.4
		int score = (int) d; // 변수 d를 double형에서 int형으로 변수 score에 저장
		System.out.println("score="+score); //int형으로 변환된 d값이 score에 저장되어 score값 출력 -> 85.4가 아닌 85로 출력
		System.out.println("d="+d); //d값은 여전히 double형이므로 그대로 d값 85.4 출력
		System.out.println("=======================");
		
		byte a = 10; //2진수로 0000 1010
		byte b = 30; //2진수로 0001 1110
		byte c = (byte)(a*b); 
		//a와 b를 곱하면 300인데 byte 단위에서는 최소 -128에서 최대 127값까지만 허용
		//a와 b를 곱한 값은 최대허용값 127을 초과한다
		//300 = 127(byte 최대 허용값) + 173 
		//127에서 1 더하면 -128
		//127에서 1을 더했으니까 173에서 -1을 해주면 172
		//-128과 172를 더하면 44
		//byte에서 300은 44를 출력한다
		System.out.println(c);
		System.out.println("=======================");
		
		double num1 = 1.2345; //num1은 double형인 1.2345
		int num2 = 6; //num2는 int형인 6
		System.out.println(num1 + num2); //double형과 int형을 더하면 int형이 double로 자동연산되어 7.2345가 출력
	}

}
