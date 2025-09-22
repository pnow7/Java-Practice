package practice.sec03;

public class practice80 {

	public static void main(String[] args) {
		double pizza20 = 3.141592 * 20 * 20*2;
		double pizza30 = 3.141592 * 30 * 30;
		System.out.println("20cm 피자 2개의 면적은"+pizza20);
		System.out.println("30cm 피자 1개의 면적은"+pizza30);
		String result = (pizza20 < pizza30) ? "30cm 피자 1개를 주문 하는게 더 좋아요~~~" : ("");
		System.out.println(result);

	}

}
