package test.test03.test0311;

import java.io.*;
public class Main2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		//행만 지정, 열은 지정안해도됨 -> 나중에 지정하겠다라는 의미
		int[][] bee = new int[n][]; 
		int value = 1;
		
		
		for(int i = 0; i < n; i++) {
			
			int cols = (i==0) ? 1 : i*6;;
			
			bee[i] = new int[cols];
			
			for(int j = 0; j < cols; j++) {
				bee[i][j] = value++;
				
				 if(n == value){ 
					 System.out.print(i+1); 
					 break; 
				 }
				 
			}
		}

		br.close();
	}

}
