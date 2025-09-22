package object_oriented_practice.ch06_star.test;

import thisisjava.ch06.exam15.Singleton;

public class SingleTon1 {
	//18
	private static SingleTon1 singleton1 = new SingleTon1();
	
	private SingleTon1() {
	}
	
	public static SingleTon1 getInstance() {
		return singleton1;
	}
	
	public static void main(String[] args) {
		SingleTon1 obj1 = SingleTon1.getInstance();
		SingleTon1 obj2 = SingleTon1.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
