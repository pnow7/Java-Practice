package test.test03.test0302;

import java.io.BufferedReader;
import java.io.BufferedWriter; //
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; //
import java.util.StringTokenizer; //
public class Main15552 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st; //
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," "); //br.readLine()으로 입력한 값을 " " 분리 시켜입력하게 한다 
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}
