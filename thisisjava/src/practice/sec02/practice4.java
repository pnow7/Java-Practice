package practice.sec02;
import java.util.Scanner;
public class practice4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요:");
		String num1 = sc.nextLine();
		int A = Integer.parseInt(num1);
		

		System.out.print("두번째 숫자를 입력해주세요:");
		String num2 = sc.nextLine();
		sc.close();
		int B = Integer.parseInt(num2);
		int result = A*B;
		
		System.out.println("두 숫자의 곱은 : " + result);
		
	}

}
