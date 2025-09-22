package object_oriented_practice.ch06_star.practice;

public class InstanceAndStatic {
	//인스턴스 변수
	//클래스의 객체(인스턴스)가 생성될 때마다 개별적으로 존재하는 멤버
	int instanceMember = 10;
	
	//인스턴스 메서드
	void instanceMethod() {
		System.out.println("This is an instance method");
	}
	
	static int staticVariable = 100;
	
	static void staticMethod() {
		System.out.println("This is a static method");
	}
	
	public static void main(String[] args) {
		//객체를 생성해야 접근할 수 있음
		//각 객체마다 서로 다른 값을 가질 수 있음
		InstanceAndStatic obj = new InstanceAndStatic();
		System.out.println(obj.instanceMember);
		obj.instanceMethod();
		
		//
		System.out.println(staticVariable);
		staticMethod();
	}
}
