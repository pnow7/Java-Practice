package practice.sec04;

public class practice1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //x는 전위연산 되어 바로 11, y는 후위연산 되어 그대로 10이다 z값은 11 + 20= 31으로 저장 
		System.out.println(z); //y값 없으니까 31로 저장된 z값 31 출력
	}

}
