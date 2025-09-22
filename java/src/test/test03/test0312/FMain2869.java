package test.test03.test0312;

import java.io.*;
import java.util.StringTokenizer;

public class FMain2869 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int result = (v-b)/(a-b);
		if((v-b)%(a-b) > 0) {
			result++;
			bw.write(result+"");
		}
		else {
			bw.write(result+"");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
