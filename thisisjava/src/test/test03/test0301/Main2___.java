package test.test03.test0301;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2___ { //25304 영수증
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int money = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		
		int sum = money * num;
		
		int money1[] = new int[2];
		int sum1 = 1;
		for(int i = 0; i<2; i++) {
			money1[i] = Integer.parseInt(st.nextToken());
			sum1 = sum1 * money1[i]; 
		}
		System.out.println(sum1);
		
		
		
		
		//System.out.println(sum);
		
		
		
				
				
	}
	

}
