package test.test04.test0404;

/*
-녹색거탑

 */

import java.io.*;

public class Main24723 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		bw.write((int)Math.pow(2, N)+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
