package practice.sec03;

public class practice31_41 {

	public static void main(String[] args) {
		//31
		System.out.println(100); //100출력 후 개행
		//32
		System.out.println(20+30); //20과 30을 더한후 개행
		System.out.println("=========================");
		
		//33
		System.out.println("20+30"); //20+30이 ""안에 포함되어 문자열로 인식 -> 20+30을 출력
		System.out.println("=========================");
		
		//34
		double a = 15.4;
		System.out.println(a);
		System.out.println("=========================");
		
		//35
		System.out.println("10"+10+20); //문자열 10을 출력하고 그뒤에 10+20을 출력한다 문자열 10으로 시작해서 전체 값이 문자열로 받는다
		System.out.println("=========================");
		
		//36
		System.out.println(10+10+"20"); // 10+10인 20을 출력하고 문자열 20을 출력한다
		System.out.println("=========================");
		
		//37
		System.out.println(2+6*(4*2)); //맨 안쪽 괄호 4*2 = 8 곱셈부터 시작 -> 8*6 = 48 -> 48+2=50을 출력
		System.out.println("=========================");
		
		//38
		System.out.println("2*(4+3+2)+(4+1*2)"); //""안에 포함되어 문자열로 인식 -> 2*(4+3+2)+(4+1*2)그대로 출력
		System.out.println("=========================");
		
		//39
		System.out.println("(5*3)"); //""안에 포함되어 문자열로 인식 -> (5*3) 출력
		System.out.println("=========================");
		
		//40
		System.out.println("7+3="+(7+3)); //문자열 7+3을 출력하고 7+3이 괄호로 되어있어 int로 인식하여 10을 출력한다
		System.out.println("=========================");
		
		//41
		System.out.println("7+3="+7+3); //문자열 7+3=을 출력하고 괄호가 아닌 문자열로 시작했기때문에 문자그대로 7과 3을 출력한다
		
		
		
		

	}

}
