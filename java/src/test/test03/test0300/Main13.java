package test.test03.test0300;
import java.util.Scanner;
public class Main13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] num = new int[N];
		for(int i = 0; i<N; i++) {
			num[i] = sc.nextInt();
			if(num[i] < X) {
				System.out.print(num[i]+" ");
			}
		}
		sc.close();
	}

}
