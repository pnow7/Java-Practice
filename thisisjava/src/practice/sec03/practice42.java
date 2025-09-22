package practice.sec03;

public class practice42 {

	public static void main(String[] args) {
		byte a1 = 10;
		byte a2;
		a2 = 11;
		System.out.println(a1); //바이트 단위인 a1값 10 출력후 개행
		System.out.println(a2); //바이트 단위인 a2값이 11로 저장되어 a2값 11 출력후 개행
		System.out.println(a1+a2); //a1은 10 a2는 11이다 10+11하여 21을 출력후 개행
		System.out.println(a1+1); //a1은 10에 +1을 하여 11을 출력후 개행
		
		short b1 = 10;
		short b2;
		b2 = 11;
		System.out.println(b1); //숄트 단위인 a1값 10 출력후 개행
		System.out.println(b2); //숄트 단위인 a2값이 11로 저장되어 a2값 11 출력후 개행
		System.out.println(b1+b2); //a1은 10 a2는 11이다 10+11하여 21을 출력후 개행
		System.out.println(b1+1); //a1은 10에 +1을 하여 11을 출력후 개행
		
		int c1 = 10;
		int c2;
		c2 = 11;
		System.out.println(c1); //인트 단위인 a1값 10 출력후 개행
		System.out.println(c2); //인트 단위인 a2값이 11로 저장되어 a2값 11 출력후 개행
		System.out.println(c1+c2); //a1은 10 a2는 11이다 10+11하여 21을 출력후 개행
		System.out.println(c1+1); //a1은 10에 +1을 하여 11을 출력후 개행
		
		long d1 = 10L;
		long d2;
		d2 = 11L;
		System.out.println(d1); //롱 단위인 a1값 10 출력후 개행
		System.out.println(d2); //롱 단위인 a2값이 11로 저장되어 a2값 11 출력후 개행
		System.out.println(d1+d2); //a1은 10 a2는 11이다 10+11하여 21을 출력후 개행
		System.out.println(d1+1); //a1은 10에 +1을 하여 11을 출력후 개행
		//정수 출력
		
		float e1 = 10.23f;
		float e2;
		e2 = 11.f;
		System.out.println(e1); //float 단위인 a1값 10.23 출력후 개행
		System.out.println(e2); //float 단위인 a2값이 11.0로 저장되어 a2값 11.0 출력후 개행
		System.out.println(e1+e2); //a1은 10.23f a2는 11.f이다 10.23+11.f하여 21.23을 출력후 개행
		System.out.println(e1+1); //a1은 10.23에 +1을 하여 11.23을 출력후 개행
		
		double f1 = 10.23;
		double f2;
		f2 = 11.94;
		System.out.println(f1); //double 단위인 a1값 10.23 출력후 개행
		System.out.println(f2); //double 단위인 a2값이 11.94로 저장되어 a2값 11.94 출력후 개행
		System.out.println(f1+f2); //a1은 10.23 a2는 11.94이다 10.23+11.94하여 22.17을 출력후 개행
		System.out.println(f1+1); //a1은 10.23에 +1을 하여 11을 출력후 개행
		//실수 출력
		
		String st1 = "Hello";
		String st2 = "World";
		System.out.println(st1); //st1은 문자열 타입에 문자열 Hello가 저장되어있다 저장된 Hello 출력후 개행 
		System.out.println(st1 + "world"); //st1은 저장된 Hello출력하고 문자열 "world"가 더해 Helloworld출력후 개행
		System.out.println(st1+st2); //변수 st1은 문자열 Hello저장, 변수 st2는 문자열 World저장 변수st1과 st2를 출력하여 Helloworld출력후 개행 
		st1 = "new Word";
		String str3 = st1+st2;
		System.out.println(str3); //변수 str3은 st1에 저장된 Hello가 아닌 st1이 새로 정의한 값 문자열 "new World"가 저장되고 st2에 저장된 World와 합쳐(변수끼리 더하여) new WordWorld출력후 개행
		

	}

}
