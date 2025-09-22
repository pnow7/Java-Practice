package object_oriented_practice.ch06_star.practice;

/*
 * Get, Set
 * 클래스 필드에서는 보통 private로 선언해서 외부에서 직접 접근하지 못하게 감춘다.
 * 대신, 필드 값을 읽거나 바꾸고 싶을 때는 getter와 setter 메서드를 통해 간접 접근한다.
 * 
 * Getter : 필드 값을 읽어오는 메서드 public [type] get[필드명]()
 * Setter : 필드 값을 수정하는 메서드 public [type] set[필드명]([타입 값])
 * 
 * 사용하는 이유
 * - 데이터 보호 : 직접 필드에 접근을 막아서 무분별한 변경을 방지하기 위해
 * - 검증 및 제어 : setter 안에서 값을 검증하거나 조작 가능(age가 음수면 안되는 것처럼)
 * - 유지보수성 증가 : 내부 구현을 바꿔도 외부 코드에 영향 최소화
 * - 캡슐화 원칙 준수 : 객체의 데이터를 외부에 감추고 메서드를 통해 제어
 * 
 * Getter, Setter 단축키
 * : Alt + Shift + S -> R
 */


public class GetterAndSetter {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;			
		}
	}
	
	public static void main(String[] args) {
		GetterAndSetter person = new GetterAndSetter();
		person.setName("박현재");
		System.out.println(person.getName());
	}
	
}
