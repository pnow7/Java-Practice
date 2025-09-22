package object_oriented_practice.ch06_star.practice;

public class MiniCar {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없음");
			return false;
		}
		System.out.println("gas가 있음");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달림. (gas 잔량 : " + gas + " )");
				gas -= 1;
			}
			else {
				System.out.println("멈춤. (gas 잔량 : " + gas + " )");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		MiniCar car = new MiniCar();
		
		car.setGas(10);
		
		if(car.isLeftGas()) {
			System.out.println("\n출발");
			car.run();
		}
		System.out.println("\ngas를 넣어");
	}
}
