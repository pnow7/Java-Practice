package test.test03.test0323;

import java.io.*;
import java.util.*;
public class Main14425 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] str1 = new String[N];
		String[] str2 = new String[M];
		
		for(int i = 0; i < N; i++) {
			str1[i] = br.readLine();
			map.put(str1[i], i);
		}
		
		int result = 0;
		for(int i = 0; i < M; i++) {
			str2[i] = br.readLine();
			
			if(map.containsKey(str2[i])) {
				result += 1;
			}
		}
		
		bw.write(result+"");
		br.close();
		bw.flush();
		bw.close();
		
	}

}
