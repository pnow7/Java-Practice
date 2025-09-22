package practice.sec03;

public class practice52_54 {

	public static void main(String[] args) {
		//52
		int a = 5;
		a = 6;
		a = 7;
		a = 8;
		System.out.println(a); //int 타입인 변수 a는 처음에는 5로 저장되어있었지만 변수 a를 6 -> 7 -> 8로 값을 변수 a에 저장했다. 그러므로  8을 출력하고 개행한다
		
		//53
		int a1 = 5;
		double b1 = 5.1;
		String st = "hello";
		
		System.out.println(a+b1+st); //int타입 a1과 double타입 b1을 더하면 범위가 더 큰 double로 인식하여 a1과 b1을 더한 값 13.1을 출력하고 String타입 st는 hello값이 저장되어있으므로 13.1뒤에 hello를 출력하고 개행한다
		
		//54
		int a3 = 5;
		a3 = a3 + 2;
		System.out.println(a3); //int타입 변수 a3은 5로 저장 a3을 a3과 2로 더하는것으로 재정의 -> a3은 5의 값을 가지고 있고 5에 3을 더한값 8을 a3에 다시 저장한다 저장된 8값을 가진 변수 a3(8)을 출력한다
	}

}
