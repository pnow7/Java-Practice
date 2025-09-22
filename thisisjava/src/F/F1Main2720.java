package F;

import java.io.*;
public class F1Main2720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int[] coins = {25, 10, 5, 1};
		
		
		for(int i = 0; i < t; i++) {
			int money = Integer.parseInt(br.readLine());
			
			for(int coin : coins) {
				bw.write((money/coin) + " ");
				money %= coin;
			}
			bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();
	
	}

}
