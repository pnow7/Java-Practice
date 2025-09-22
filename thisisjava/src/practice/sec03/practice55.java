package practice.sec03;

public class practice55 {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		System.out.println(sum); //int 타입 변수 sum은 0으로 정의 -> 0과 1을 더한 값을 sum에 저장 -> 1값을 출력후 개행
		sum = sum + 2;
		System.out.println(sum); //sum은 1값으로 유지 -> 1과 2를 더하여 3을 출력후 개행
		sum = sum+3;
		System.out.println(sum); //sum은 3값 가지고 3과 더하여 6을 출력후 개행
		int a = 5;
		sum = a + 5;
		System.out.println(sum); //int 타입 변수 a는 5로 정의 -> sum은 6값을 가지고 있지만 a+5로 인해 10으로 저장 -> 10을 출력후 개행 
		a = 7;
		sum = sum + a;
		System.out.println(sum); //변수 a는 5에서 7값으로 저장 -> sum은 10값을 가지고 있고 a는 7로 새로 저장되어 10과 7을 더한 17을 출력후 개행

	}

}
