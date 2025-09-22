package test.test09.test0912;

/*

[입력]
seungjaehwang
4
a 0 5
a 0 6
a 6 10
a 7 10

[출력]
0
1
2
1

*/

import java.io.*;
import java.util.*;

public class Main16139 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String name = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int count;
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			
			String token = st.nextToken();
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			char alpha = token.charAt(0);
			
			for(int j = first; j <= second; j++) {
				if(name.charAt(j) == alpha) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		
		System.out.print(sb);
		br.close();
		
	}

}