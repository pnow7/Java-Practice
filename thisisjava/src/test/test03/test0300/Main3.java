package test.test03.test0300;
import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// sc.hasNext() 값이 있으면 true, 없으면 false
		// EOF(End Of File)
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
	}
}
