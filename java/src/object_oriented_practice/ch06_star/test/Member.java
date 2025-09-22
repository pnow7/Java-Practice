package object_oriented_practice.ch06_star.test;

public class Member {
	//13
	String name;
	String id;
	String pwd;
	int age;
	
	//14
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		Member user1 = new Member("박현재", "Park");
	}
}
