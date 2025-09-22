package test.test04.test0404;
/*
팩토리얼

*/
import java.io.*;
public class Main10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write(factorial(N)+"");
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
