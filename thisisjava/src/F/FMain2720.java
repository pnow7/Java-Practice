package F;

import java.io.*;
public class FMain2720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] money = new int[t];
		int[][] coin = new int[t][4];
		int[] coins = {25, 10, 5, 1};
		
		
		for(int i = 0; i < t; i++) {
			money[i] = Integer.parseInt(br.readLine());
			int result = money[i];
			
			for(int j = 0; j < 4; j++) {
				coin[i][j] = result/coins[j];
				result = result%coins[j];	
			}
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
