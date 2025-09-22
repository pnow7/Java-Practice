package practice.sec03;

import java.util.Scanner;
public class practice79 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pen = sc.nextInt();
		int box = sc.nextInt();
		int result_pen1 = 1000*pen;
		int result_box2 = 12*1000*box + result_pen1;
		System.out.println("총가격 : "+result_box2);
	}

}
