package test.test03.test0325;
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
public class FMain1764 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		for(int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < M; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0)+1);
			if(map.get(name) == 2) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		sb.append(list.size() + "\n");
		
		for(String s : list) {
			sb.append(s + " \n");
		}
		bw.write(sb+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
