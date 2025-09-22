package study.setmaphash;

import java.io.*;
import java.util.*;
public class Map1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int[] chk = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			num[i] = chk[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(chk);
		
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int i = 0; i < N; i++) {
			if(!map.containsKey(chk[i])) {
				map.put(chk[i], idx++);
			}
		}
		
		for(int i = 0; i < N; i++) {
			bw.write(map.get(num[i]) + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
