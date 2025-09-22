package test.test04.test0405;
/*
약수(1과 자기자신 제외한 약수를 입력했을 때 자기자신 값은 무엇일까?)

[입력]
2
4 2

[출력]
8

[입력]
6
3 4 2 12 6 8

[출력]
24

 */
import java.io.*;
import java.util.*;
public class FMain1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(st.nextToken());

			if(N < max) max = N;			
			if(N > min) min = N;
		}
		
		bw.write(max*min+"");

		br.close();
		bw.flush();
		bw.close();
		
	}

}
