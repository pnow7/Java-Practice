package F;

import java.io.*;
public class FMain2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;
		int range = 2;
		
		if(n == 1) { //1인경우
			System.out.print(1);
		}
		else { //2보다 큰경우 ex)30
			while(range <= n) {
				range = range + (count*6);
				count++;
			}
			System.out.print(count);
		}
		br.close();
		
	}

}
