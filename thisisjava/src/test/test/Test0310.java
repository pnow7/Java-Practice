package test.test;

import java.util.Scanner;

public class Test0310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 투수 : 0번부터 9번까지 0
		int[] man = new int[10];
		
		//사용자 : 0번부터 9번까지 0
		int[] user = new int[10]; 
		
		//타자 : 0번부터 8번까지 9명
		String[] name = new String[9];
		
		//0부터 8번까지 타자의 안타횟수 저장
		int[] chk = new int[9];
		
		//0부터 8번까지 타석수 저장
		int[] chk1 = new int[9]; 
		
		// 변수 : out(아웃) 선언
		int out = 0; 
		
		System.out.print("타자 9명 등록 해주세요 ");
		
		//타자 9명 타자 등록
		for(int j =0; j < 9; j++) { 
			name[j] = sc.nextLine();
			System.out.print((j+1)+"번째 선수 : "+ name[j] + " ");
			System.out.println("");
		}
		
		//아웃에서 끝나면 끝난 타자 다음 번 타자 나와야함
		int last = 0;
		
		//3회까지
		for(int i = 0; i < 3; i++) {  
			System.out.print((i+1+"회 시작, 숫자 입력 : "));
			System.out.println("");
			out = 0;

			for(int k = last; k < 9+last; k++) {
				//투수 : 0번부터 9번까지, 1부터 10까지 난수 저장
				//man[0] = 1~10 랜덤 수 = 2
				man[k%10] = (int)(Math.random()*10+1);  
				
				//사용자 : 0번부터 9번까지 입력한 값 저장
				//2
				String s = sc.nextLine();      
				//user[0] = 2
				user[k%10] = Integer.parseInt(s);  
				
				System.out.print(((k%9)+1)+"번째 선수 : "+ name[k%9] + " ");
				
				//동일하면 안타
				if(man[k%10] == user[k%10]) {
					//안타값 저장
					chk[k%9]++; 
					System.out.println("안타");
					//타석값 저장 //0
					chk1[k%9]++; 
				}
				//다르면 아웃
				else { 
					out++;
					System.out.println("아웃");
					//타석값 저장
					chk1[k%9]++; 
				}
				
				if(out == 3) {
					//아웃된 선수의 + 1한값 last에 저장
					last = (k%10)+1;  
					break;
				}
			}
			//1회 끝나면 아웃 횟수 0으로 초기화
			out = 0; 
			System.out.println("");
			
		}
		sc.close();
		
		//타자 9명 출력과 타율 계산
		for(int j =0; j < 9; j++) { 
			double result = (double)chk[j%9]/(double)chk1[j%9];
			System.out.printf("타순 : "+(j+1)+"번 | "+"타자 이름 : "+name[j]+" | 타율 : %.3f\n",result);
		}

	}

}

