package test.test03.test0300;
import java.util.Scanner;
public class Main12__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum = A + B;
			if(sum == 0) {
				break;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
