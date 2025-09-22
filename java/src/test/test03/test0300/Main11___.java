package test.test03.test0300;
import java.util.Scanner;
public class Main11___ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int cnt = 0;

		while(N != 1) {
			if(N%3==0) { 
				N = N/3; 
				cnt++;
				System.out.print(N+"->");
			}
			else { 
				if((N%2==0) && (N%3==0)) { //2로도 나눠지고 3으로도 나눠질때 
					N = N/3;
					cnt++;
					System.out.print(N+"->");
				}
				else if((N%2 == 0) && (N%3 != 0)) { //2로는 나눠지고 3으로 안나눠질때
					if((N-1)%3 == 0) {
						if(((N-1)/3)%3 == 0) {
							N--;
						}
						else {
							N=N/2;
						}
					}
					cnt++;
					System.out.print(N+"->");
				}
				else {
					N--;
					cnt++;
					System.out.print(N+"->");
				}
				System.out.print(N+"->");
			}
		}

		System.out.println(cnt);	
	}
}
