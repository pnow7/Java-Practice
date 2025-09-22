package practice.sec03;

public class practice48 {

	public static void main(String[] args) {
		int world = 5;
		System.out.println(world+5); //int타입인 변수 world는 5이고 5와 더하여 10을 출력후 개행
		System.out.println("world"+5); //world는 ""에 포함되어 문자열로 인식하고 그 뒤 5도 문자로 인식하여 world5로 출력후 개행
		System.out.println("world"+world); //world는 ""에 포함되어 문자열로 인식하고 그 뒤 변수 world는 5를 저장하고 있으므로 world5로 출력후 개행

	}

}
