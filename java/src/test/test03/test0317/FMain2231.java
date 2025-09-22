package test.test03.test0317;

//216
//198
//아니면 0
import java.io.*;
public class FMain2231 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for(int i = 1; i <= N; i++) {
			int sum = i;
			
			String str = String.valueOf(i);
			
			for(int j = 0; j < str.length(); j++) {
				sum += str.charAt(j) - '0';
				//sum += Integer.parseInt(String.valueOf(str.charAt(j)));
				//sum += Integer.parseInt(str.substring(j, j+1));
			}
			
			if(sum == N) {
				System.out.println(i);
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println(0);
		}
		
		br.close();
	}


}

