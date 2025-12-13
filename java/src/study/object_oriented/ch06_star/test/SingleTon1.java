package study.object_oriented.ch06_star.test;

/*

싱글톤 패턴: 클래스의 인스턴스를 오직 하나만 생성하도록 보장

*/

public class SingleTon1 {
	
	private static SingleTon1 singleton1 = new SingleTon1();
	
	/*
	 * 전용 생성자
	 * 이 클래스를 외부에서 new SingleTon1()과 같이 
	 * 임의로 인스턴스화하는 것을 막음
	 * 
	 * ex) 데이터베이스 연결 풀, 스레드 풀, 설정 관리자 등 
	 * -> 단 하나의 인스턴스만 존재해야하는 경우
	 */
	private SingleTon1() {
	}
	
	/*
	 * 외부에서 유일하게 싱글톤 객체를 얻을 수 있는 공식적인 통로
	 */
	public static SingleTon1 getInstance() {
		return singleton1;
	}
	
	public static void main(String[] args) {
		SingleTon1 obj1 = SingleTon1.getInstance();
		SingleTon1 obj2 = SingleTon1.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
