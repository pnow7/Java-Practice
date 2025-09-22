package object_oriented_practice.ch06_star.practice;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달림");
	}
	
	static void simulate() {
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car myCar1 = new Car();
		myCar1.speed = 200;
		myCar1.run();
	}
}
