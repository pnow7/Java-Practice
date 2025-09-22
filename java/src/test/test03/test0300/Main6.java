package test.test03.test0300;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		String star = "";
		for(int i = 1; i<=test; i++) {
			star = star + "*";
			System.out.println(star);
		}
	}
}
