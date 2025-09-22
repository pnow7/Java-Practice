package test.test03.test0311;
/*
리암은 거스름돈을 주는 것을 자꾸 실수한다.


심지어 $0.5달러를 줘야하는 경우에 거스름돈으로 $5달러를 주는것이다!

거스름돈의 액수가 주어지면 리암이 줘야할 

쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 
구하는 프로그램을 작성하시오. 

거스름돈은 항상 $5.00 이하이고, 

손님이 받는 동전의 개수를 최소로 하려고 한다. 

예를 들어, $1.24를 거슬러 주어야 한다면, 
손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.

3
124
25
194

4 2 0 4
1 0 0 0
7 1 1 4
*/
import java.io.*;

public class Main2720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(br.readLine());
		int[] money = new int[3];
		int[][] coin = new int[t][4];
		int[] coins = {25, 10, 5, 1};
		int result = 0;
		
		for(int i = 0; i < t; i++) {
			money[i] = Integer.parseInt(br.readLine());
			coin[i][0] = money[i]/coins[0];
			
			for(int j = 1; j < 4; j++) {
				result += coin[i][j-1]*coins[j-1];
				coin[i][j] = (money[i]-(result))/coins[j];
				System.out.println("result : "+result);
			}
			result = 0;
		}

		for(int i = 0; i < t; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(coin[i][j]+" ");
			}
			System.out.println("");
		}
		br.close();
	
	}

}

