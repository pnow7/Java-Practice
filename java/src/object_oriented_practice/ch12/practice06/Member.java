package object_oriented_practice.ch12.practice06;

/*
 * Member 클래스에서 Object의 toString() 메소드를 오버라이딩해서 
 * MemberExample 클래스의 실행 결과처럼 나오도록 작성
 */

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + " : " + name;
	}
	
}

//@Override
//public String toString() {
//	return id + " : " + name;
//}
