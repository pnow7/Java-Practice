package study.setmaphash;
/*
듣보잡

[입력]
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton

[출력]
2
baesangwook
ohhenrie
*/

import java.io.*;
import java.util.*;
public class Map2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < N; i++) {
			map.put(br.readLine(), 1);
		}
		
		
		for(int i = 0; i < M; i++) {
			String name = br.readLine();
			map.put(name,  map.getOrDefault(name, 0)+ 1);
			if(map.get(name) == 2) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		bw.write(list.size()+"\n");
		
		for(String s : list) {
			bw.write(s+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
