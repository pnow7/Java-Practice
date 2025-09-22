package object_oriented_practice.ch06_star.practice;

public class GetterSetterCar {
	
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	//speed : 대입된 값
	//this.speed : private int speed;
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}
	}
	
	public static void main(String[] args) {
		
		GetterSetterCar myCar = new GetterSetterCar();
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(150);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//private boolean stop이 true든 false든 선언하지 않음
		//stop default값은 false라서
		//if문 실행
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		
	}
	

	
	
}
