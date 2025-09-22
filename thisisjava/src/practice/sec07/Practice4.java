package practice.sec07;

import java.util.Scanner;
public class Practice4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		System.out.print("숫자 5개 입력 : ");
		
		for(int i = 0; i < num.length; i++) {
			String a = sc.nextLine();
			int num1 = Integer.parseInt(a);
			num[i] = num1;
		}
		
		System.out.println("숫자 하나를 입력 : ");
		String b = sc.nextLine();
		int num2 = Integer.parseInt(b);
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == num2) {
				System.out.println("입력한 숫자는 배열 "+i+"번째에 있음");
				break;
			}
			else {
				for(int j = i; j < num.length;) {
					if(num[j] != num2){
						System.out.println("입력한 숫자는 배열 "+j+"번재에 없는 값");
						break;
					}
					break;
				}
			}
		}
		
		
	
		sc.close();
		
	}
}
