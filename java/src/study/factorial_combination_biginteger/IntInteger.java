package study.factorial_combination_biginteger;

public class IntInteger {

	public static void main(String[] args) {
		//정수형 타입 선언
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);
		
		//실수형
		Double doubleNum01 = Double.valueOf(30.11);
		
		//문자형
		Character ch = Character.valueOf('A');
		
		System.out.println("정수형1 : " + num01);
		System.out.println("정수형2 : " + num02);
		System.out.println("실수형 : " + doubleNum01);
		System.out.println("문자형 : " + ch);
		
		//int와 Integer는 객체 차이
		System.out.println(num01 == num02);
		System.out.println(num01.equals(num02));

	}

}
