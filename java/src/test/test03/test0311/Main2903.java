package test.test03.test0311;

/*정사각형 만드는 점의 개수 구하기*/
import java.io.*;

public class Main2903 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int sum1 = 2;
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			sum = (sum1 + (sum1-1)); 
			result = (int)Math.pow(sum, 2);
			sum1 = (int)Math.sqrt(result);
		}

		
		System.out.println(result);
		br.close();
		

	}

}
