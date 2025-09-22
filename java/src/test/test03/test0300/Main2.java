package test.test03.test0300;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		sc.close();
		for(int i = 1; i<=N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum = A + B;
			System.out.println(sum);
		}
	}

}
