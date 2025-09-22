package test.test04.test0404;

/*
Combination(조합)

 */
import java.io.*;
import java.util.*;

public class Main11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int sum = 1;
		for(int i = 0; i < K; i++) {
			sum = sum * N;
			N--;
		}
		//bw.write(factorial(N)/(factorial(N-K)*factorial(k))+"");
		bw.write(sum/factorial(K)+"");
		br.close();
		bw.flush();
		bw.close();
	}
	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}

}
